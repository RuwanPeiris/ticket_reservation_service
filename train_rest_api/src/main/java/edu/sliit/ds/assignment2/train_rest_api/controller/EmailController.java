package edu.sliit.ds.assignment2.train_rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.sliit.ds.assignment2.train_rest_api.service.EmailService;

@RestController
@RequestMapping("/emails")
public class EmailController {

	@Autowired
	private EmailService emailService;

	@RequestMapping(method = RequestMethod.GET)
	public void sendEmail(@RequestParam(name = "email") String email, @RequestParam(name = "ticketId") String ticketId,
			@RequestParam(name = "date") String date, @RequestParam(name = "from") String from,
			@RequestParam(name = "to") String to, @RequestParam(name = "ticket_class") String ticket_class) {
		emailService.createSEND(email,ticketId, date, from, to, ticket_class);
	}

}
