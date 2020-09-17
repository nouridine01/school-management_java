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

import com.noor.school.entities.Seance;
import com.noor.school.repositories.SeanceRepository;

import com.noor.school.exceptions.SeanceNotFoundException;

@CrossOrigin("*")
@RestController
public class SeanceController {
	SeanceRepository repository;

    public SeanceController(SeanceRepository seanceRepository) {
        this.repository=seanceRepository;
    }



    @GetMapping("/seances")
    List<Seance> all() {
      return repository.findAll();
    }

    @PostMapping("/seances")
    Seance newSeance(@RequestBody Seance newSeance) {
      return repository.save(newSeance);
    }

    // Single item

    @GetMapping("/seances/{id}")
    Seance one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new SeanceNotFoundException(id));
    }

    @PutMapping("/seances/{id}")
    Seance replaceSeance(@RequestBody Seance newSeance, @PathVariable Long id) {

      return repository.findById(id)
        .map(seance -> {
        	seance.setLibelle(newSeance.getLibelle());
        	seance.setDescription(newSeance.getDescription());
          return repository.save(seance);
        })
        .orElseGet(() -> {
          newSeance.setId(id);
          return repository.save(newSeance);
        });
    }

    @DeleteMapping("/seances/{id}")
    void deleteSeance(@PathVariable Long id) {
      repository.deleteById(id);
    }
}
