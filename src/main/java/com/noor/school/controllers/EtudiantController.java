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

import com.noor.school.entities.Etudiant;
import com.noor.school.exceptions.EtudiantNotFoundException;
import com.noor.school.repositories.EtudiantRepository;

@CrossOrigin("*")
@RestController
public class EtudiantController {
	EtudiantRepository repository;

    public EtudiantController(EtudiantRepository EtudiantRepository) {
        this.repository=EtudiantRepository;
    }



    @GetMapping("/etudiants")
    List<Etudiant> all() {
      return repository.findAll();
    }

    @PostMapping("/etudiants")
    Etudiant newEtudiant(@RequestBody Etudiant newEtudiant) {
      return repository.save(newEtudiant);
    }

    // Single item

    @GetMapping("/etudiants/{id}")
    Etudiant one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new EtudiantNotFoundException(id));
    }

    @PutMapping("/etudiants/{id}")
    Etudiant replaceEtudiant(@RequestBody Etudiant newEtudiant, @PathVariable Long id) {

      return repository.findById(id)
        .map(etudiant -> {
        	etudiant.setNom(newEtudiant.getNom());
        	etudiant.setPrenom(newEtudiant.getPrenom());
        	etudiant.setEmail(newEtudiant.getEmail());
        	etudiant.setTelephone(newEtudiant.getTelephone());
        	etudiant.setTitre(newEtudiant.getTitre());
        	etudiant.setDate_naissance(newEtudiant.getDate_naissance());
        	etudiant.setMatricule(newEtudiant.getMatricule());
        	etudiant.setDiplome(newEtudiant.getDiplome());
          return repository.save(etudiant);
        })
        .orElseGet(() -> {
          newEtudiant.setId(id);
          return repository.save(newEtudiant);
        });
    }

    @DeleteMapping("/etudiants/{id}")
    void deleteEtudiant(@PathVariable Long id) {
      repository.deleteById(id);
    }

}
