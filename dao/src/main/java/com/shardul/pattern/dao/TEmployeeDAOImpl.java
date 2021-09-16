package com.shardul.pattern.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TEmployeeDAOImpl implements TEmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void create(TEmployee temployee) {

		String sql = "insert into temployee values(?,?)";
		jdbcTemplate.update(sql, temployee.getId(), temployee.getName());

	}

}
