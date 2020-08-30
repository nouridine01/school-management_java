package com.noor.school.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.noor.school.entities.Filiere;
import com.noor.school.exceptions.FiliereNotFoundException;
import com.noor.school.repositories.FiliereRepository;

@CrossOrigin("*")
@RestController
public class FiliereController {
	FiliereRepository repository;

    public FiliereController(FiliereRepository FiliereRepository) {
        this.repository=FiliereRepository;
    }



    @GetMapping("/filieres")
    List<Filiere> all() {
      return repository.findAll();
    }

    @PostMapping("/filieres")
    Filiere newFiliere(@RequestBody Filiere newFiliere) {
      return repository.save(newFiliere);
    }

    // Single item

    @GetMapping("/filieres/{id}")
    Filiere one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new FiliereNotFoundException(id));
    }

    @PutMapping("/filieres/{id}")
    Filiere replaceFiliere(@RequestBody Filiere newFiliere, @PathVariable Long id) {

      return repository.findById(id)
        .map(filiere -> {
        	filiere.setLibelle(newFiliere.getLibelle());
          return repository.save(filiere);
        })
        .orElseGet(() -> {
          newFiliere.setId(id);
          return repository.save(newFiliere);
        });
    }

    @DeleteMapping("/filieres/{id}")
    void deleteFiliere(@PathVariable Long id) {
      repository.deleteById(id);
    }

}
