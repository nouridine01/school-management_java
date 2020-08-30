package com.noor.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noor.school.entities.Absence;

public interface AbsenceRepository extends JpaRepository<Absence, Long> {
}
