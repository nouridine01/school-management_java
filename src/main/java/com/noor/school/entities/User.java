package com.noor.school.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private String login;
    @NotNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String pays;
	private Date created_at;
	private int created_by;
	private Date modified_at;
	private int modified_by;


   

	public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }


    @ManyToMany(fetch= FetchType.EAGER)
    private Collection<Role> roles=new ArrayList<>();

    private String lastName;
    private String firstName;
    private Boolean active;
    private String photo;


    
    
    public User(String login, String password, String pays, String lastName, String firstName,
			String photo) {
		super();
		this.login = login;
		this.password = password;
		this.pays = pays;
		this.lastName = lastName;
		this.firstName = firstName;
		this.photo = photo;
	}

	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collection<Role> getRoles() {
        return roles;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }


    //getters
    public Long getId(){
        return this.id;
    }

    public String getPassword(){
        return this.password;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public Boolean getActive(){
        return this.active;
    }

    //setters
    public void setId(Long id){
        this.id=id;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setActive(Boolean active){
        this.active=active;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public Date getModified_at() {
		return modified_at;
	}

	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}

	public int getModified_by() {
		return modified_by;
	}

	public void setModified_by(int modified_by) {
		this.modified_by = modified_by;
	}



}
