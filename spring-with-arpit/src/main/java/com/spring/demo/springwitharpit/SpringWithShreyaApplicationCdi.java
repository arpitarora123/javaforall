package com.spring.demo.springwitharpit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.demo.springwitharpit.cdi.CdiExampleDAO;

@SpringBootApplication
public class SpringWithShreyaApplicationCdi {

	public static void main(String[] args) {
		// SpringApplication.run(SpringWithShreyaApplication.class, args);

		int arr[] = { 1, 2, 3, 4, 5 };
		//
		// SearchImpl searchImpl = new SearchImpl();
		// searchImpl.setSort(new QuickSort());
		// System.out.println(searchImpl.search(arr, 3));

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringWithShreyaApplicationCdi.class,
				args);

		CdiExampleDAO cdiExampleDAO = applicationContext.getBean(CdiExampleDAO.class);
		System.out.println("CdiExampleDAO - 1 : " + cdiExampleDAO);
		System.out.println("JDBC Connection - 1 : " + cdiExampleDAO.getJdbcConnenction());

	}

}
