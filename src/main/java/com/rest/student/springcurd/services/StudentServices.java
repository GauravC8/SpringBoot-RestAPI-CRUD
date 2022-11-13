package com.rest.student.springcurd.services;

import java.util.List;

import com.rest.student.springcurd.entity.Student;

public interface StudentServices {

	public List<Student> getStudents();

	Student getStudentsById(long studentId);

	Student addStudent(Student student);

	Student updateStudent(Student student);

	void deleteStudent(long studentId);
}
