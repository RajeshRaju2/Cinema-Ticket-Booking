package com.mph.dao;

import java.util.List;

import com.mph.dao.entity.BookingDetails;

public interface BookingDetailsDao {

	public boolean insert(BookingDetailsDao bd);
	public List<BookingDetailsDao> getAllBookingDetails();
	public List<BookingDetailsDao> getAllBookingByUser(String email);
	public boolean delete(long bookingDetailId);
	public boolean update(BookingDetailsDao bd);
	public BookingDetailsDao getBookingDetailById(String bookingDetailId);
	public void setId(long long1);
	public void setDate(String string);
	public void setMovie(String string);
	public void setStatus(String string);
	public void setCinema(String string);
	public void setCombo(String string);
	public void setTime(String string);
	public void setAmount(String string);
	public void setCount(String string);
	public void setShowDate(String string);
	public void setShowTime(String string);
	
}