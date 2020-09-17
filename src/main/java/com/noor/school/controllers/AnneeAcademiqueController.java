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

import com.noor.school.entities.AnneeAcademique;
import com.noor.school.exceptions.AnneeAcademiqueNotFoundException;
import com.noor.school.repositories.AnneeAcademiqueRepository;

@CrossOrigin("*")
@RestController
public class AnneeAcademiqueController {
	AnneeAcademiqueRepository repository;

    public AnneeAcademiqueController(AnneeAcademiqueRepository anneeAcademiqueRepository) {
        this.repository=anneeAcademiqueRepository;
    }



    @GetMapping("/anneeAcademiques")
    List<AnneeAcademique> all() {
      return repository.findAll();
    }

    @PostMapping("/anneeAcademiques")
    AnneeAcademique newAnneeAcademique(@RequestBody AnneeAcademique newAnneeAcademique) {
      return repository.save(newAnneeAcademique);
    }

    // Single item

    @GetMapping("/anneeAcademiques/{id}")
    AnneeAcademique one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new AnneeAcademiqueNotFoundException(id));
    }

    @PutMapping("/anneeAcademiques/{id}")
    AnneeAcademique replaceAnneeAcademique(@RequestBody AnneeAcademique newAnneeAcademique, @PathVariable Long id) {

      return repository.findById(id)
        .map(anneeAcademique -> {
        	anneeAcademique.setLibelle_annee_acad(newAnneeAcademique.getLibelle_annee_acad());
        	anneeAcademique.setDebut_annee_acad(newAnneeAcademique.getDebut_annee_acad());
        	anneeAcademique.setFin_annee_acad(newAnneeAcademique.getFin_annee_acad());
        	anneeAcademique.setProgramme(newAnneeAcademique.getProgramme());
          return repository.save(anneeAcademique);
        })
        .orElseGet(() -> {
          newAnneeAcademique.setId(id);
          return repository.save(newAnneeAcademique);
        });
    }

    @DeleteMapping("/anneeAcademiques/{id}")
    void deleteAnneeAcademique(@PathVariable Long id) {
      repository.deleteById(id);
    }

 @RequestMapping(value="/ChercheranneeAcademique",method=RequestMethod.GET)
  public Page<AnneeAcademique> chercher(
	@RequestParam(name="mc", defaultValue="") String mc, 
	@RequestParam(name="page", defaultValue="0") int page, 
	@RequestParam(name="size", defaultValue="5") int size){
   return repository.chercher("%"+mc+"%",PageRequest.of(page,size));
	 
}	

}
