package com.shardul.pattern.movietickets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.shardul.pattern.movietickets.entities.Ticket;
import com.shardul.pattern.movietickets.bo.Ticket;
import com.shardul.pattern.movietickets.dao.TicketDao;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketDao dao;

	@Override
	public void purchaseTicket(Ticket ticket) {
		// process payment
		com.shardul.pattern.movietickets.entities.Ticket ticketEntity = new com.shardul.pattern.movietickets.entities.Ticket();

		ticketEntity.setId(ticket.getId());
		ticketEntity.setMovie(ticket.getMovieName());
		ticketEntity.setScreen(ticket.getScreenNo());
		ticketEntity.setSeat(ticket.getSeatNo());

		dao.create(ticketEntity);

		// email ticket

	}

}
