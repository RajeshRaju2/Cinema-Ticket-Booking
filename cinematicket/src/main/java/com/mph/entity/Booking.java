package com.mph.entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Booking1")
public class Booking {
	@Id

	private int bookingId;
	private int no_ofseatNameSelected;
	private int amount;
	
	@OneToMany(mappedBy="booking") 
	private List<Seat> seat;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Booking(int bookingId, int no_ofseatNameSelected, int amount, List<Seat> seat) {
		super();
		this.bookingId = bookingId;
		this.no_ofseatNameSelected = no_ofseatNameSelected;
		this.setAmount(amount);
		this.seat = seat;
	}
	
	public int getBookingId() {
		return bookingId;
	}
	
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	
	public int getNo_ofseatNameSelected() {
		return no_ofseatNameSelected;
	}

	public void setNo_ofseatNameSelected(int no_ofseatNameSelected) {
		this.no_ofseatNameSelected = no_ofseatNameSelected;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", no_ofseatNameSelected=" + no_ofseatNameSelected + ", amount="
				+ amount + ", seat=" + seat + "]";
	}
	
}
