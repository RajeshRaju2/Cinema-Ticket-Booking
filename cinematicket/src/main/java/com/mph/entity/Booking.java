package com.mph.entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Booking_Table9")
public class Booking {
	@Id
	private int bookingId;
	private int no_ofseatNameSelected;
	private String movieName;
	private String startTime;
	private String language;
	private int amount;
	private String showDate;
	
	@OneToMany(mappedBy="booking") 
	private List<Seat> seat;

	@OneToMany(mappedBy="booking") 
	private List<Ticket> ticket;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

		
	public Booking(int bookingId, int no_ofseatNameSelected, String movieName, String startTime, String language,
			int amount, String showDate, List<Seat> seat, List<Ticket> ticket) {
		super();
		this.bookingId = bookingId;
		this.no_ofseatNameSelected = no_ofseatNameSelected;
		this.movieName = movieName;
		this.startTime = startTime;
		this.language = language;
		this.amount = amount;
		this.showDate = showDate;
		this.seat = seat;
		this.ticket = ticket;
	}


	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
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

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public List<Seat> getSeat() {
		return seat;
	}

	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", no_ofseatNameSelected=" + no_ofseatNameSelected + ", movieName="
				+ movieName + ", startTime=" + startTime + ", language=" + language + ", amount=" + amount
				+ ", showDate=" + showDate + ", seat=" + seat + ", ticket=" + ticket + "]";
	}
		
}
