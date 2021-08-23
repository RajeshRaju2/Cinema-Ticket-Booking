package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mph.entity.Show;

@Repository
public class ShowDaoImpl implements ShowDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addShow(Show show) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(show);
		System.out.println("show added Successfully :)");
	}

	@Override
	public List<Show> deleteShow(int showId) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("delete from User user where showId=:showId");
		query.setParameter("showId", showId);
		int no_ofRows = query.executeUpdate();
		if(no_ofRows >0)
		{
			System.out.println("Deleted " + no_ofRows + " rows");
		}
		return getAllShows();
	}

	private List<Show> getAllShows() {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from Show show");
		@SuppressWarnings("unchecked")
		List<Show> showList = query.list();
		return showList;
	}

	@Override
	public Show getShowById(int showId) {
		// TODO Auto-generated method stub
		Criteria c = getSession().createCriteria(Show.class);
		 c.add(Restrictions.eq("userId", showId));
	     Show sh = (Show)c.uniqueResult();
		System.out.println("Seat Found : " +sh);
		return sh;
	}

	@Override
	public List<Show> updateShow(Show show) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("update Seat seat set showId=:showId,showName=:showName,endTime=:endTime,language=:language");
		query.setParameter("showID", show.getShowId());
		query.setParameter("startTime",show.getStartTime());
		query.setParameter("endTime",show.getEndTime());
		query.setParameter("language",show.getLanguage());
		
		int noofrows = query.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Updated " + noofrows + " rows");
		}
		return getAllShows();
	}

}
