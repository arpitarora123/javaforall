package com.spring.demo.springwitharpit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.springwitharpit.xml.XmlEmployeeDAO;

public class SpringWithShreyaApplicationXmlContext {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			XmlEmployeeDAO employeeDAO1 = applicationContext.getBean(XmlEmployeeDAO.class);
			System.out.println("EmployeeDAO - 1 : " + employeeDAO1);
			System.out.println("JDBC Connection - 1 : " + employeeDAO1.getXmlJDBCConnection());
		}
	}
}
