package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Etudiant;
import com.noor.school.entities.User;

@CrossOrigin("*")
@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	public Etudiant findByEmail(String email);
	
	@RestResource(path="/parMatricule")
	public Page<Etudiant> findByMatricule(@Param("motcle") String motcle, Pageable pageable);
	
	@RestResource(path="/parNom")
	public Page<Etudiant> findByNom(@Param("nom") String nom, Pageable pageable);
	
	@RestResource(path="/parPrenom")
	public Page<Etudiant> findByPrenom(@Param("prenom") String prenom, Pageable pageable);
	
}
