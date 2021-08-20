package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Seat;


@Repository
public class SeatDaoImpl implements SeatDao{

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addSeat(Seat seat) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(seat);
		System.out.println("seat added Successfully :)");
	}

	@Override
	public List<Seat> deleteSeat(int seatId) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("delete from User user where seatId=:seatId");
		query.setParameter("userId", seatId);
		int no_ofRows = query.executeUpdate();
		if(no_ofRows >0)
		{
			System.out.println("Deleted " + no_ofRows + " rows");
		}
		return getAllSeats();
	}

	private List<Seat> getAllSeats() {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from Seat seat");
		@SuppressWarnings("unchecked")
		List<Seat> seatList = query.list();
		return seatList;
	}

	@Override
	public Seat getSeatById(int seatId) {
		Criteria c = getSession().createCriteria(Seat.class);
		c.add(Restrictions.eq("userId", seatId));
	     Seat s = (Seat)c.uniqueResult();
		System.out.println("Seat Found : " +s);
		return s;
	}

	@Override
	public List<Seat> updateSeat(Seat seat) {
		Query query = getSession().createQuery("update Seat seat set seatId=:seatId,seatName=:seatName,no_of_seats=:no_of_seats");
		query.setParameter("seatId", seat.getSeatId());
		query.setParameter("seatName",seat.getSeatName());
		query.setParameter("no_of_Seats",seat.getNo_of_seats());
		
		int noofrows = query.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Updated " + noofrows + " rows");
		}
		return getAllSeats();
	}

}
