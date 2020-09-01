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

import com.noor.school.entities.Absence;
import com.noor.school.exceptions.AbsenceNotFoundException;
import com.noor.school.repositories.AbsenceRepository;

@CrossOrigin("*")
@RestController
public class AbsenceController {
	AbsenceRepository repository;

    public AbsenceController(AbsenceRepository AbsenceRepository) {
        this.repository=AbsenceRepository;
    }



    @GetMapping("/absences")
    List<Absence> all() {
      return repository.findAll();
    }

    @PostMapping("/absences")
    Absence newAbsence(@RequestBody Absence newAbsence) {
      return repository.save(newAbsence);
    }

    // Single item

    @GetMapping("/absences/{id}")
    Absence one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new AbsenceNotFoundException(id));
    }

    @PutMapping("/absences/{id}")
    Absence replaceAbsence(@RequestBody Absence newAbsence, @PathVariable Long id) {

      return repository.findById(id)
        .map(absence -> {
        	absence.setEtudiant(newAbsence.getEtudiant());
        	absence.setSeance(newAbsence.getSeance());
          return repository.save(absence);
        })
        .orElseGet(() -> {
          newAbsence.setId(id);
          return repository.save(newAbsence);
        });
    }

    @DeleteMapping("/absences/{id}")
    void deleteAbsence(@PathVariable Long id) {
      repository.deleteById(id);
    }

}
