package com.rest.student.springcurd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.student.springcurd.entity.Student;
import com.rest.student.springcurd.repository.StudentDAO;

@Service
public class StudentServicesImplimentation implements StudentServices {

	@Autowired
	private StudentDAO studentDAO;

	public StudentServicesImplimentation() {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDAO.findAll();
	}

	@Override
	public Student getStudentsById(long studentId) {
		// TODO Auto-generated method stub
		return studentDAO.getReferenceById(studentId);
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDAO.save(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDAO.save(student);
		return student;
	}

	@Override
	public void deleteStudent(long studentId) {
		// TODO Auto-generated method stub

		/*
		 * Student entity = studentDAO.getReferenceById(studentId);
		 * studentDAO.delete(entity);
		 */

		studentDAO.deleteById(studentId);
	}

}
