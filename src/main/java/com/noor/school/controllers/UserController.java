package com.noor.school.controllers;

import com.noor.school.entities.Role;
import com.noor.school.entities.User;
import com.noor.school.repositories.RoleRepository;
import com.noor.school.repositories.UserRepository;
import com.noor.school.service.AccountService;

import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

//import javax.validation.Valid;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;

@CrossOrigin("*")
@RestController
public class UserController {
	@Autowired
	private AccountService accountService;
	
	
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	/*@PostMapping(path ="/register")
	
	public User register(@RequestParam(name = "file", required = false) MultipartFile file,
			@Validated @ModelAttribute User user, BindingResult bindingResult, @RequestParam(name = "role") String role)
			throws Exception {

		return user;

	}*/
	
@PostMapping(path ="/register")
	public User register(@RequestBody UserForm userForm){
	
	return accountService.saveUser(userForm.getLogin(),userForm.getEmail(), userForm.getLastName(), userForm.getFirstName(), userForm.getPassword(), userForm.getConfirmPassword(), userForm.getPays(), userForm.getPhoto());
}



/*	@PatchMapping(path = "/updateUser")
	public User update(@RequestParam(name = "file", required = false) MultipartFile file,
			@Validated @ModelAttribute User user, BindingResult bindingResult,
			@RequestParam(name = "role", required = false) String role) throws Exception {

		return user;

	}

	@RequestMapping(path = "deleteUser/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(name = "id") Long id) {

		try {
			userRepository.delete(userRepository.getOne(id));
		} catch (Exception e) {
			throw new RuntimeException("Action impossible car l'element à des dépendences");
		}

	}

	// pour la manipulation des dates
	@RequestMapping("/date")
	public String date() throws Exception {

		/*
		 * pour les date simple mais limité en terme de fonctionnalité ya oaussi la
		 * methode parse de formatter pour convertir string en date Date date = new
		 * Date(); SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		 * String d = formatter.format(date); Date da = new Date(); da=
		 * formatter.parse(d);
		 */

		/*DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		ZonedDateTime zt = ZonedDateTime.now();
		ZonedDateTime z = zt.plusYears(1);
		String m = format.format(z);
		return m;
	}*/

	/*
	 * @RequestMapping(path = "ini") public void ini(){ //NB: il faut mettre les
	 * dependences à null d'abords avant de les supprimer User u2 =
	 * userRepository.getOne(new Long(8)); u2.setProfil(null); u2.setRoles(null);
	 * profilRepository.delete(profilRepository.getOne(new Long(9)));
	 * userRepository.delete(u2); }
	 */

}


@Data
class UserForm{
	private String login;

    private String email;
	private String password;
    private String pays;
    private String lastName;
    private String firstName;
    private String photo;
    private String confirmPassword;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
	
}