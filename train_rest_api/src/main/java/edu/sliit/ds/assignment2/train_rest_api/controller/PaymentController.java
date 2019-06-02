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

import edu.sliit.ds.assignment2.train_rest_api.model.Payment;
import edu.sliit.ds.assignment2.train_rest_api.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET)
	public List<Payment> findPayments() {
		return paymentService.getAll();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Payment savePayment(@RequestBody Payment payment) {
		return paymentService.create(payment);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.PUT)
	public Payment updatePayment(@RequestBody Payment payment, @RequestParam(name = "payId") String payId) {
		return paymentService.update(payment, payId);

	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	public Payment findPaymentByTicketId(@RequestParam(name = "ticketId") String ticketId) {
		return paymentService.findByTicketId(ticketId);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/payment/id", method = RequestMethod.GET)
	public Payment findPaymentById(@RequestParam(name = "payId") String payId) {
		return paymentService.findByPayId(payId);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/card", method = RequestMethod.GET)
	public List<Payment> findPaymentByCardNUmberNDate(@RequestParam(name = "cardNumber") String cardNumber,
			@RequestParam(name = "date") String date) {
		return paymentService.findByCardNumberAndDate(cardNumber, date);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/mobile", method = RequestMethod.GET)
	public List<Payment> findPaymentByMobileNumberNDate(@RequestParam(name = "mobile") String mobile,
			@RequestParam(name = "date") String date) {
		return paymentService.findByMobileAndDate(mobile, date);
	}
}
