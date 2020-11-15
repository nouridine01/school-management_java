package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Module;

@CrossOrigin("*")
@RepositoryRestResource
public interface ModuleRepository extends JpaRepository<Module, Long> {
	
	/*@RestResource(path="/parModule")
	public Page<Module> findBylibelle_module(@Param("libelle_module") String libelle_module, Pageable pageable);*/
	
}
