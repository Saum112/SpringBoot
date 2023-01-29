package com.saumya.project.repo;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.saumya.project.model.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepoTest {

	@Autowired
	private StudentRepository repository;
	
	@Test
	public void testStudentRepo() {
		Student student = new Student(1l , "Saumya" , 123);
		repository.save(student);
		Student savedStudent = repository.findById(1l).get();
		assertNotNull(savedStudent);
		assertEquals(student.getName(), savedStudent.getName());
		assertEquals(student.getId(), savedStudent.getId());
		assertEquals(student.getTestscore(), savedStudent.getTestscore());
	}

}
