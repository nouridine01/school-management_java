package com.noor.school.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.noor.school.entities.Edt;
import com.noor.school.exceptions.EdtNotFoundException;
import com.noor.school.repositories.EdtRepository;

@CrossOrigin("*")
@RestController
public class EdtController {
	EdtRepository repository;

    public EdtController(EdtRepository edtRepository) {
        this.repository=edtRepository;
    }



    @GetMapping("/edts")
    List<Edt> all() {
      return repository.findAll();
    }

    @PostMapping("/edts")
    Edt newEdt(@RequestBody Edt newEdt) {
      return repository.save(newEdt);
    }

    // Single item

    @GetMapping("/edts/{id}")
    Edt one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new EdtNotFoundException(id));
    }

    @PutMapping("/edts/{id}")
    Edt replaceEdt(@RequestBody Edt newEdt, @PathVariable Long id) {

      return repository.findById(id)
        .map(edt -> {
        	edt.setLibelle_edt(newEdt.getLibelle_edt());
        	edt.setDebut_edt(newEdt.getDebut_edt());
        	edt.setFin_edt(newEdt.getFin_edt());
        	edt.setCours(newEdt.getSeances());
          return repository.save(edt);
        })
        .orElseGet(() -> {
          newEdt.setId(id);
          return repository.save(newEdt);
        });
    }

    @DeleteMapping("/edts/{id}")
    void deleteEdt(@PathVariable Long id) {
      repository.deleteById(id);
    }

 @RequestMapping(value="/Chercheredt",method=RequestMethod.GET)
  public Page<Edt> chercher(
	@RequestParam(name="mc", defaultValue="") String mc, 
	@RequestParam(name="page", defaultValue="0") int page, 
	@RequestParam(name="size", defaultValue="5") int size){
   return repository.chercher("%"+mc+"%",PageRequest.of(page,size));
	 
}	

}
