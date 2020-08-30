package com.noor.school;

import com.noor.school.entities.Role;
import com.noor.school.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SchoolApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}
<<<<<<< HEAD

//implements CommandLineRunner
//	@Autowired
//	RepositoryRestConfiguration repositoryRestConfiguration;
//	@Autowired
//	BCryptPasswordEncoder bCryptPasswordEncoder;
//
//	public static void main(String[] args) {
//		SpringApplication.run(SchoolApplication.class, args);
//	}
//
//	@Bean
//	public BCryptPasswordEncoder getEncoder(){
//		return new BCryptPasswordEncoder();
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		System.out.println(bCryptPasswordEncoder.encode("passer123"));
//		repositoryRestConfiguration.exposeIdsFor( User.class, Role.class);
//	}


}
=======

	@Bean
	public BCryptPasswordEncoder getEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(bCryptPasswordEncoder.encode("passer123"));
		repositoryRestConfiguration.exposeIdsFor( User.class, Role.class);
	}


}
>>>>>>> a170a8554b45b02a2acca66aed3f5aa8963f7698
