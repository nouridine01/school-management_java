package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Enseignant;

@CrossOrigin("*")
@RepositoryRestResource
public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
	
	@RestResource(path="/parEnseignant")
	public Page<Enseignant> findByTitre(@Param("titre_enseignant") String titre_enseignant, Pageable pageable);
	
}

