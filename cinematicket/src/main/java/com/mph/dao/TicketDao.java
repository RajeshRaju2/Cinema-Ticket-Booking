package com.mph.dao;

import java.util.List;

import com.mph.entity.Ticket;

public interface TicketDao {
	public void addTicket(Ticket ticket);
	public List<Ticket> deleteTicket(int ticketId);
	public Ticket getTicketById(int ticketId);
	public List<Ticket> updateTicket(Ticket ticket);
}
