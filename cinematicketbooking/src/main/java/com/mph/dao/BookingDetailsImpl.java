package com.mph.dao;

import java.sql.ResultSet;


import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.mph.dao.BookingDetailsDao.*;
import com.mph.dao.entity.ShowTimings;
import com.mph.dao.ShowTimingsDao;
import com.mph.dao.entity.BookingDetails;
import com.mph.service.HConnect;
import com.mph.service.JConnect;

@org.springframework.transaction.annotation.Transactional
@Repository
@Service

	public class BookingDetailsImpl implements BookingDetailsDao {

	BookingDetailsDao bd;

	private HConnect con;
	@Autowired
	public boolean insert(BookingDetailsDao bd) {

		try {
			
			Session session = con.getSession();
			Transaction t = session.beginTransaction();
			session.save(bd);
			t.commit();
			session.close();
			return true;
			
		} catch (Exception e) {
			
			System.out.println("Exception(ADD): " + e);
			return false;
		
		}

	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<BookingDetailsDao> getAllBookingDetails() {

		List<BookingDetailsDao> bd= new ArrayList<BookingDetailsDao>();
		
		try {
			
			Session session = con.getSession();
			Transaction t = session.beginTransaction();
			bd=session.createCriteria(BookingDetailsDao.class).list();
			t.commit();
			session.close();
			return bd;
			
		} catch (Exception e) {
			System.out.println("Exception(ADD): " + e);
			return bd;
		}
		
	}

	public boolean delete(long bookingDetailId) {

		try {
			
			Statement st=JConnect.getStatement();
			st.executeUpdate("delete from booking_details where BOOK_ID='"+bookingDetailId+"'");
			return true;
			
		}catch(Exception exception) {
			exception.printStackTrace();
			return false;
		}
		
	}

	public boolean update(BookingDetailsDao bd) {

		try {
			Session session = con.getSession();
			Transaction t = session.beginTransaction();
			session.update(bd);
			t.commit();
			session.close();
			return true;
			
		}catch (Exception e) {
				System.out.println("Exception(ADD): " + e);
				return false;
		}
		
	}

	public BookingDetailsDao getBookingDetailById(String bookingDetailId) {

		
		
		try {
			    
				Statement st=JConnect.getStatement();
				ResultSet rs=st.executeQuery("select * from booking_details where SEATS='"+bookingDetailId+"'");
				while(rs.next()){
					bd.setId(rs.getLong("BOOK_ID"));
					bd.setDate(rs.getString("BOOK_DTE"));
					bd.setTime(rs.getString("BOOK_TME"));
					bd.setAmount(rs.getString("BOOK_AMT"));
				    bd.setCount(rs.getString("BOOK_T_CNT"));
					bd.setShowDate(rs.getString("BOOK_S_DTE"));
				    bd.setShowTime(rs.getString("BOOK_S_TME"));
					bd.setMovie(rs.getString("MOVIE"));
					bd.setStatus(rs.getString("BOOK_S"));
					//bd.setEmail(rs.getString("USER"));
					bd.setCinema(rs.getString("CINEMA"));
					bd.setCombo(rs.getString("COMBO"));
					//bd.setSeats(rs.getString("SEATS"));
				}
				
				return bd;
			
		}catch(Exception exception) {
			exception.printStackTrace();
			return bd;
		}
		
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<BookingDetailsDao> getAllBookingByUser(String email) {
		
		List<BookingDetailsDao> bd= new ArrayList<BookingDetailsDao>();
		
		try {
			
			Session session = con.getSession();
			Transaction t = session.beginTransaction();
			Criteria cr=session.createCriteria(BookingDetailsDao.class);
			cr.add(Restrictions.eq("email", email));
			bd=cr.list();
			t.commit();
			session.close();
			return bd;
			
		} catch (Exception e) {
			System.out.println("Exception(ADD): " + e);
			return bd;
		}
	}

	@Override
	public void setId(long long1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDate(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMovie(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCinema(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCombo(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTime(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAmount(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCount(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShowDate(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShowTime(String string) {
		// TODO Auto-generated method stub
		
	}

}