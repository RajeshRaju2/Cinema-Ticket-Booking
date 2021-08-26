package com.mph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@Column(name="MOVIE_ID")
	private int movieId;
	@Column(name="MOVIE_NAME")
	private String movieName;
	@Column(name="LANGUAGE")
	private String language;
	@Column(name="AMOUNT")
	private int amount;
	@Column(name="DESCRIPTION")
	private String description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	public Admin(int movieId, String movieName, String language, int amount, String description) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.amount = amount;
		this.description = description;
	}
	
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [movieId=" + movieId + ", movieName=" + movieName + ", language=" + language + ", amount="
				+ amount + ", description=" + description + "]";
	}	
	

	
}
