package com.saumya.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saumya.project.model.Student;
import com.saumya.project.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public Student findById(int id) {

		return studentRepository.findById(id).orElse(null);
	}

	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

	public void deletebyId(int id) {

		studentRepository.deleteById(id);
	}

	public void updateStudent(Student stu) {

		studentRepository.save(stu);
	}

	public Student createStudentVal(Student stu) {

		return studentRepository.save(stu);
	}
}
