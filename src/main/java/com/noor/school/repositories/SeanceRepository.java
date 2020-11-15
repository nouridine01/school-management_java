package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Seance;
import com.noor.school.entities.SeanceType;


@CrossOrigin("*")
@RepositoryRestResource
public interface SeanceRepository extends JpaRepository<Seance, Long> {
	
	@RestResource(path="/parSeance")
	public Page<Seance> findByLibelle(@Param("libelle") String libelle, Pageable pageable);
	
}
