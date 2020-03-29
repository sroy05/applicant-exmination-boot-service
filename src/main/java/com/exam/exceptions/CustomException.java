package com.exam.exceptions;

public class CustomException  extends RuntimeException{

	String description;
	
	public CustomException(String description) {
		super(description);
	}
	public CustomException(String description, Throwable t) {
		super(description,t);
		
		
	}
	
	
}
