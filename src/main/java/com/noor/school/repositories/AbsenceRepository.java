package com.noor.school.repositories;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Absence;


@CrossOrigin("*")
@RepositoryRestResource
public interface AbsenceRepository extends JpaRepository<Absence, Long> {
	
	/*@RestResource(path="/parDate")
	public Page<Absence> findByDate_absence(@Param("date_absence") Date date_absence, Pageable pageable);*/
	
}
