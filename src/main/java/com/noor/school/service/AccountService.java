package com.noor.school.service;
import com.noor.school.entities.Role;
import com.noor.school.entities.User;

public interface AccountService{
	
public User saveUser(String login,String lastName, String firstName, String password, String confirmPassword,String pays, String photo);
public Role save(Role role);
public User loadUserbyLogin(String login);
public void addRoleToUser(String login,String role);

}

