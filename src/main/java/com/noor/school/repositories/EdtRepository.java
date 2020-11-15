package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Edt;


@CrossOrigin("*")
@RepositoryRestResource
public interface EdtRepository extends JpaRepository<Edt, Long> {
	/*@Query("select ed from Edt ed where ed.libelle_edt like :x")
	public Page<Edt> chercher(@Param("x")String mc,Pageable pageable);*/
	
	/*@RestResource(path="/parEdt")
	public Page<Edt> findByLibelle_edt(@Param("libelle_edt") String libelle_edt, Pageable pageable);*/
	
}
