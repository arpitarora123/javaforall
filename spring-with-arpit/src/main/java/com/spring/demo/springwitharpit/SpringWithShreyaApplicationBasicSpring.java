package com.spring.demo.springwitharpit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.demo.springwitharpit.scope.EmployeeDAO;

@Configuration
@ComponentScan
public class SpringWithShreyaApplicationBasicSpring {

	private final static Logger LOGGER = LoggerFactory.getLogger(SpringWithShreyaApplicationBasicSpring.class);

	public static void main(String[] args) {
		// SpringApplication.run(SpringWithShreyaApplication.class, args);

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringWithShreyaApplicationBasicSpring.class)) {

			EmployeeDAO employeeDAO1 = applicationContext.getBean(EmployeeDAO.class);
			LOGGER.info("EmployeeDAO - 1 {}: ", employeeDAO1);
			LOGGER.info("JDBC Connection - 1 {}: " + employeeDAO1.getJdbcConnenction());
		}
	}

}
