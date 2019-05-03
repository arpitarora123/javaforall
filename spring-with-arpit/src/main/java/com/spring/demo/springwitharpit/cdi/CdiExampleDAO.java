package com.spring.demo.springwitharpit.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiExampleDAO {

	@Inject
	CdiExampleJDBCConnection jdbcConnenction;

	public CdiExampleJDBCConnection getJdbcConnenction() {
		return jdbcConnenction;
	}

	public void setJdbcConnenction(CdiExampleJDBCConnection jdbcConnenction) {
		this.jdbcConnenction = jdbcConnenction;
	}

}
