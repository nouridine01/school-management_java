package com.noor.school.entities;

import java.io.Serializable;
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
import lombok.NoArgsConstructor;

@Entity
public class Scolarite implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String libelle_scolarite;
	private Date date_debut_paiement_scolarite;
	private Date date_fin_paiement_scolarite;
	private Double somme;
	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	
	@OneToMany(mappedBy="scolarite")
	private Collection<Etudiant> etudiant;


	public Scolarite() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Scolarite(String libelle_scolarite, Date date_debut_paiement_scolarite, Date date_fin_paiement_scolarite,
			Double somme, User created_by, Date created_at, User modified_by, Date modified_at) {
		super();
		this.libelle_scolarite = libelle_scolarite;
		this.date_debut_paiement_scolarite = date_debut_paiement_scolarite;
		this.date_fin_paiement_scolarite = date_fin_paiement_scolarite;
		this.somme = somme;
		this.created_by = created_by;
		this.created_at = created_at;
		this.modified_by = modified_by;
		this.modified_at = modified_at;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLibelle_scolarite() {
		return libelle_scolarite;
	}


	public void setLibelle_scolarite(String libelle_scolarite) {
		this.libelle_scolarite = libelle_scolarite;
	}


	public Date getDate_debut_paiement_scolarite() {
		return date_debut_paiement_scolarite;
	}


	public void setDate_debut_paiement_scolarite(Date date_debut_paiement_scolarite) {
		this.date_debut_paiement_scolarite = date_debut_paiement_scolarite;
	}


	public Date getDate_fin_paiement_scolarite() {
		return date_fin_paiement_scolarite;
	}


	public void setDate_fin_paiement_scolarite(Date date_fin_paiement_scolarite) {
		this.date_fin_paiement_scolarite = date_fin_paiement_scolarite;
	}


	public Double getSomme() {
		return somme;
	}


	public void setSomme(Double somme) {
		this.somme = somme;
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


	public Collection<Etudiant> getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Collection<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}
	
	

}
