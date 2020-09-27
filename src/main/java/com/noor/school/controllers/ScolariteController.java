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

import com.noor.school.entities.Scolarite;
import com.noor.school.exceptions.ScolariteNotFoundException;
import com.noor.school.repositories.ScolariteRepository;

@CrossOrigin("*")
@RestController
public class ScolariteController {
	ScolariteRepository repository;

    public ScolariteController(ScolariteRepository scolariteRepository) {
        this.repository=scolariteRepository;
    }



    @GetMapping("/scolarites")
    List<Scolarite> all() {
      return repository.findAll();
    }

    @PostMapping("/scolarite")
    Scolarite newScolarite(@RequestBody Scolarite newScolarite) {
      return repository.save(newScolarite);
    }

    // Single item

    @GetMapping("/scolarite/{id}")
    Scolarite one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new ScolariteNotFoundException(id));
    }

    @PutMapping("/scolarite/{id}")
    Scolarite replaceScolarite(@RequestBody Scolarite newScolarite, @PathVariable Long id) {

      return repository.findById(id)
        .map(scolarite -> {
        	scolarite.setLibelle_scolarite(newScolarite.getLibelle_scolarite());
        	scolarite.setDate_debut_paiement_scolarite(newScolarite.getDate_debut_paiement_scolarite());
        	scolarite.setDate_fin_paiement_scolarite(newScolarite.getDate_fin_paiement_scolarite());
        	scolarite.setSomme(newScolarite.getSomme());
        	scolarite.setEtudiant(newScolarite.getEtudiant());
          return repository.save(scolarite);
        })
        .orElseGet(() -> {
          newScolarite.setId(id);
          return repository.save(newScolarite);
        });
    }

    @DeleteMapping("/scolarite/{id}")
    void deleteScolarite(@PathVariable Long id) {
      repository.deleteById(id);
    }

 @RequestMapping(value="/Chercherscolarite",method=RequestMethod.GET)
  public Page<Scolarite> chercher(
	@RequestParam(name="mc", defaultValue="") String mc, 
	@RequestParam(name="page", defaultValue="0") int page, 
	@RequestParam(name="size", defaultValue="5") int size){
   return repository.chercher("%"+mc+"%",PageRequest.of(page,size));
	 
}	

}
