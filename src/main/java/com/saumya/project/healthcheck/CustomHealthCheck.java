package com.saumya.project.healthcheck;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;

import com.saumya.project.model.Student;
import com.saumya.project.repo.StudentRepository;
import org.springframework.boot.actuate.info.Info;

public class CustomHealthCheck implements InfoContributor {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void contribute(Info.Builder builder) {

		Map<String, String> details = new HashMap<>();
		details.put("bean-definition-count", "3");
		details.put("startup-date", "12-09-200");

		builder.withDetail("context", details);

	}

}
