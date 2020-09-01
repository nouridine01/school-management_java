package com.noor.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Semestre;
@CrossOrigin("*")
@RepositoryRestController
public interface SemestreRepository extends JpaRepository<Semestre, Long> {
}