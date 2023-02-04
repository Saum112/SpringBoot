package com.saumya.project;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.saumya.project.model.Student;

@SpringBootTest
class Demo1ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testGetStudent() {
		
		RestTemplate restTemplate = new RestTemplate();
		Student stu = restTemplate.getForObject("http://localhost:8080/data/students/12", Student.class);
		assertNotNull(stu);
		assertEquals("Saumi AAwasthi", stu.getName());
		
	}

}
