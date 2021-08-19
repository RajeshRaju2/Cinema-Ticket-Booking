package com.mph.dao;

import java.util.List;

import com.mph.dao.entity.Cinemas;

public interface CinemaDao{
	
	public boolean insert(Cinemas cinema);
	public List<Cinemas> getAllCinemas();
	public boolean delete(long cinemaId);
	public boolean update(Cinemas cinema);
	public Cinemas getCinemaById(String cinemaId);
}