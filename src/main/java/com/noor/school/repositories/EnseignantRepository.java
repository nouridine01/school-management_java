package com.noor.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noor.school.entities.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
	public Enseignant findByMatricule(String matricule);
}
