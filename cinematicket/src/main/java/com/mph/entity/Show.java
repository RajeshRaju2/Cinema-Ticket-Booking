package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Show {
@Id
private int showId;
private int startTime;
private int endTime;
private String language;
private Ticket ticket;
public Show() {
	super();
	// TODO Auto-generated constructor stub
}
public Show(int showId, int startTime, int endTime, String language, Ticket ticket) {
	super();
	this.showId = showId;
	this.startTime = startTime;
	this.endTime = endTime;
	this.language = language;
	this.ticket = ticket;
}
public int getShowId() {
	return showId;
}
public void setShowId(int showId) {
	this.showId = showId;
}
public int getStartTime() {
	return startTime;
}
public void setStartTime(int startTime) {
	this.startTime = startTime;
}
public int getEndTime() {
	return endTime;
}
public void setEndTime(int endTime) {
	this.endTime = endTime;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public Ticket getTicket() {
	return ticket;
}
public void setTicket(Ticket ticket) {
	this.ticket = ticket;
}
@Override
public String toString() {
	return "Show [showId=" + showId + ", startTime=" + startTime + ", endTime=" + endTime + ", language=" + language
			+ ", ticket=" + ticket + "]";
}



}
