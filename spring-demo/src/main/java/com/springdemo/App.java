package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.service.ManageStudentService;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello Students!");

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext()) {
			applicationContext.register(AppConfig.class);
			applicationContext.refresh();

			ManageStudentService manageStudentService = applicationContext.getBean(ManageStudentService.class);
			manageStudentService.loadAllStudents();
		}

	}
}
