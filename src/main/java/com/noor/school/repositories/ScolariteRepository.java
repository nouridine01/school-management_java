package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.noor.school.entities.Scolarite;

public interface ScolariteRepository extends JpaRepository<Scolarite, Long> {
	
	@Query("select scolarite from Scolarite scolarite where scolarite.libelle_scolarite like :x")
	public Page<Scolarite> chercher(@Param("x")String mc,Pageable pageable);
}
