package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Fonction;

@CrossOrigin("*")
@RepositoryRestResource
public interface FunctionRepository extends JpaRepository<Fonction, Long>{
	/*@RestResource(path="/parFonction")
	public Page<Fonction> findByLibelle_fonction(@Param("libelle_fonction") String libelle_fonction, Pageable pageable);*/
	
}
