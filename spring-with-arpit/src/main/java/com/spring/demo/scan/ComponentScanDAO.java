package com.spring.demo.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentScanDAO {

	@Autowired
	DBConnection dbConnenction;

	public DBConnection getDBConnenction() {
		return dbConnenction;
	}

	public void setDBConnenction(DBConnection dbConnenction) {
		this.dbConnenction = dbConnenction;
	}

}
