package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Bulletin;

@CrossOrigin("*")
@RepositoryRestResource
public interface BulletinRepository extends JpaRepository<Bulletin, Long> {
	/*@Query("select bulletin from Bulletin bulletin where bulletin.libelle_bulletin like :x")
	public Page<Bulletin> chercher(@Param("x")String mc,Pageable pageable);*/
	
	/*@RestResource(path="/parLibelle")
	public Page<Bulletin> findByLibelle_bulletin(@Param("libelle_bulletin") String libelle_bulletin, Pageable pageable);*/
}
