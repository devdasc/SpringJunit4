package com.junit.maven.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.junit.maven.spring.DAO.TicketDAO;
import com.junit.maven.spring.dto.Ticket;
@Component
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketDAO ticketDAO;

	public TicketDAO getTicketDAO() {
		return ticketDAO;
	}

	public void setTicketDAO(TicketDAO ticketDAO) {
		this.ticketDAO = ticketDAO;
	}

	@Override
	public int buyTicket(String passengerName, String phone) {
		Ticket ticket = new Ticket();
		ticket.setPassengerName(passengerName);
		ticket.setPhone(phone);
		return ticketDAO.createTicket(ticket );
		
	}

}
