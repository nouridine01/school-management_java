package com.noor.school.exceptions;

public class ModuleNotFoundException extends RuntimeException {
	public ModuleNotFoundException(Long id) {
	    super("Could not find module " + id);
	  }
}
