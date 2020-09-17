package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Fonction {
	@Id
	@GeneratedValue
	private long id;
	private String libelle_fonction;
	private String code_fonction;
	@ManyToOne
	private User created_by;
	private Date created_at;
	
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	@OneToMany
	private Collection<Personnel> personnels;
}
