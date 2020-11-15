package com.noor.school.repositories;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.User;

@CrossOrigin("*")
@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Long> {
	
    public User findByLogin(String login);
    public User findByEmail(String email);
    public User findByResetToken(String resetToken);
    public Page<User> findByPays(String pays, Pageable pageable);
}
