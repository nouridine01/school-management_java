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
public class Edt implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String libelle_edt;
	private Date debut_edt;
	private Date fin_edt;
	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	@OneToMany(mappedBy="edt")
	private Collection <Seance> seances;
	
	

	public Edt() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Edt(String libelle_edt, Date debut_edt, Date fin_edt, User created_by, Date created_at, User modified_by,
			Date modified_at) {
		super();
		this.libelle_edt = libelle_edt;
		this.debut_edt = debut_edt;
		this.fin_edt = fin_edt;
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

	public String getLibelle_edt() {
		return libelle_edt;
	}

	public void setLibelle_edt(String libelle_edt) {
		this.libelle_edt = libelle_edt;
	}

	public Date getDebut_edt() {
		return debut_edt;
	}

	public void setDebut_edt(Date debut_edt) {
		this.debut_edt = debut_edt;
	}

	public Date getFin_edt() {
		return fin_edt;
	}

	public void setFin_edt(Date fin_edt) {
		this.fin_edt = fin_edt;
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


	public Collection<Seance> getSeances() {
		return seances;
	}

	public void setCours(Collection<Seance> seances) {
		this.seances = seances;
	}
	
}
