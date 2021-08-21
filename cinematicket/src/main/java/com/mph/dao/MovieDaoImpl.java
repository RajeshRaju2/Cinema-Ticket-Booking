package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mph.entity.Movie;


@Repository
public class MovieDaoImpl implements MovieDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(movie);
		System.out.println("movie added Successfully in DB !!!");
		
	}

	@Override
	public List<Movie> deleteMovie(int movieId) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("delete from Movie where movieId=:movieId");
		query.setParameter("movieId", movieId);
		int noofrows = query.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Deleted " + noofrows + " rows");
		}
		
		return getAllMovie();
	}

	@Override
	public Movie getMovieById(int movieId) {

		Criteria c = getSession().createCriteria (Movie.class); 
		c.add(Restrictions.eq("movieId",movieId)); 
		Movie m= (Movie)c.uniqueResult(); 
		System.out.println("Employee Retrieved" + m);
		return m;
	}

	@Override
	public List<Movie> updatemovie(Movie movie) {
		Query query = getSession().createQuery("update Movie set movieId=:movieId,movieName=:movieName");
		query.setParameter("movieId", movie.getMovieId());
		query.setParameter("movieName",movie.getMovieName());
		
		int noofrows = query.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Updated " + noofrows + " rows");
		}
		return getAllMovie();
		
	}

	private List<Movie> getAllMovie() {
		// TODO Auto-generated method stub

		Query query = getSession().createQuery("from Movie movie");
		@SuppressWarnings("unchecked")
		List<Movie> movieList = query.list();
		return movieList;
	}

}
