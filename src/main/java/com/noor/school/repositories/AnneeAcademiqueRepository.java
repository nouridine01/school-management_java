package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.AnneeAcademique;


@CrossOrigin("*")
@RepositoryRestResource
public interface AnneeAcademiqueRepository extends JpaRepository<AnneeAcademique, Long> {
	
	/*@Query("select anneeAcademique from AnneeAcademique anneeAcademique where anneeAcademique.libelle_annee_acad like :x")
	public Page<AnneeAcademique> chercher(@Param("x")String mc,Pageable pageable);*/
	
	/*@RestResource(path="/parLibelle")
	public Page<AnneeAcademique> findByLibelle_annee_acad(@Param("libelle_annee_acad") String libelle_annee_acad, Pageable pageable);*/

}
