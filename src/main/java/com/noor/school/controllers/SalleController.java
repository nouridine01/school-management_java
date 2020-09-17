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

import com.noor.school.entities.Salle;
import com.noor.school.repositories.SalleRepository;

import com.noor.school.exceptions.SalleNotFoundException;

@CrossOrigin("*")
@RestController
public class SalleController {
//	SalleRepository repository;
//
//    public SalleController(SalleRepository SalleRepository) {
//        this.repository=SalleRepository;
//    }
//
//
//
//    @GetMapping("/salles")
//    List<Salle> all() {
//      return repository.findAll();
//    }
//
//    @PostMapping("/salles")
//    Salle newSalle(@RequestBody Salle newSalle) {
//      return repository.save(newSalle);
//    }
//
//    // Single item
//
//    @GetMapping("/salles/{id}")
//    Salle one(@PathVariable Long id) {
//
//      return repository.findById(id)
//        .orElseThrow(() -> new SalleNotFoundException(id));
//    }
//
//    @PutMapping("/salles/{id}")
//    Salle replaceSalle(@RequestBody Salle newSalle, @PathVariable Long id) {
//
//      return repository.findById(id)
//        .map(salle -> {
//        	salle.setLibelle_salle(newSalle.getLibelle_salle());
//        	salle.setDescription(newSalle.getDescription());
//        	salle.setDimension(newSalle.getDimension());
//        	salle.setCapacite(newSalle.getCapacite());
//          return repository.save(salle);
//        })
//        .orElseGet(() -> {
//          newSalle.setId(id);
//          return repository.save(newSalle);
//        });
//    }
//
//    @DeleteMapping("/salles/{id}")
//    void deleteSalle(@PathVariable Long id) {
//      repository.deleteById(id);
//    }
}
