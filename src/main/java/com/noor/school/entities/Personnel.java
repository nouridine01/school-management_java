package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
/*import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;*/
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

import lombok.NonNull;

@Entity
public class Personnel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String matricule;
	private String nom;
	private String prenom;
	/*@Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",
            message="{invalid.telephone}")*/
	private String telephone;
	/*@Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
	        +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
	        +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
	             message="{invalid.email}")*/
	private String email;
	private String titre;
	private String diplome;
	private Date date_naissance;
	@ManyToOne @NonNull
	private User created_by;
	private Date created_at;
	@ManyToOne @NonNull
	private User modified_by;
	private Date modified_at;
	
	@ManyToOne
	private Departement departement;
	
	
	@OneToMany(mappedBy="personnel")
	private Collection<Enseignant> enseignants;
	
	public Personnel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Personnel(String matricule, String nom, String prenom, String telephone, String email, String titre,
			String diplome, Date date_naissance, Departement departement) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.titre = titre;
		this.diplome = diplome;
		this.date_naissance = date_naissance;
		this.departement = departement;
	}
	

	public Personnel(String matricule, String nom, String prenom, String telephone, String email, String titre,
			String diplome, Date date_naissance, @NonNull User created_by, Date created_at, @NonNull User modified_by,
			Date modified_at, Departement departement) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.titre = titre;
		this.diplome = diplome;
		this.date_naissance = date_naissance;
		this.created_by = created_by;
		this.created_at = created_at;
		this.modified_by = modified_by;
		this.modified_at = modified_at;
		this.departement = departement;
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
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


	public User getCreated_by() {
		return this.created_by;
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


	public Departement getDepartement() {
		return departement;
	}


	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
}
