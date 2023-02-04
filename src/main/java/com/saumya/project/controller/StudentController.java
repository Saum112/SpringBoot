package com.saumya.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.saumya.project.model.Student;
import com.saumya.project.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable("id") int id) {
		Student stu = studentService.findById(id);
		if(stu == null) {
			
			return new ResponseEntity<Student>(stu, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Student>(stu, HttpStatus.OK);
	}

	@GetMapping("/student")
	public List<Student> getAllStudent() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/")
	public String message() {
		
		return "Hello World";
	}

	@PostMapping("/students/create")
	public Student createStudent(@RequestBody Student stu) {
		return studentService.createStudentVal(stu);
	}

	@PutMapping("/students/update")
	public void updateStudent(@RequestBody Student stu) {
		studentService.updateStudent(stu);
	}

}
