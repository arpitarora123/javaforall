package com.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.repository.StudentRepository;

@Service
public class ManageStudentService {

	@Autowired
	StudentRepository studentRepository;

	public void loadAllStudents() {
		System.out.println("Loading students from Service");

		System.out.println(studentRepository.loadStudents());
	}
}
