package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.SeatDao;
import com.mph.entity.Seat;

@Transactional
@Service
public class SeatServiceImpl implements SeatService{
	
	@Autowired
	SeatDao seatDao;
	
	/*
	@Override
	public void addSeat(Seat seat) {
		// TODO Auto-generated method stub
		seatDao.addSeat(seat);
	}*/

	@Override
	public List<Seat> deleteSeat(int seatId) {
		// TODO Auto-generated method stub
		return seatDao.deleteSeat(seatId);
	}

	@Override
	public Seat getSeatById(int seatId) {
		// TODO Auto-generated method stub
		return seatDao.getSeatById(seatId);
	}

	@Override
	public List<Seat> updateSeat(Seat seat) {
		// TODO Auto-generated method stub
		return seatDao.updateSeat(seat);
	}

	@Override
	public void addSeat(Seat seat) {
		// TODO Auto-generated method stub
		seatDao.addSeat(seat);	
	}

	

}
