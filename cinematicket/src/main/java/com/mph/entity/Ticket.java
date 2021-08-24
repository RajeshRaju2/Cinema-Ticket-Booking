package com.mph.entity;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Ticket_Table9")
public class Ticket {
	@Id


	//@Column(name="ticket_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketId;


	@OneToOne
	@JoinColumn(name="seatId")
	private Seat seat;

	@ManyToOne
	@JoinColumn(name="bookingId")
	private Booking booking;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int ticketId, int price, Seat seat, Booking booking) {
		super();
		this.ticketId = ticketId;
		this.seat = seat;
		this.booking = booking;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId  + ", seat=" + seat + ", booking=" + booking + "]";
	}
	
	
	

	

}
