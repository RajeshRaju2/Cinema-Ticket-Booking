package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Show;
import com.mph.service.ShowService;

@CrossOrigin(origins = "http://localhost:4200",methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping("/show")
public class ShowRestController {

	@Autowired
	ShowService showService;
	
	@PostMapping("/show")
	public  Show setshow(@RequestBody Show show){
		showService.addShow(show);
		return show;

	}
	
	@DeleteMapping("/deleteshow/{id}")
	public  ResponseEntity<List<Show>> deleteshow(@PathVariable("id") int showid){
		List<Show> showList = showService.deleteShow(showid);
		System.out.println("From Rest all shows : " + showList);
		
		if(showList.isEmpty())
		{
			return new ResponseEntity<List<Show>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Show>>(showList,HttpStatus.OK);
	}
	
	@PutMapping("/updateshow")
	public  ResponseEntity<List<Show>> updateshow(@RequestBody Show show){
		List<Show> showList = showService.updateShow(show);
		System.out.println("From Rest allemp: " + showList);
		
		if(showList.isEmpty())
		{
			return new ResponseEntity<List<Show>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Show>>(showList,HttpStatus.OK);
	}
	
	@GetMapping("/searchshow/{uid}")
	public  ResponseEntity<Show> searchshow(@PathVariable("uid") int showid){
		Show showById = showService.getShowById(showid);
		System.out.println("From Rest allemp: " + showById);
		
		if(showById == null)
		{
			return new ResponseEntity<Show>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Show>(showById,HttpStatus.OK);
	}

}
