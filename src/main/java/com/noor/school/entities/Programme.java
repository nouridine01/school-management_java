package com.noor.school.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Programme implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String libelle_programme;
	private Date debut_programme;
	private Date fin_programme;

	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	@ManyToOne
	private AnneeAcademique annee_acad;
	
	@OneToMany(mappedBy="programme")
	private Collection <UniteEnseignement> uniteEnseignement;
	
	@OneToMany(mappedBy="programme")
	private Collection <Semestre> semestre;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="filiere_id")
	private Filiere filiere;
	
	
	

	public Programme() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Programme(String libelle_programme, Date debut_programme, Date fin_programme, User created_by,
			Date created_at, User modified_by, Date modified_at, AnneeAcademique annee_acad,
			 Filiere filiere) {
		super();
		this.libelle_programme = libelle_programme;
		this.debut_programme = debut_programme;
		this.fin_programme = fin_programme;
		this.created_by = created_by;
		this.created_at = created_at;
		this.modified_by = modified_by;
		this.modified_at = modified_at;
		this.annee_acad = annee_acad;
		this.filiere = filiere;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle_programme() {
		return libelle_programme;
	}

	public void setLibelle_programme(String libelle_programme) {
		this.libelle_programme = libelle_programme;
	}

	public Date getDebut_programme() {
		return debut_programme;
	}

	public void setDebut_programme(Date debut_programme) {
		this.debut_programme = debut_programme;
	}

	public Date getFin_programme() {
		return fin_programme;
	}

	public void setFin_programme(Date fin_programme) {
		this.fin_programme = fin_programme;
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

	

	public AnneeAcademique getAnnee_acad() {
		return annee_acad;
	}

	public void setAnnee_acad(AnneeAcademique annee_acad) {
		this.annee_acad = annee_acad;
	}

	public Collection<UniteEnseignement> getUniteEnseignement() {
		return uniteEnseignement;
	}

	public void setUniteEnseignement(Collection<UniteEnseignement> uniteEnseignement) {
		this.uniteEnseignement = uniteEnseignement;
	}

	public Collection<Semestre> getSemestre() {
		return semestre;
	}

	public void setSemestre(Collection<Semestre> semestre) {
		this.semestre = semestre;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	
	
}
