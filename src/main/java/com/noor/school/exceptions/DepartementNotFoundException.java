package com.noor.school.exceptions;

public class DepartementNotFoundException extends RuntimeException {
	public DepartementNotFoundException(Long id) {
	    super("Could not find département " + id);
	  }
}
