package com.saumya.project.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {
	
	@Autowired
	Calculator calculator;

	@Test
	public void testAdd() {
		
		int res = calculator.add(5, 6);
		assertEquals(11, res);
		assertNotNull(calculator);
	}
}
