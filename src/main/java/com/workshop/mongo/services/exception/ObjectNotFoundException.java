package com.workshop.mongo.services.exception;

/***
 * 
 * @author Dionatan Leão
 *
 */

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
}
