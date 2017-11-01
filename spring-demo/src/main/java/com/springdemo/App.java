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

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				AppConfig.class)) {
			/**
			 * Either register the config class like below or pass in the
			 * constructor as above.
			 * 
			 * if you pass config class in the constructor no need to referesh
			 * the context
			 */
			// applicationContext.register(AppConfig.class);
			// applicationContext.refresh();

			ManageStudentService manageStudentService = applicationContext.getBean(ManageStudentService.class);
			manageStudentService.loadAllStudents();
		}

	}
}
