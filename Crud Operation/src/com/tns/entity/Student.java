package com.tns.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name="student") 

public class Student implements Serializable 
{
	private static final long serialVersionUID = 1L; 
	@Id
	@Column
	private int studentid;
	private String name;
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}