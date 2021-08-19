package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Movie;

import com.mph.service.MovieService;


@CrossOrigin(origins = "http://localhost:4200",methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping("/movie")
public class MovieRestController {
	
	@Autowired
	MovieService movieService;
	
	@PostMapping("/Movie")
	public  Movie setMovie(@RequestBody Movie movie){
		movieService.addmovie(movie);
		return movie;

	}
	
	@DeleteMapping("/deleteMovie/{id}")
	public  ResponseEntity<List<Movie>> deleteMovie(@PathVariable("id") int movieid){
		List<Movie> movieList = movieService.deleteMovie(movieid);
		System.out.println("From Rest all movies : " + movieList);
		
		if(movieList.isEmpty())
		{
			return new ResponseEntity<List<Movie>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Movie>>(movieList,HttpStatus.OK);
	}

}
