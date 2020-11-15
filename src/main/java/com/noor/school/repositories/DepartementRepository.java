package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Departement;

@CrossOrigin("*")
@RepositoryRestResource
public interface DepartementRepository extends JpaRepository<Departement, Long> {
	
	/*@RestResource(path="/parDepartement")
	public Page<Departement> findByLibelle_departement(@Param("libelleDepartement") String libelleDepartement, Pageable pageable);*/
	
}
