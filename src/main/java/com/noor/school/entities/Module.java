package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Module {
	@Id
	@GeneratedValue
	private long id;
	private String libelle_mobile;
	private String description;
	private Date created_at;
	private Date modified_at;
	
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Module(String libelle_mobile, String description) {
		super();
		this.libelle_mobile = libelle_mobile;
		this.description = description;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getLibelle_mobile() {
		return libelle_mobile;
	}
	
	public void setLibelle_mobile(String libelle_mobile) {
		this.libelle_mobile = libelle_mobile;
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
	
	public Date getModified_at() {
		return modified_at;
	}
	
	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}
	
}
