package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Semestre {
	@Id
	@GeneratedValue
	private long id;
	private int numero;
	private String libelle;
	private Date created_at;
	private int created_by;
	private Date modified_at;
	private int modified_by;
	
	public Semestre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Semestre(int numero, String libelle) {
		super();
		this.numero = numero;
		this.libelle = libelle;
	}
		
	
	public Semestre(long id, int numero, String libelle, Date created_at, int created_by, Date modified_at,
			int modified_by) {
		super();
		this.id = id;
		this.numero = numero;
		this.libelle = libelle;
		this.created_at = created_at;
		this.created_by = created_by;
		this.modified_at = modified_at;
		this.modified_by = modified_by;
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


	public int getCreated_by() {
		return created_by;
	}


	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}


	public int getModified_by() {
		return modified_by;
	}


	public void setModified_by(int modified_by) {
		this.modified_by = modified_by;
	}	
	
}
