package com.noor.school.repositories;


import com.noor.school.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")

@RepositoryRestResource
public interface RoleRepository extends JpaRepository<Role,Long> {
	
    public Role findByRole(String role);
}
