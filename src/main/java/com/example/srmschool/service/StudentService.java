package com.example.srmschool.service;

import java.util.List;
import java.util.Optional;

import com.example.srmschool.model.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	List<Student> getStudentsGenderWise(String gender);
	
	Optional<Student> searchStudent(int rollno);
	
	Student addNewStudent(Student newStudent);
	
	void deleteStudent(int rollno);
	
	
}
