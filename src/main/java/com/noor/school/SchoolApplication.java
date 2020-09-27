package com.noor.school;
import com.noor.school.entities.Etudiant;
import com.noor.school.entities.Personnel;
import com.noor.school.entities.Role;
import com.noor.school.entities.Salle;
import com.noor.school.entities.User;
import com.noor.school.repositories.EtudiantRepository;
import com.noor.school.repositories.PersonnelRepository;
import com.noor.school.repositories.SalleRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SchoolApplication  {
	
	private static final Logger log = LoggerFactory.getLogger(SchoolApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(EtudiantRepository repository, PersonnelRepository persRep) {
		return (args) -> {
			// save a few salles
			repository.save(new Etudiant("BAKO ADAMOU", "Mmanane Bariki", "22798793379", "barikibako@gmail.com"));
			repository.save(new Etudiant("MALAN MAMAN", "Maman Ziladeini", "227980610233", "zoulman@gmail.com"));
			repository.save(new Etudiant("BAIDARI BOUBACAR", "Lamine", "2211514507", "laminebaidari@gmail.com"));
			// fetch all salles
			log.info("Etudiant found with findAll():");
			log.info("-------------------------------");
			for (Etudiant etudiant : repository.findAll()) {
				log.info(etudiant.toString());
			}
			log.info("");
			
			persRep.save(new Personnel("EC-001", "BAIDARI BOUBACAR", "Lamine", "2211514507", "laminebaidari@gmail.com", "Enseignant Chercheur", "Master 2"));
			persRep.save(new Personnel("EC-001", "BAIDARI BOUBACAR", "Lamine", "2211514507", "laminebaidari@gmail.com", "Professeur", "Docteur"));
			persRep.save(new Personnel("EC-001", "BAIDARI BOUBACAR", "Lamine", "2211514507", "laminebaidari@gmail.com", "Assitant", "Ingénieur"));
			
			
			log.info("Personnel found with findAll():");
			log.info("-------------------------------");
			for (Personnel p : persRep.findAll()) {
				log.info(p.toString());
			}
			log.info("");

//			// fetch an individual salle by ID
//			Salle salle = repository.findById(1L);
//			log.info("Salle found with findById(1L):");
//			log.info("--------------------------------");
//			log.info(salle.toString());
//			log.info("");
//
//			// fetch salles by last name
//			log.info("Salle found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			repository.findByLastName("Bauer").forEach(bauer -> {
//				log.info(bauer.toString());
//			});
//			// for (Salle bauer : repository.findByLastName("Bauer")) {
//			// 	log.info(bauer.toString());
//			// }
			log.info("");
		};
	}

}
//=======
//
	@Bean
	public BCryptPasswordEncoder getEncoder(){
		return new BCryptPasswordEncoder();
	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		System.out.println(bCryptPasswordEncoder.encode("passer123"));
//		repositoryRestConfiguration.exposeIdsFor( User.class, Role.class);
//	}
