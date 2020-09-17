package com.noor.school.exceptions;

public class PersonnelNotFoundException extends RuntimeException {
	public PersonnelNotFoundException(Long id) {
	    super("Could not find personnel " + id);
	  }
}
