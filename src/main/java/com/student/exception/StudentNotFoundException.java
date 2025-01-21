package com.student.exception;

@SuppressWarnings("serial")
public class StudentNotFoundException extends Exception {
	
	public StudentNotFoundException(String msg) {
		super(msg);
	}

}