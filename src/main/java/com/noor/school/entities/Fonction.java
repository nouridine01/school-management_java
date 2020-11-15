package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data 
public class Fonction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	
	
	public Fonction(String libelle_fonction, String code_fonction, User created_by, Date created_at, User modified_by,
			Date modified_at, Collection<Personnel> personnels) {
		super();
		this.libelle_fonction = libelle_fonction;
		this.code_fonction = code_fonction;
		this.created_by = created_by;
		this.created_at = created_at;
		this.modified_by = modified_by;
		this.modified_at = modified_at;
		this.personnels = personnels;
	}

	public Fonction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle_fonction() {
		return libelle_fonction;
	}

	public void setLibelle_fonction(String libelle_fonction) {
		this.libelle_fonction = libelle_fonction;
	}

	public String getCode_fonction() {
		return code_fonction;
	}

	public void setCode_fonction(String code_fonction) {
		this.code_fonction = code_fonction;
	}

	public User getCreated_by() {
		return created_by;
	}

	public void setCreated_by(User created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public User getModified_by() {
		return modified_by;
	}

	public void setModified_by(User modified_by) {
		this.modified_by = modified_by;
	}

	public Date getModified_at() {
		return modified_at;
	}

	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}

	public Collection<Personnel> getPersonnels() {
		return personnels;
	}

	public void setPersonnels(Collection<Personnel> personnels) {
		this.personnels = personnels;
	}
	
	
}
