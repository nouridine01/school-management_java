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

import com.noor.school.entities.Module;
import com.noor.school.repositories.ModuleRepository;

import com.noor.school.exceptions.ModuleNotFoundException;

@CrossOrigin("*")
@RestController
public class ModuleController {
	ModuleRepository repository;

    public ModuleController(ModuleRepository moduleRepository) {
        this.repository=moduleRepository;
    }



    @GetMapping("/modules")
    List<Module> all() {
      return repository.findAll();
    }

    @PostMapping("/modules")
    Module newModule(@RequestBody Module newModule) {
      return repository.save(newModule);
    }

    // Single item

    @GetMapping("/modules/{id}")
    Module one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new ModuleNotFoundException(id));
    }

    @PutMapping("/modules/{id}")
    Module replaceModule(@RequestBody Module newModule, @PathVariable Long id) {

      return repository.findById(id)
        .map(module -> {
        	module.setCode_module(newModule.getCode_module());
        	module.setLibelle_module(newModule.getLibelle_module());
        	module.setDescription(newModule.getDescription());
        	module.setUnite_enseignement(newModule.getUnite_enseignement());
        	module.setSeances(newModule.getSeances());
          return repository.save(module);
        })
        .orElseGet(() -> {
          newModule.setId(id);
          return repository.save(newModule);
        });
    }

    @DeleteMapping("/modules/{id}")
    void deleteModule(@PathVariable Long id) {
      repository.deleteById(id);
    }
}
