package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.noor.school.entities.AnneeAcademique;

public interface AnneeAcademiqueRepository extends JpaRepository<AnneeAcademique, Long> {
	
	@Query("select anneeAcademique from AnneeAcademique anneeAcademique where anneeAcademique.libelle_annee_acad like :x")
	public Page<AnneeAcademique> chercher(@Param("x")String mc,Pageable pageable);
}
