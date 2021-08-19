package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.MovieDao;
import com.mph.entity.Movie;
@Transactional
@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	MovieDao movieDao;
	
	@Override
	public void addmovie(Movie movie) {
		// TODO Auto-generated method stub
		movieDao.addMovie(movie);
	}

	@Override
	public List<Movie> deleteMovie(int movieid) {
		// TODO Auto-generated method stub
		return movieDao.deleteMovie(movieid);
	}

}
