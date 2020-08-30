package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Personnel {
	@Id
	@GeneratedValue
	private long id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private String titre;
	private String diplome;
	private Date date_naissance;
	private Date created_at;
	private int created_by;
	private Date modified_at;
	private int modified_by;
	
	public Personnel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personnel(String nom, String prenom, String telephone, String email, String titre, String diplome,
			Date date_naissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.titre = titre;
		this.diplome = diplome;
		this.date_naissance = date_naissance;		
	}

	public Personnel(long id, String nom, String prenom, String telephone, String email, String titre, String diplome,
			Date date_naissance, Date created_at, int created_by, Date modified_at, int modified_by) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.titre = titre;
		this.diplome = diplome;
		this.date_naissance = date_naissance;
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
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
