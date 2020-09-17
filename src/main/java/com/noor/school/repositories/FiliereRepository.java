package com.noor.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Filiere;

@CrossOrigin("*")
@RepositoryRestResource
public interface FiliereRepository extends JpaRepository<Filiere,Long> {
}
