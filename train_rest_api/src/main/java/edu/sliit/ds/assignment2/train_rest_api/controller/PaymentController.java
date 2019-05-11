package edu.sliit.ds.assignment2.train_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping(method = RequestMethod.GET)
	public List<Payment> findPayments() {
		return paymentService.getAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public Payment savePayment(@RequestBody Payment payment) {
		return paymentService.create(payment);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Payment updatePayment(@RequestBody Payment payment, @RequestParam(name = "payId") String payId) {
		return paymentService.update(payment, payId);

	}
	
	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	public Payment findPaymentByTicketId(@RequestParam(name = "ticketId") String ticketId) {
		return paymentService.findByTicketId(ticketId);
	}
	
	@RequestMapping(value = "/payment/id", method = RequestMethod.GET)
	public Payment findPaymentById(@RequestParam(name = "payId") String payId) {
		return paymentService.findByPayId(payId);
	}

	@RequestMapping(value = "/card", method = RequestMethod.GET)
	public List<Payment> findPaymentByCardNUmberNDate(@RequestParam(name = "cardNumber") String cardNumber,
			@RequestParam(name = "date") String date) {
		return paymentService.findByCardNumberAndDate(cardNumber, date);
	}

	@RequestMapping(value = "/mobile", method = RequestMethod.GET)
	public List<Payment> findPaymentByMobileNumberNDate(@RequestParam(name = "mobile") String mobile,
			@RequestParam(name = "date") String date) {
		return paymentService.findByMobileAndDate(mobile, date);
	}
}
