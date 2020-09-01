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

import com.noor.school.entities.Semestre;
import com.noor.school.repositories.SemestreRepository;

import com.noor.school.exceptions.SemestreNotFoundException;

@CrossOrigin("*")
@RestController
public class SemestreController {
	SemestreRepository repository;

    public SemestreController(SemestreRepository semestreRepository) {
        this.repository=semestreRepository;
    }



    @GetMapping("/semestres")
    List<Semestre> all() {
      return repository.findAll();
    }

    @PostMapping("/semestres")
    Semestre newSemestre(@RequestBody Semestre newSemestre) {
      return repository.save(newSemestre);
    }

    // Single item

    @GetMapping("/semestres/{id}")
    Semestre one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new SemestreNotFoundException(id));
    }

    @PutMapping("/semestres/{id}")
    Semestre replaceSemestre(@RequestBody Semestre newSemestre, @PathVariable Long id) {

      return repository.findById(id)
        .map(semestre -> {
        	semestre.setNumero_semestre(newSemestre.getNumero_semestre());
        	semestre.setLibelle_semestre(newSemestre.getLibelle_semestre());
          return repository.save(semestre);
        })
        .orElseGet(() -> {
          newSemestre.setId(id);
          return repository.save(newSemestre);
        });
    }

    @DeleteMapping("/semestres/{id}")
    void deleteSemestre(@PathVariable Long id) {
      repository.deleteById(id);
    }
}
