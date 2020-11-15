/*package com.noor.school.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.noor.school.entities.Classe;
import com.noor.school.exceptions.ClasseNotFoundException;
import com.noor.school.repositories.ClasseRepository;

@CrossOrigin("*")
@RestController*/
/*public class ClasseController {
	//ClasseRepository repository;

    public ClasseController(ClasseRepository ClasseRepository) {
        this.repository=ClasseRepository;
    }



    @GetMapping("/classes")
    List<Classe> all() {
      return repository.findAll();
    }

    @PostMapping("/classes")
    Classe newClasse(@RequestBody Classe newClasse) {
      return repository.save(newClasse);
    }

    // Single item

    @GetMapping("/classes/{id}")
    Classe one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new ClasseNotFoundException(id));
    }

    @PutMapping("/classes/{id}")
    Classe replaceClasse(@RequestBody Classe newClasse, @PathVariable Long id) {

      return repository.findById(id)
        .map(classe -> {
        	classe.setLibelle_classe(newClasse.getLibelle_classe());
          return repository.save(classe);
        })
        .orElseGet(() -> {
          //newClasse.setId_classe(id);
          //return repository.save(newClasse);
        });
    }

    @DeleteMapping("/classes/{id}")
    void deleteClasse(@PathVariable Long id) {*/
     //repository.deleteById(id);
    /*}

}*/
