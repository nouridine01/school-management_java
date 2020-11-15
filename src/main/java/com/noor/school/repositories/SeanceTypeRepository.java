package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.SeanceType;

@CrossOrigin("*")
@RepositoryRestResource
public interface SeanceTypeRepository extends JpaRepository<SeanceType, Long> {
	
	/*@RestResource(path="/parSeanceType")
	public Page<SeanceType> findByLibelle_type(@Param("libelle_type") String libelle_type, Pageable pageable);*/
	
}