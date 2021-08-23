package com.mph.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;


import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Seat_Table")
public class Seat {
@Id	
@GeneratedValue(strategy = GenerationType.AUTO)
private int seatId;
private String seatName;
private int no_of_seats;

@OneToOne(mappedBy="Booking") 
private List<Seat> seat;

@JoinColumn(name="bookingId")
private Booking booking; 



public Seat(int seatId, String seatName, int no_of_seats) {
	super();
	this.seatId = seatId;
	this.seatName = seatName;
	this.no_of_seats = no_of_seats;
}
public Seat() {
	super();
	// TODO Auto-generated constructor stub
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
public int getNo_of_seats() {
	return no_of_seats;
}
public void setNo_of_seats(int no_of_seats) {
	this.no_of_seats = no_of_seats;
}
@Override
public String toString() {
	return "Seat [seatId=" + seatId + ", seatName=" + seatName + ", no_of_seats=" + no_of_seats + "]";
}
public Seat uniqueResult() {
	// TODO Auto-generated method stub
	return null;
}


}
