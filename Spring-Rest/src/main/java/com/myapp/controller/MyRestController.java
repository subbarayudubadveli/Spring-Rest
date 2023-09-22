package com.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/students/{name}")
	public Student getStudentByName(@PathVariable String name) {
		
		Student studentByName = studentDao.getStudentByName(name);
		
		return studentByName;
	}
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		
		Student saveStudent = studentDao.saveStudent(student);
		return saveStudent;
	}
	
	
}
