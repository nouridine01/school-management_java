package com.noor.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noor.school.entities.Seance;
import com.noor.school.entities.SeanceType;

public interface SeanceRepository extends JpaRepository<Seance, Long> {
}
