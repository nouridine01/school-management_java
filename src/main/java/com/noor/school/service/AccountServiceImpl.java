package com.noor.school.service;

import javax.transaction.Transactional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.noor.school.entities.Role;
import com.noor.school.entities.User;
import com.noor.school.repositories.RoleRepository;
import com.noor.school.repositories.UserRepository;


@Service
@Transactional
public class AccountServiceImpl implements AccountService{
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	

	public AccountServiceImpl(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	public User saveUser(String login, String lastName, String firstName, String password, String confirmPassword,
			String pays, String photo) {
		// TODO Auto-generated method stub
		
		User user = userRepository.findByLogin(login);
		if(user != null) throw new RuntimeException("User already exist");
		if(!password.equals(confirmPassword)) throw new RuntimeException("Please confirm the password");
		
		User userAdd = new User();
		userAdd.setLogin(login);
		userAdd.setLastName(lastName);
		userAdd.setFirstName(firstName);
		userAdd.setActive(true);
		userAdd.setPays(pays);
		userAdd.setPhoto(photo);
		userAdd.setPassword(bCryptPasswordEncoder.encode(password));
		userRepository.save(userAdd);
		addRoleToUser(login,"USER");
		return userAdd;
	}

	@Override
	public Role save(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Override
	public User loadUserbyLogin(String login) {
		// TODO Auto-generated method stub
		return userRepository.findByLogin(login);
	}

	@Override
	public void addRoleToUser(String login, String role) {
		// TODO Auto-generated method stub
		
		User AppUser = userRepository.findByLogin(login);
		Role AppRole = roleRepository.findByRole(role);
			AppUser.getRoles().add(AppRole);
		
	}

}
