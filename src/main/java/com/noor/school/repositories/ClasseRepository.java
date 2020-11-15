package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Classe;

@CrossOrigin("*")
@RepositoryRestResource
public interface ClasseRepository extends JpaRepository<Classe,Long> {
	
	/*@RestResource(path="/parClasse")
	public Page<Classe> findByLibelle_classe(@Param("libelle_classe") String libelle_classe, Pageable pageable);*/
}
