package com.noor.school.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.noor.school.entities.Semaine;
import com.noor.school.repositories.SemaineRepository;

import com.noor.school.exceptions.SemaineNotFoundException;

@CrossOrigin("*")
@RestController
public class SemaineController {
	SemaineRepository repository;

    public SemaineController(SemaineRepository semaineRepository) {
        this.repository=semaineRepository;
    }



    @GetMapping("/semaines")
    List<Semaine> all() {
      return repository.findAll();
    }

    @PostMapping("/semaines")
    Semaine newSemaine(@RequestBody Semaine newSemaine) {
      return repository.save(newSemaine);
    }

    // Single item

    @GetMapping("/semaines/{id}")
    Semaine one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new SemaineNotFoundException(id));
    }

    @PutMapping("/semaines/{id}")
    Semaine replaceSemaine(@RequestBody Semaine newSemaine, @PathVariable Long id) {

      return repository.findById(id)
        .map(semaine -> {
        	semaine.setLibelle_semaine(newSemaine.getLibelle_semaine());
        	semaine.setDate_debut(newSemaine.getDate_debut());
        	semaine.setDate_fin(newSemaine.getDate_fin());
          return repository.save(semaine);
        })
        .orElseGet(() -> {
          newSemaine.setId(id);
          return repository.save(newSemaine);
        });
    }

    @DeleteMapping("/semaines/{id}")
    void deleteSemaine(@PathVariable Long id) {
      repository.deleteById(id);
    }
}
