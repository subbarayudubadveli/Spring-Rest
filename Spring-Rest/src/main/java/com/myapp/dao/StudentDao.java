package com.myapp.dao;

import java.util.List;
import com.myapp.entity.Student;

public interface StudentDao {

	public List<Student> getAllStudent();

	public Student getStudentByName(String name);
	public Student saveStudent(Student student);
}
