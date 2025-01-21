package com.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class StudentDetails {
	
	@Id
	@Column
	Integer studentId;

	@Column
	String studentName;
	
	@Column
	String studentLoc;
	
	public StudentDetails(Integer studentId, String studentName, String studentLoc) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentLoc = studentLoc;
	}

	public StudentDetails() {
		
	}
	
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentLoc() {
		return studentLoc;
	}

	public void setStudentLoc(String studentLoc) {
		this.studentLoc = studentLoc;
	}
}
