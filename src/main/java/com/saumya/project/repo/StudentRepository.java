package com.saumya.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saumya.project.model.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
