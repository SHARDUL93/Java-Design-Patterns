package com.shardul.pattern.movietickets.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shardul.pattern.movietickets.entities.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String sql = "insert into ticket (movie, screen, seat) values(?,?,?)";

	@Override
	public void create(Ticket ticket) {

		jdbcTemplate.update(sql, ticket.getMovie(), ticket.getScreen(), ticket.getSeat());

	}

}
