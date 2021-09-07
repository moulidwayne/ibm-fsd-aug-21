package com.example.exception;

public class InvalidInputException extends RuntimeException {
	
	private String message;

	public InvalidInputException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	

}
