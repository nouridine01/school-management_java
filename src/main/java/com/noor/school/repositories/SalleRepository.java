package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Salle;

@CrossOrigin("*")
@RepositoryRestResource
public interface SalleRepository extends JpaRepository<Salle,Long> {

	/*@RestResource(path="/Libelle_salle")
	public Page<Salle> findByLibelle_salle(@Param("libelle_salle") String libelle_salle, Pageable pageable);*/
	
}
