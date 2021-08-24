package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.TicketDao;
import com.mph.entity.Ticket;

@Transactional
@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketDao ticketDao;
	
	@Override
	public void addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		ticketDao.addTicket(ticket);
		
	}

	@Override
	public List<Ticket> deleteTicket(int ticketId) {
		// TODO Auto-generated method stub
		return ticketDao.deleteTicket(ticketId);
	}

	@Override
	public Ticket getTicketById(int ticketId) {
		// TODO Auto-generated method stub
		return ticketDao.getTicketById(ticketId);
	}

	@Override
	public List<Ticket> updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketDao.updateTicket(ticket);
	}

	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketDao.getAllTickets();
	}

}
