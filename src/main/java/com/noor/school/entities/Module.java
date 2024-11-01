package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Module {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle_module;
	private String code_module;
	private String description;

	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	@ManyToOne
	private UniteEnseignement unite_enseignement;
	
	@OneToMany(mappedBy = "module")
	private Collection<Seance> seances;
	
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Module(String libelle_module, String code_module, String description, User created_by, Date created_at,
			User modified_by, Date modified_at, UniteEnseignement unite_enseignement) {
		super();
		this.libelle_module = libelle_module;
		this.code_module = code_module;
		this.description = description;
		this.created_by = created_by;
		this.created_at = created_at;
		this.modified_by = modified_by;
		this.modified_at = modified_at;
		this.unite_enseignement = unite_enseignement;
		
	}

	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle_module() {
		return libelle_module;
	}

	public void setLibelle_module(String libelle_module) {
		this.libelle_module = libelle_module;
	}

	public String getCode_module() {
		return code_module;
	}

	public void setCode_module(String code_module) {
		this.code_module = code_module;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public User getCreated_by() {
		return created_by;
	}

	public void setCreated_by(User created_by) {
		this.created_by = created_by;
	}

	public Date getModified_at() {
		return modified_at;
	}

	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}

	public User getModified_by() {
		return modified_by;
	}

	public void setModified_by(User modified_by) {
		this.modified_by = modified_by;
	}

	public UniteEnseignement getUnite_enseignement() {
		return unite_enseignement;
	}

	public void setUnite_enseignement(UniteEnseignement unite_enseignement) {
		this.unite_enseignement = unite_enseignement;
	}

	public Collection<Seance> getSeances() {
		return seances;
	}

	public void setSeances(Collection<Seance> seances) {
		this.seances = seances;
	}
	
	
}
