package com.mph.entity;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Movie{
@Id
private int movieId;
private String movieName;
private Show show;

public Movie() {
	super();
	// TODO Auto-generated constructor stub
}
public Movie(int movieId, String movieName, Show show) {
	super();
	this.movieId = movieId;
	this.movieName = movieName;
	this.show = show;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public Show getShow() {
	return show;
}
public void setShow(Show show) {
	this.show = show;
}
@Override
public String toString() {
	return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", show=" + show + "]";
}


}
