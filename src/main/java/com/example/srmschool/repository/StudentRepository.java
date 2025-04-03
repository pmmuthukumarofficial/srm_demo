package com.example.srmschool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.srmschool.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	// 100 methods -> findById(), findAll() , save()
	
	// u should to write a methods starts with findBy or getBy
	
	List<Student> findByGender(String gender);  // select * from student where gender=?
	
	// findByGenderAndStd(String gender, int std) -> // select * from student where gender=? and std=?
	
	// findByGreaterThanPrice(int amount); // select * from product where price>?
	
	

}
