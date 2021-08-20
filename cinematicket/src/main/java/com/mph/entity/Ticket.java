package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
@Id
private int ticketNumber;
private int price;
private int seatNumber;
private String showDate;
private int showId;


public Ticket() {
	super();
	// TODO Auto-generated constructor stub
}





public Ticket(int ticketNumber, String theatreName, int price, int seatNumber, String showDate, int showId) {
	super();
	this.ticketNumber = ticketNumber;
	
	this.price = price;
	this.seatNumber = seatNumber;
	this.showDate = showDate;
	this.showId = showId;
}








public int getTicketNumber() {
	return ticketNumber;
}


public void setTicketNumber(int ticketNumber) {
	this.ticketNumber = ticketNumber;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public int getSeatNumber() {
	return seatNumber;
}


public void setSeatNumber(int seatNumber) {
	this.seatNumber = seatNumber;
}


public String getShowDate() {
	return showDate;
}


public void setShowDate(String showDate) {
	this.showDate = showDate;
}


public int getShowId() {
	return showId;
}


public void setShowId(int showId) {
	this.showId = showId;
}


@Override
public String toString() {
	return "Ticket [ticketNumber=" + ticketNumber + ", price=" + price + ", seatNumber=" + seatNumber + ", showDate="
			+ showDate + ", showId=" + showId + "]";
}



}
