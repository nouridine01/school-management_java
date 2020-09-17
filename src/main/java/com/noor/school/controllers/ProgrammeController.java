package com.noor.school.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.noor.school.entities.Programme;
import com.noor.school.exceptions.ProgrammeNotFoundException;
import com.noor.school.repositories.ProgrammeRepository;

@CrossOrigin("*")
@RestController
public class ProgrammeController {
	ProgrammeRepository repository;

    public ProgrammeController(ProgrammeRepository programmeRepository) {
        this.repository=programmeRepository;
    }



    @GetMapping("/programmes")
    List<Programme> all() {
      return repository.findAll();
    }

    @PostMapping("/programmes")
    Programme newProgramme(@RequestBody Programme newProgramme) {
      return repository.save(newProgramme);
    }

    // Single item

    @GetMapping("/programmes/{id}")
    Programme one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new ProgrammeNotFoundException(id));
    }

    @PutMapping("/programmes/{id}")
    Programme replaceProgramme(@RequestBody Programme newProgramme, @PathVariable Long id) {

      return repository.findById(id)
        .map(programme -> {
        	programme.setLibelle_programme(newProgramme.getLibelle_programme());
        	programme.setDebut_programme(newProgramme.getDebut_programme());
        	programme.setFin_programme(newProgramme.getFin_programme());
        	programme.setAnnee_acad(newProgramme.getAnnee_acad());
        	programme.setUniteEnseignement(newProgramme.getUniteEnseignement());
        	programme.setSemestre(newProgramme.getSemestre());
        	
          return repository.save(programme);
        })
        .orElseGet(() -> {
          newProgramme.setId(id);
          return repository.save(newProgramme);
        });
    }

    @DeleteMapping("/programmes/{id}")
    void deleteProgramme(@PathVariable Long id) {
      repository.deleteById(id);
    }

	 @RequestMapping(value="/Chercherprogramme",method=RequestMethod.GET)
	  public Page<Programme> chercher(
		@RequestParam(name="mc", defaultValue="") String mc, 
		@RequestParam(name="page", defaultValue="0") int page, 
		@RequestParam(name="size", defaultValue="5") int size){
		 
		 return repository.chercher("%"+mc+"%",PageRequest.of(page,size));	 
	  }	

}
