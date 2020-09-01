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

import com.noor.school.entities.UniteEnseignement;
import com.noor.school.repositories.UniteEnseignementRepository;

import com.noor.school.exceptions.UniteEnseignementNotFoundException;

@CrossOrigin("*")
@RestController
public class UniteEnseignementController {
	UniteEnseignementRepository repository;

    public UniteEnseignementController(UniteEnseignementRepository uniteEnseignementRepository) {
        this.repository=uniteEnseignementRepository;
    }



    @GetMapping("/uniteEnseignements")
    List<UniteEnseignement> all() {
      return repository.findAll();
    }

    @PostMapping("/uniteEnseignements")
    UniteEnseignement newUniteEnseignement(@RequestBody UniteEnseignement newUniteEnseignement) {
      return repository.save(newUniteEnseignement);
    }

    // Single item

    @GetMapping("/uniteEnseignements/{id}")
    UniteEnseignement one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new UniteEnseignementNotFoundException(id));
    }

    @PutMapping("/uniteEnseignements/{id}")
    UniteEnseignement replaceUniteEnseignement(@RequestBody UniteEnseignement newUniteEnseignement, @PathVariable Long id) {

      return repository.findById(id)
        .map(uniteEnseignement -> {
        	uniteEnseignement.setLibelle(newUniteEnseignement.getLibelle());
        	uniteEnseignement.setDescription(newUniteEnseignement.getDescription());
        	uniteEnseignement.setCode_ue(newUniteEnseignement.getCode_ue());
          return repository.save(uniteEnseignement);
        })
        .orElseGet(() -> {
          newUniteEnseignement.setId(id);
          return repository.save(newUniteEnseignement);
        });
    }

    @DeleteMapping("/uniteEnseignements/{id}")
    void deleteUniteEnseignement(@PathVariable Long id) {
      repository.deleteById(id);
    }
}
