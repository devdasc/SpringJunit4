package com.junit.maven.spring.DAO;

import org.springframework.stereotype.Component;

import com.junit.maven.spring.dto.Ticket;
@Component
public class TicketDAoImpl implements TicketDAO {

	@Override
	public int createTicket(Ticket ticket) {
		
		return 1;
	}

}
