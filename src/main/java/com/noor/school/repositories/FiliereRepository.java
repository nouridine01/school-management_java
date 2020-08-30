package com.noor.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Filiere;

@CrossOrigin("*")
@RepositoryRestController
public interface FiliereRepository extends JpaRepository<Filiere,Long> {
    public Filiere findByLibelle(String libelle);
}
