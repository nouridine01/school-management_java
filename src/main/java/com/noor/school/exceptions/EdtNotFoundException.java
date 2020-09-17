package com.noor.school.exceptions;

public class EdtNotFoundException extends RuntimeException {
	public EdtNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
