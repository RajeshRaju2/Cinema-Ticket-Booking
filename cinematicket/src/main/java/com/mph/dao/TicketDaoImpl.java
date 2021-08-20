package com.mph.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	

	@Override
	public void addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ticket> deleteTicket(int ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket getTicketById(int ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return null;
	}

}
