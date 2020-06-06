package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UniteEnseignement {
	@Id
	@GeneratedValue
	private long id;
	private String libelle;
	private String description;
	private String code_ue;
	private Date created_at;
	private Date modified_at;
	
	
	public UniteEnseignement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UniteEnseignement(String libelle) {
		super();
		this.libelle = libelle;
	}

	public UniteEnseignement(String libelle, String code_ue) {
		super();
		this.libelle = libelle;
		this.code_ue = code_ue;
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

	public Date getModified_at() {
		return modified_at;
	}

	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}
	
	
	
	
}
