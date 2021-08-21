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

import com.mph.entity.Ticket;
import com.mph.service.TicketService;

@RestController
@CrossOrigin(origins = "http://localhost:4200",methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("/ticket")
public class TicketRestController {
	@Autowired
	TicketService TicketService;
	
	@PostMapping("/Ticket")
	public  Ticket setTicket(@RequestBody Ticket ticket){
		TicketService.addTicket(ticket);
		return ticket;

	}
	
	@DeleteMapping("/deleteTicket/{id}")
	public  ResponseEntity<List<Ticket>> deleteTicket(@PathVariable("id") int ticketid){
		List<Ticket> ticketList = TicketService.deleteTicket(ticketid);
		System.out.println("From Rest all Tickets : " + ticketList);
		
		if(ticketList.isEmpty())
		{
			return new ResponseEntity<List<Ticket>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Ticket>>(ticketList,HttpStatus.OK);
	}
	
	@PutMapping("/updateTicket")
	public  ResponseEntity<List<Ticket>> updateTicket(@RequestBody Ticket ticket){
		List<Ticket> ticketList = TicketService.updateTicket(ticket);
		System.out.println("From Rest allemp: " + ticketList);
		
		if(ticketList.isEmpty())
		{
			return new ResponseEntity<List<Ticket>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Ticket>>(ticketList,HttpStatus.OK);
	}
	
	@GetMapping("/searchTicket/{uid}")
	public  ResponseEntity<Ticket> searchTicket(@PathVariable("uid") int ticketid){
		Ticket ticketById = TicketService.getTicketById(ticketid);
		System.out.println("From Rest allemp: " + ticketById);
		
		if(ticketById == null)
		{
			return new ResponseEntity<Ticket>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Ticket>(ticketById,HttpStatus.OK);
	}
}
