package com.rest.student.springcurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.student.springcurd.entity.Student;

public interface StudentDAO extends JpaRepository<Student, Long> {

}
