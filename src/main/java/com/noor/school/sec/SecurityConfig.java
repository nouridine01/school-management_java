package com.noor.school.sec;


//
//import javax.sql.DataSource;
//
//import org.apache.tomcat.util.security.MD5Encoder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
public class SecurityConfig {
	
//	@Autowired
//	private DataSource dataSource;
//	PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		auth.jdbcAuthentication()
//			.dataSource(dataSource)
//			.usersByUsernameQuery("select login as principal, password as credentials, active from user where login=?")
//			.authoritiesByUsernameQuery("select login as principal, role as role from user_roles, user, role where user.id=user_roles.user_id AND role.id=user_roles.roles_id AND login=?")
//			//passwordEncoder.setDefaultPasswordEncoderForMatches(new MessageDigestPasswordEncoder("MD5"))
//			.passwordEncoder(new MessageDigestPasswordEncoder("MD5"))
//			.rolePrefix("ROLE_");
//	}
//	
//	
//	protected void configure(HttpSecurity http) throws Exception{
//		http.formLogin();
//		http.authorizeRequests().antMatchers("/user/*").hasRole("USER");
//		//http.authorizeRequests().antMatchers("/etudiants").hasRole("ADMIN");
//		http.exceptionHandling().accessDeniedPage("/403");
//	}
}