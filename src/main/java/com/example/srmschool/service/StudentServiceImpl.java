package com.example.srmschool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.srmschool.model.Student;
import com.example.srmschool.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll(); // select * from student
	}

	@Override
	public Optional<Student> searchStudent(int rollno) {
		
		return studentRepo.findById(rollno);// select * from student where rolno=?
	}

	@Override
	public Student addNewStudent(Student newStudent) {
		
		return studentRepo.save(newStudent); // insert into student values(?, ?, ?) or update 
	}

	@Override
	public void deleteStudent(int rollno) {
		studentRepo.deleteById(rollno);
	}

	@Override
	public List<Student> getStudentsGenderWise(String gender) {		
		return studentRepo.findByGender(gender);
	}

	
	
}
