package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
		getSession().saveOrUpdate(ticket);
		System.out.println("show added Successfully :)");
	}

	@Override
	public List<Ticket> deleteTicket(int ticketId) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("delete from Ticket where ticketId=:ticketId");
		query.setParameter("ticketId", ticketId);
		int no_ofRows = query.executeUpdate();
		if(no_ofRows >0)
		{
			System.out.println("Deleted " + no_ofRows + " rows");
		}
		return getAllTickets();
	}

	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from Ticket ticket");
		@SuppressWarnings("unchecked")
		List<Ticket> ticketList = query.list();
		return ticketList;
	}


	@Override
	public Ticket getTicketById(int ticketId) {
		// TODO Auto-generated method stub
		Criteria c = getSession().createCriteria(Ticket.class);
		 c.add(Restrictions.eq("ticketId", ticketId));
	     Ticket tick = (Ticket)c.uniqueResult();
		System.out.println("Seat Found : " +tick);
		return tick;
	}

	@Override
	public List<Ticket> updateTicket(Ticket ticket) {
		Query query = getSession().createQuery("update Ticket set ticketId=:ticketId,price=:price,seatNumber=:seatNumber,showDate=:showDate,showId=:showId");
	
		
		int noofrows = query.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Updated " + noofrows + " rows");
		}
		return getAllTickets();
	}
	

}
