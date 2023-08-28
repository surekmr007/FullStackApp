package com.suresh.StudentSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.suresh.StudentSystem.Model.Student;
import com.suresh.StudentSystem.Service.StudentService;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studentService.saveStudent(student);
		return "new student is added";
	}

	@GetMapping("/getAll")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		studentService.deleteStudentById(id);
	}

	@PutMapping("/update/{id}")
	public String updateStudent(@PathVariable("id") int id, @RequestBody Student updatedStudent) {
		Student existingStudent = studentService.getStudentById(id);

		if (existingStudent != null) {
			existingStudent.setName(updatedStudent.getName());
			existingStudent.setAddress(updatedStudent.getAddress());
			studentService.saveStudent(existingStudent); 
			return "Student information updated successfully";
		} else {
			return "Student with ID " + id + " not found";
		}
	}

}
