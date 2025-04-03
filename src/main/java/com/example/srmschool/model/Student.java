package com.example.srmschool.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student { // POJO plain old java object

	@Id
	private Integer rollno;
	private String name;
	private String gender;
	private Integer std;
	private Character section;
	
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getStd() {
		return std;
	}
	public void setStd(Integer std) {
		this.std = std;
	}
	public Character getSection() {
		return section;
	}
	public void setSection(Character section) {
		this.section = section;
	}
	
	
}
