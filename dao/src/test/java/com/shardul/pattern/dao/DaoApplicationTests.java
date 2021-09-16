package com.shardul.pattern.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaoApplicationTests {

	@Autowired
	TEmployeeDAO temployeeDAO;

	@Test
	void testCreate() {

		TEmployee temployee = new TEmployee();
		temployee.setId(456);
		temployee.setName("Bisht");

		temployeeDAO.create(temployee);

	}

}
