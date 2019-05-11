package edu.sliit.ds.assignment2.train_rest_api.service;

import java.util.List;

import edu.sliit.ds.assignment2.train_rest_api.model.Payment;

public interface PaymentService {

	public Payment create(Payment payment);

	public List<Payment> getAll();

	public List<Payment> findByCardNumberAndDate(String cardNumber, String date);

	public Payment update(Payment payment, String payId);
	
	public Payment findByPayId(String payId);

	public List<Payment> findByMobileAndDate(String mobile, String date);

	public Payment findByTicketId(String ticketId);

}
