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
@Data @NoArgsConstructor @AllArgsConstructor
public class AnneeAcademique implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String libelle_annee_acad;
	private Date debut_annee_acad;
	private Date fin_annee_acad;
	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	@OneToMany(mappedBy="annee_acad")
	private Collection<Programme> programme;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle_annee_acad() {
		return libelle_annee_acad;
	}

	public void setLibelle_annee_acad(String libelle_annee_acad) {
		this.libelle_annee_acad = libelle_annee_acad;
	}

	public Date getDebut_annee_acad() {
		return debut_annee_acad;
	}

	public void setDebut_annee_acad(Date debut_annee_acad) {
		this.debut_annee_acad = debut_annee_acad;
	}

	public Date getFin_annee_acad() {
		return fin_annee_acad;
	}

	public void setFin_annee_acad(Date fin_annee_acad) {
		this.fin_annee_acad = fin_annee_acad;
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

	public Collection<Programme> getProgramme() {
		return programme;
	}

	public void setProgramme(Collection<Programme> programme) {
		this.programme = programme;
	}

	
}
