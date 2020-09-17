package com.noor.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Module;

@CrossOrigin("*")
@RepositoryRestResource
public interface ModuleRepository extends JpaRepository<Module, Long> {
}