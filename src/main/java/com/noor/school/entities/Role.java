package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Role{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String role;
    @ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	//getters
    public long getId(){
        return this.id;
    }

    public String getRole(){
        return this.role;
    }
    
    //setters

    public void setId(long id){
        this.id=id;
    }

    public void setRole(String role){
        this.role=role;
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

}