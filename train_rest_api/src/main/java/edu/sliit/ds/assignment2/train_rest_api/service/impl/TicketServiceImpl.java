package edu.sliit.ds.assignment2.train_rest_api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sliit.ds.assignment2.train_rest_api.model.Ticket;
import edu.sliit.ds.assignment2.train_rest_api.repository.TicketRepository;
import edu.sliit.ds.assignment2.train_rest_api.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public Ticket create(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@Override
	public List<Ticket> getAll() {
		return ticketRepository.findAll();
	}

	@Override
	public Ticket findByPaymentId(String paymentId) {
		return ticketRepository.findByPaymentId(paymentId);
	}

	@Override
	public Ticket update(Ticket ticket,String ticketId) {
		Ticket tic = ticketRepository.findByTicketId(ticketId);
		if(null != tic) {
			tic.setPaymentId(ticket.getPaymentId());
			return ticketRepository.save(tic);
		}
		return tic;
		

	}

	@Override
	public Ticket findByTicketId(String ticketId) {
		return ticketRepository.findByTicketId(ticketId);
	}
}
