package com.mph.entity;





import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Ticket_Table")
public class Ticket {
@Id


//@Column(name="ticket_id")

private int ticketId;
private int price;

@OneToOne
@JoinColumn(name="seatId")
private Seat seat;

public Ticket() {
	super();
	// TODO Auto-generated constructor stub
}

public Ticket(int ticketId, int price, Seat seat) {
	super();
	this.ticketId = ticketId;
	this.price = price;
	this.seat = seat;
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

public Seat getSeat() {
	return seat;
}

public void setSeat(Seat seat) {
	this.seat = seat;
}

@Override
public String toString() {
	return "Ticket [ticketId=" + ticketId + ", price=" + price + ", seat=" + seat + "]";
	}
	
}
