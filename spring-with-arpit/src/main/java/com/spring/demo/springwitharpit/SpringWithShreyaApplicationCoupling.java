package com.spring.demo.springwitharpit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.demo.springwitharpit.coupling.SearchImpl;

@SpringBootApplication
public class SpringWithShreyaApplicationCoupling {

	private static Logger logger = LoggerFactory.getLogger(SpringWithShreyaApplicationCoupling.class);

	public static void main(String[] args) {
		// SpringApplication.run(SpringWithShreyaApplication.class, args);

		int arr[] = { 1, 2, 3, 4, 5 };
		//
		// SearchImpl searchImpl = new SearchImpl();
		// searchImpl.setSort(new QuickSort());
		// System.out.println(searchImpl.search(arr, 3));

		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(SpringWithShreyaApplicationCoupling.class, args);

		SearchImpl searchImpl = applicationContext.getBean(SearchImpl.class);
		// System.out.println("EmployeeDAO - 1 : " + searchImpl.search(arr, 3));

		logger.info("EmployeeDAO - 1 : {} , sorting used {}", searchImpl.search(arr, 3), searchImpl.getSort());

	}

}
