package com.noor.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noor.school.entities.Etudiant;
import com.noor.school.entities.User;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	public Etudiant findByEmail(String email);
}
