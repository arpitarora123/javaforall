package com.springdemo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springdemo.Student;

@Repository
public class StudentRepository {

	public List<Student> loadStudents() {

		System.out.println("Fetching students from repo");

		List<Student> students = new ArrayList<Student>();
		Student student = new Student();
		student.setName("Arpit");
		students.add(student);

		System.out.println("Returning students from repo");
		return students;

	}
}
