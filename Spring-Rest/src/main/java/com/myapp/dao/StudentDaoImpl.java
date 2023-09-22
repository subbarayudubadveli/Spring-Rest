package com.myapp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.myapp.entity.Student;

@Component
public class StudentDaoImpl implements StudentDao {

	ArrayList<Student> studentList = new ArrayList<Student>();
	
	@PostConstruct
	public void setStudents() {
		studentList.add(new Student(101,"Subbu","Bharat"));
		studentList.add(new Student(102,"Abhilash","Bharat"));
		studentList.add(new Student(103,"Anu","US"));
		studentList.add(new Student(101,"Akhil","US"));
		
	}
	@Override
	public List<Student> getAllStudent() {
	
		return studentList;
	}

}
