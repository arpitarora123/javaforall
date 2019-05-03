package com.spring.demo.springwitharpit.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmployeeDAO {

	@Autowired
	JDBCConnection jdbcConnenction;

	public JDBCConnection getJdbcConnenction() {
		return jdbcConnenction;
	}

	public void setJdbcConnenction(JDBCConnection jdbcConnenction) {
		this.jdbcConnenction = jdbcConnenction;
	}

}
