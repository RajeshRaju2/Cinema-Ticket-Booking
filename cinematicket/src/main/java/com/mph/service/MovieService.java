package com.mph.service;

import java.util.List;

import com.mph.entity.Movie;

public interface MovieService {

	public void addmovie(Movie movie);
	public List<Movie> deleteMovie(int movieid);

}
