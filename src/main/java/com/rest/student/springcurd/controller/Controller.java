package com.rest.student.springcurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.student.springcurd.entity.Student;
import com.rest.student.springcurd.services.StudentServices;

@RestController
public class Controller {

	@Autowired
	private StudentServices studentService;

	@GetMapping("/")
	public String student() {
		return "CRUD using Springboot RestAPI";
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return this.studentService.getStudents();
	}

	@GetMapping("/students/{studentId}")
	public Student getStudentsById(@PathVariable String studentId) {
		return this.studentService.getStudentsById(Long.parseLong(studentId));
	}

	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		Student studentadd = studentService.addStudent(student);
		return new ResponseEntity<Student>(studentadd, HttpStatus.CREATED);
	}

	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return this.studentService.updateStudent(student);
	}

	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studentId) {
		try {
			this.studentService.deleteStudent(Long.parseLong(studentId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
