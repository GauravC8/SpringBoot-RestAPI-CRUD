package com.rest.student.springcurd.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private long studentId;
	private String studentName;
	private int age;
	private String gender;
	private String address;

	public Student() {
	}

	public Student(long studentId, String studentName, int age, String gender, String address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", gender="
				+ gender + ", address=" + address + "]";
	}

}
