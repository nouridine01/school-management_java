package com.noor.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Fonction;

@CrossOrigin("*")
@RepositoryRestResource
public interface FunctionRepository extends JpaRepository<Fonction, Long>{
	
}
