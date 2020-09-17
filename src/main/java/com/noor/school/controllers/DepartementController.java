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

import com.noor.school.entities.Departement;
import com.noor.school.exceptions.DepartementNotFoundException;
import com.noor.school.repositories.DepartementRepository;

@CrossOrigin("*")
@RestController
public class DepartementController {
	DepartementRepository repository;

    public DepartementController(DepartementRepository DepartementRepository) {
        this.repository=DepartementRepository;
    }

    @GetMapping("/departements")
    List<Departement> all() {
      return repository.findAll();
    }

    @PostMapping("/departements")
    Departement newDepartement(@RequestBody Departement newDepartement) {
      return repository.save(newDepartement);
    }

    // Single item
    @GetMapping("/departements/{id}")
    Departement one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new DepartementNotFoundException(id));
    }

    @PutMapping("/departements/{id}")
    Departement replaceDepartement(@RequestBody Departement newDepartement, @PathVariable Long id) {

      return repository.findById(id)
        .map(departement -> {
        	departement.setLibelle_departement(newDepartement.getLibelle_departement());
        	departement.setFilieres(newDepartement.getFilieres());
        	departement.setPersonnels(newDepartement.getPersonnels());
          return repository.save(departement);
        })
        .orElseGet(() -> {
          newDepartement.setId_departement(id);
          return repository.save(newDepartement);
        });
    }

    @DeleteMapping("/departements/{id}")
    void deleteDepartement(@PathVariable Long id) {
      repository.deleteById(id);
    }

}
