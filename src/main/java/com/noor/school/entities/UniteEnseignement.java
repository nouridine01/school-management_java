package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class UniteEnseignement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle;
	private String description;
	private String code_ue;
	
	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	
	private User modified_by;
	private Date modified_at;
	
	@OneToMany(mappedBy="unite_enseignement")
	private Collection <Module> modules;
	
	@ManyToOne
	private Semestre semestre;
	
	@ManyToOne
	private Programme programme;
	
	
	
	public Programme getProgramme() {
		return programme;
	}

	public void setProgramme(Programme programme) {
		this.programme = programme;
	}

	public UniteEnseignement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UniteEnseignement(String libelle, String description, String code_ue) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.code_ue = code_ue;
	}

	public UniteEnseignement(String libelle, String description, String code_ue, Date created_at, User created_by,
			Semestre semestre) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.code_ue = code_ue;
		this.created_at = created_at;
		this.created_by = created_by;
		this.semestre = semestre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode_ue() {
		return code_ue;
	}

	public void setCode_ue(String code_ue) {
		this.code_ue = code_ue;
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

	public Collection<Module> getModules() {
		return modules;
	}

	public void setModules(Collection<Module> modules) {
		this.modules = modules;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	
	
}
