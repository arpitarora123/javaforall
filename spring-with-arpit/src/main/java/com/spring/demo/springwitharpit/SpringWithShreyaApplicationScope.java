package com.spring.demo.springwitharpit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.demo.springwitharpit.scope.EmployeeDAO;

@SpringBootApplication
public class SpringWithShreyaApplicationScope {

	public static void main(String[] args) {
		// SpringApplication.run(SpringWithShreyaApplication.class, args);

		int arr[] = { 1, 2, 3, 4, 5 };
		//
		// SearchImpl searchImpl = new SearchImpl();
		// searchImpl.setSort(new QuickSort());
		// System.out.println(searchImpl.search(arr, 3));

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringWithShreyaApplicationScope.class,
				args);

		EmployeeDAO employeeDAO1 = applicationContext.getBean(EmployeeDAO.class);
		System.out.println("EmployeeDAO - 1 : " + employeeDAO1);
		System.out.println("JDBC Connection - 1 : " + employeeDAO1.getJdbcConnenction());

		EmployeeDAO employeeDAO2 = applicationContext.getBean(EmployeeDAO.class);
		System.out.println("EmployeeDAO - 2 : " + employeeDAO2);
		System.out.println("JDBC Connection - 2 : " + employeeDAO2.getJdbcConnenction());

	}

}
