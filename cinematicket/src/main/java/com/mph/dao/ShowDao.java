package com.mph.dao;

import java.util.List;

import com.mph.entity.Show;

public interface ShowDao {
	public void addShow(Show show);
	public List<Show> deleteShow(int showId);
	public Show getShowById(int showId);
	public List<Show> updateShow(Show show);
}
