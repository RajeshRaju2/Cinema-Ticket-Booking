package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.BookingDao;
import com.mph.entity.Booking;
@Transactional
@Service
public class BookingServiceImpl implements BookingService {

	
	@Autowired
	BookingDao bookingDao;
	
	@Override
	public void addBooking(Booking booking) {
		// TODO Auto-generated method stub
		bookingDao.addBooking(booking);
	}

	@Override
	public List<Booking> deleteBooking(int bookingId) {
		// TODO Auto-generated method stub
		return bookingDao.deleteBooking(bookingId);
	}

	@Override
	public Booking getBookingById(int bookingId) {
		// TODO Auto-generated method stub
		return bookingDao.getBookingById(bookingId);
	}

	@Override
	public List<Booking> updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingDao.updateBooking(booking);
	}

	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		return bookingDao.getAllBooking();
	}

}
