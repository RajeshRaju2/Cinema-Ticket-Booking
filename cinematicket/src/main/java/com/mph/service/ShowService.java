package com.mph.service;

import java.util.List;

import com.mph.entity.Show;

public interface ShowService {
	public void addShow(Show show);
	public List<Show> deleteShow(int showId);
	public Show getShowById(int showId);
	public List<Show> updateShow(Show show);
}
