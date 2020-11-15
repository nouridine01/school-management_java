package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.UniteEnseignement;
@CrossOrigin("*")
@RepositoryRestResource
public interface UniteEnseignementRepository extends JpaRepository<UniteEnseignement, Long> {
	@RestResource(path="/parUE")
	public Page<UniteEnseignement> findByLibelle(@Param("libelle") String libelle, Pageable pageable);
	
}
