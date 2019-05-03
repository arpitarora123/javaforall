package com.spring.demo.springwitharpit.cdi;

import javax.inject.Named;

@Named
public class CdiExampleJDBCConnection {

	CdiExampleJDBCConnection() {
		System.out.println("JDBC Connection.");
	}
}
