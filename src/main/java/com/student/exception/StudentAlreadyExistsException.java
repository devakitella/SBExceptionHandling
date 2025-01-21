package com.student.exception;

@SuppressWarnings("serial")
public class StudentAlreadyExistsException extends Exception {
	
	public StudentAlreadyExistsException(String msg) {
		super(msg);
	}
}
