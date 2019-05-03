package com.spring.demo.springwitharpit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.demo.scan.ComponentScanDAO;

@SpringBootApplication
@ComponentScan("com.spring.demo.scan")
public class SpringWithShreyaApplicationComponentScan {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(SpringWithShreyaApplicationComponentScan.class, args);

		ComponentScanDAO componentScanDAO = applicationContext.getBean(ComponentScanDAO.class);
		System.out.println("ComponentScanDAO - 1 : " + componentScanDAO);
		System.out.println("JDBC Connection - 1 : " + componentScanDAO.getDBConnenction());
	}

}
