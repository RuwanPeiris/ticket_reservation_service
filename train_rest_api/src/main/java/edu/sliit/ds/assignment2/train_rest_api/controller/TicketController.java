package edu.sliit.ds.assignment2.train_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.sliit.ds.assignment2.train_rest_api.model.Ticket;
import edu.sliit.ds.assignment2.train_rest_api.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET, produces = { "application/json" })
	public List<Ticket> findTickets() {
		return ticketService.getAll();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		return ticketService.create(ticket);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.PUT, consumes = { "application/json" })
	public Ticket updateTicket(@RequestBody Ticket ticket, @RequestParam(name = "ticketId") String ticketId) {
		return ticketService.update(ticket, ticketId);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/pay", method = RequestMethod.GET, produces = { "application/json" })
	public Ticket findTicketByPaymentId(@RequestParam(name = "paymentId") String paymentId) {
		return ticketService.findByPaymentId(paymentId);
	}

}
