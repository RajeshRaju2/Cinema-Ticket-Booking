package com.mph.entity;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Seat_Table")
public class Seat {
@Id	

private int seatId;
private String seatName;

@ManyToOne
@JoinColumn(name="bookingId")
private Booking booking; 

@OneToOne(mappedBy="seat")
private Ticket ticket;

public Seat(int seatId, String seatName, Booking booking) {
	super();
	this.seatId = seatId;
	this.seatName = seatName;
	this.booking = booking;
}


public Seat() {
	super();
	// TODO Auto-generated constructor stub
}


public Booking getBooking() {
	return booking;
}
public void setBooking(Booking booking) {
	this.booking = booking;
}
public int getSeatId() {
	return seatId;
}
public void setSeatId(int seatId) {
	this.seatId = seatId;
}
public String getSeatName() {
	return seatName;
}
public void setSeatName(String seatName) {
	this.seatName = seatName;
}


@Override
public String toString() {
	return "Seat [seatId=" + seatId + ", seatName=" + seatName + ", booking=" + booking + "]";
	}
}
