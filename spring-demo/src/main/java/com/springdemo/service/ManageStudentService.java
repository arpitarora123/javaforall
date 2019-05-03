package com.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.Student;
import com.springdemo.repository.StudentRepository;

@Service
public class ManageStudentService {

	@Autowired
	StudentRepository studentRepository;

	public void loadAllStudents() {
		System.out.println("Loading students in Service");

		for (Student student : studentRepository.loadStudents()) {
			System.out.println("Student Name: " + student.getName());
		}
		System.out.println("Loaded students in Service");
	}
}
