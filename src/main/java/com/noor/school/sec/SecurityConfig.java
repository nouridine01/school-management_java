package com.noor.school.sec;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	/*private DataSource dataSource;
	PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();*/
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
		/*jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("select login as principal, password as credentials, active from user where login=?")
			.authoritiesByUsernameQuery("select login as principal, roles as role from user_roles where login=?")
			//passwordEncoder.setDefaultPasswordEncoderForMatches(new MessageDigestPasswordEncoder("MD5"))
			.passwordEncoder(new MessageDigestPasswordEncoder("MD5"))
			.rolePrefix("ROLE_");*/
	}
	
	
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.authorizeRequests().antMatchers("/login/**","/register/**").permitAll();
		http.authorizeRequests().antMatchers("/users/**","/roles/**").hasAuthority("ADMIN");
		http.authorizeRequests().antMatchers("/scolarite/**").hasAuthority("ADMIN");
		http.authorizeRequests().anyRequest().authenticated();
		http.addFilter(new JWTAuthenticationFilter(authenticationManager()));
		http.addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
		/*	
		http.authorizeRequests().antMatchers("/etudiants").hasRole("ADMIN");
		http.exceptionHandling().accessDeniedPage("/403");
		*/
	}
}
