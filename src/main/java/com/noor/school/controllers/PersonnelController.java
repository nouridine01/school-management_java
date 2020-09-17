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

import com.noor.school.entities.Personnel;
import com.noor.school.exceptions.PersonnelNotFoundException;
import com.noor.school.repositories.PersonnelRepository;

@CrossOrigin("*")
@RestController
public class PersonnelController {
	PersonnelRepository repository;

    public PersonnelController(PersonnelRepository PersonnelRepository) {
        this.repository=PersonnelRepository;
    }



    @GetMapping("/personnels")
    List<Personnel> all() {
      return repository.findAll();
    }

    @PostMapping("/personnels")
    Personnel newPersonnel(@RequestBody Personnel newPersonnel) {
      return repository.save(newPersonnel);
    }

    // Single item

    @GetMapping("/personnels/{id}")
    Personnel one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new PersonnelNotFoundException(id));
    }

    @PutMapping("/personnels/{id}")
    Personnel replacePersonnel(@RequestBody Personnel newPersonnel, @PathVariable Long id) {

      return repository.findById(id)
        .map(personnel -> {
        	personnel.setNom(newPersonnel.getNom());
        	personnel.setPrenom(newPersonnel.getPrenom());
        	personnel.setTelephone(newPersonnel.getTelephone());
        	personnel.setEmail(newPersonnel.getEmail());
        	personnel.setDiplome(newPersonnel.getDiplome());
        	personnel.setTitre(newPersonnel.getTitre());
        	personnel.setDate_naissance(newPersonnel.getDate_naissance());
        	personnel.setDepartement(newPersonnel.getDepartement());
          return repository.save(personnel);
        })
        .orElseGet(() -> {
          newPersonnel.setId(id);
          return repository.save(newPersonnel);
        });
    }

    @DeleteMapping("/personnels/{id}")
    void deletePersonnel(@PathVariable Long id) {
      repository.deleteById(id);
    }

}
