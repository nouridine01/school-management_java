package com.noor.school.exceptions;

public class SemaineNotFoundException extends RuntimeException {
	public SemaineNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
