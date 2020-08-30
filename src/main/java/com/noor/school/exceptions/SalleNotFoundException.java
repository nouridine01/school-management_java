package com.noor.school.exceptions;

public class SalleNotFoundException extends RuntimeException {
	public SalleNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
