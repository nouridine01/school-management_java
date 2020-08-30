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

import com.noor.school.entities.Enseignant;
import com.noor.school.exceptions.EnseignantNotFoundException;
import com.noor.school.repositories.EnseignantRepository;

@CrossOrigin("*")
@RestController
public class EnseignantController {
	EnseignantRepository repository;

    public EnseignantController(EnseignantRepository EnseignantRepository) {
        this.repository=EnseignantRepository;
    }



    @GetMapping("/enseignants")
    List<Enseignant> all() {
      return repository.findAll();
    }

    @PostMapping("/enseignants")
    Enseignant newEnseignant(@RequestBody Enseignant newEnseignant) {
      return repository.save(newEnseignant);
    }

    // Single item

    @GetMapping("/enseignants/{id}")
    Enseignant one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new EnseignantNotFoundException(id));
    }

    @PutMapping("/enseignants/{id}")
    Enseignant replaceEnseignant(@RequestBody Enseignant newEnseignant, @PathVariable Long id) {

      return repository.findById(id)
        .map(enseignant -> {
        	enseignant.setNom(newEnseignant.getNom());
        	enseignant.setPrenom(newEnseignant.getPrenom());
        	enseignant.setEmail(newEnseignant.getEmail());
        	enseignant.setTelephone(newEnseignant.getTelephone());
        	enseignant.setTitre(newEnseignant.getTitre());
        	enseignant.setDate_naissance(newEnseignant.getDate_naissance());
        	enseignant.setMatricule(newEnseignant.getMatricule());
        	enseignant.setDiplome(newEnseignant.getDiplome());
          return repository.save(enseignant);
        })
        .orElseGet(() -> {
          newEnseignant.setId(id);
          return repository.save(newEnseignant);
        });
    }

    @DeleteMapping("/enseignants/{id}")
    void deleteEnseignant(@PathVariable Long id) {
      repository.deleteById(id);
    }

}
