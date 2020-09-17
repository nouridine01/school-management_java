package com.noor.school.exceptions;

public class BulletinNotFoundException extends RuntimeException {
	public BulletinNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
