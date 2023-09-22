package com.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.dao.StudentDao;
import com.myapp.entity.Student;

@RestController
public class MyRestController {
	
	@Autowired
	private StudentDao studentDao;
	

	@GetMapping(value="/student"
			,produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Student getStudent() {
		
		Student student = new Student(1, "subbarayudu","Bharat");
		
		return student;
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudnets(){
		
	return studentDao.getAllStudent();
		
	}
	
	
	
}
