package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.noor.school.entities.Programme;

public interface ProgrammeRepository extends JpaRepository<Programme, Long> {
	
	@Query("select prog from Programme prog where prog.libelle_programme like :x")
	public Page<Programme> chercher(@Param("x")String mc,Pageable pageable);
}
