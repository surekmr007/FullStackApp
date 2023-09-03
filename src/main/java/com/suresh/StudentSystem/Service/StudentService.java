package com.suresh.StudentSystem.Service;

import java.util.List;

import com.suresh.StudentSystem.Model.Student;

public interface StudentService {
	public Student saveStudent(Student student);

	public List<Student> getAllStudents();

	public void deleteStudentById(int id);
	
	public Student getStudentById(int id);
	

}
