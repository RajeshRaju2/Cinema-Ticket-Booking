package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	private int bookingId;
	private int movieId;
	private int no_ofSeatsSelected;
	private String showTime;
	private String showDate;
	private String amount;
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	public int getBookingId() {
		return bookingId;
	}





	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}





	public Booking(int bookingId, int movieId, int no_ofSeatsSelected, String showTime, String showDate,
			String amount) {
		super();
		this.bookingId = bookingId;
		this.movieId = movieId;
		this.no_ofSeatsSelected = no_ofSeatsSelected;
		this.showTime = showTime;
		this.showDate = showDate;
		this.amount = amount;
	}





	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public int getNo_ofSeatsSelected() {
		return no_ofSeatsSelected;
	}


	public void setNo_ofSeatsSelected(int no_ofSeatsSelected) {
		this.no_ofSeatsSelected = no_ofSeatsSelected;
	}


	public String getShowTime() {
		return showTime;
	}


	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}


	public String getShowDate() {
		return showDate;
	}


	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}





	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", movieId=" + movieId + ", no_ofSeatsSelected=" + no_ofSeatsSelected
				+ ", showTime=" + showTime + ", showDate=" + showDate + ", amount=" + amount + "]";
	}





	public Booking uniqueResult() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}
