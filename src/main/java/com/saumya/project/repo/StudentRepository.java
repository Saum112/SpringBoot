package com.saumya.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saumya.project.model.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{

}
