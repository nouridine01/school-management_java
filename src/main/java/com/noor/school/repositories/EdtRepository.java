package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.noor.school.entities.Edt;

public interface EdtRepository extends JpaRepository<Edt, Long> {
	@Query("select ed from Edt ed where ed.libelle_edt like :x")
	public Page<Edt> chercher(@Param("x")String mc,Pageable pageable);
}
