package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Theatre {
	
private int theaterId;
private String theaterName;
private String location;
private Seat seat;

public Theatre() {
	super();
	// TODO Auto-generated constructor stub
}

public Theatre(int theaterId, String theaterName, String location, Seat seat) {
	super();
	this.theaterId = theaterId;
	this.theaterName = theaterName;
	this.location = location;
	this.seat = seat;
}

public int getTheaterId() {
	return theaterId;
}

public void setTheaterId(int theaterId) {
	this.theaterId = theaterId;
}

public String getTheaterName() {
	return theaterName;
}

public void setTheaterName(String theaterName) {
	this.theaterName = theaterName;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public Seat getSeat() {
	return seat;
}

public void setSeat(Seat seat) {
	this.seat = seat;
}

@Override
public String toString() {
	return "Theatre [theaterId=" + theaterId + ", theaterName=" + theaterName + ", location=" + location + ", seat="
			+ seat + "]";
}



}
