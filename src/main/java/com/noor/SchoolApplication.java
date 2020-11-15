package com.noor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.noor.school.entities.Classe;
import com.noor.school.entities.Etudiant;
import com.noor.school.entities.Role;
import com.noor.school.entities.Salle;
import com.noor.school.entities.Scolarite;
import com.noor.school.entities.User;
import com.noor.school.repositories.SalleRepository;
import com.noor.school.service.AccountService;


@SpringBootApplication
public class GestionEcoleNimaApplication {
	@Autowired
	private SalleRepository repository;
	
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	
	
	private User user;
	
	
	private Role role;
	
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) {
		SpringApplication.run(GestionEcoleNimaApplication.class, args);
		/*ApplicationContext ctx= SpringApplication.run(GestionEcoleNimaApplication.class, args);
		
		SalleRepository repository = ctx.getBean(SalleRepository.class);
	}*/
}
	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		repository.save(new Salle("HB4", "HB4", "Salle de reunion", "grande", "grande",
				df.parse("12/02/1995"),1));*/
	
	
		@Bean
		CommandLineRunner start(AccountService accountService) {
			return args->{
				accountService.save(new Role(1,"USER",user,df.parse("12/02/1995"),user,df.parse("12/02/1995")));
				accountService.save(new Role(2,"ADMIN",user,df.parse("12/02/1995"),user,df.parse("12/02/1995")));
				/*Stream.of("user1","user2","user3","admin").forEach(un->{
					accountService.saveUser(un,un,un,"1234","1234",un, un);
				});*/
				
				//accountService.addRoleToUser("admin","ADMIN");
				restConfiguration.exposeIdsFor(Etudiant.class);
				restConfiguration.exposeIdsFor(Classe.class);
				restConfiguration.exposeIdsFor(User.class);
				restConfiguration.exposeIdsFor(Scolarite.class);


			};
			
		}
		
		@Bean
		BCryptPasswordEncoder getBCPE() {
			return new BCryptPasswordEncoder();
		}
	

}
