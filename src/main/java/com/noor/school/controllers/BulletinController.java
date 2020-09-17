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

import com.noor.school.entities.Bulletin;
import com.noor.school.exceptions.BulletinNotFoundException;
import com.noor.school.repositories.BulletinRepository;

@CrossOrigin("*")
@RestController
public class BulletinController {
	BulletinRepository repository;

    public BulletinController(BulletinRepository bulletinRepository) {
        this.repository=bulletinRepository;
    }



    @GetMapping("/bulletins")
    List<Bulletin> all() {
      return repository.findAll();
    }

    @PostMapping("/bulletins")
    Bulletin newBulletin(@RequestBody Bulletin newBulletin) {
      return repository.save(newBulletin);
    }

    // Single item

    @GetMapping("/bulletins/{id}")
    Bulletin one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new BulletinNotFoundException(id));
    }

    @PutMapping("/bulletins/{id}")
    Bulletin replaceBulletin(@RequestBody Bulletin newBulletin, @PathVariable Long id) {

      return repository.findById(id)
        .map(bulletin -> {
        	bulletin.setLibelle_bulletin(newBulletin.getLibelle_bulletin());
        	bulletin.setDate_livraison(newBulletin.getDate_livraison());
        	bulletin.setNotes(newBulletin.getNotes());
        	bulletin.setSemestre(newBulletin.getSemestre());
        	
          return repository.save(bulletin);
        })
        .orElseGet(() -> {
          newBulletin.setId(id);
          return repository.save(newBulletin);
        });
    }

    @DeleteMapping("/bulletins/{id}")
    void deleteBulletin(@PathVariable Long id) {
      repository.deleteById(id);
    }

 @RequestMapping(value="/Chercherbulletin",method=RequestMethod.GET)
  public Page<Bulletin> chercher(
	@RequestParam(name="mc", defaultValue="") String mc, 
	@RequestParam(name="page", defaultValue="0") int page, 
	@RequestParam(name="size", defaultValue="5") int size){
   return repository.chercher("%"+mc+"%",PageRequest.of(page,size));
	 
}	

}
