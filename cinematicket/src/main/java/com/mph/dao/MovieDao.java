package com.mph.dao;

import java.util.List;

import com.mph.entity.Movie;

public interface MovieDao {
	public void addMovie(Movie movie);

	public List<Movie> deleteMovie(int movieId);

	public Movie getMovieById(int movieId);

	public List<Movie> updatemovie(Movie movie);
}
