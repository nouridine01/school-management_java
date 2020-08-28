package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Semestre {
	private long id;
	private int numero;
	private String libelle;
	private Date created_at;
	private Date modified_at;
	
	public Semestre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Semestre(int numero, String libelle) {
		super();
		this.numero = numero;
		this.libelle = libelle;
	}
	
	
	public long getId() {
		return id;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
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
