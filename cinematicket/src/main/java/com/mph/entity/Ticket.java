package com.mph.entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Ticket_Table")
public class Ticket {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

//@Column(name="ticket_id")

private int ticketId;
private int price;
private int seatNumber;
private String showDate;
private int showId;



@OneToOne(mappedBy="booking") 
private List<Seat> seat;


public Ticket() {
	super();
	// TODO Auto-generated constructor stub
}






public Ticket(int ticketId, String theatreName, int price, int seatNumber, String showDate, int showId) {
	super();
	this.ticketId = ticketId;
	
}
public Ticket(int ticketId, int price, int seatNumber, String showDate, int showId) {
	super();
	this.ticketId = ticketId;

	this.price = price;
	this.seatNumber = seatNumber;
	this.showDate = showDate;
	this.showId = showId;
}









public int getticketId() {
	return ticketId;
}


public void setticketId(int ticketId) {
return;
}
	
public int getTicketId() {
	return ticketId;
}

public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
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

	return "Ticket [ticketId=" + ticketId + ", price=" + price + ", seatNumber=" + seatNumber + ", showDate="
			+ showDate + ", showId=" + showId + "]";
}





public String uniqueResult() {
	// TODO Auto-generated method stub
	

	return "Ticket [ticketId=" + ticketId + ", price=" + price + ", seatNumber=" + seatNumber + ", showDate=" + showDate
			+ ", showId=" + showId + "]";

}



}
