package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.ShowDao;
import com.mph.entity.Show;

@Transactional
@Service
public class ShowServiceImpl implements ShowService {
	
	@Autowired
	ShowDao showDao;
	
	@Override
	public void addShow(Show show) {
		// TODO Auto-generated method stub
		showDao.addShow(show);
		
	}

	@Override
	public List<Show> deleteShow(int showId) {
		// TODO Auto-generated method stub
		return showDao.deleteShow(showId);
	}

	@Override
	public Show getShowById(int showId) {
		// TODO Auto-generated method stub
		return showDao.getShowById(showId);
	}

	@Override
	public List<Show> updateShow(Show show) {
		// TODO Auto-generated method stub
		return showDao.updateShow(show);
	}

}
