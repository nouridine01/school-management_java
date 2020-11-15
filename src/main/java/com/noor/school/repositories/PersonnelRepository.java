package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Personnel;

@CrossOrigin("*")
@RepositoryRestResource
public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
	
	@RestResource(path="/parMatricule")
	public Page<Personnel> findByMatricule(@Param("matricule") String matricule, Pageable pageable);
	
	@RestResource(path="/parNom")
	public Page<Personnel> findByNom(@Param("nom") String nom, Pageable pageable);
	
	@RestResource(path="/parPrenom")
	public Page<Personnel> findByPrenom(@Param("prenom") String prenom, Pageable pageable);
	
}


