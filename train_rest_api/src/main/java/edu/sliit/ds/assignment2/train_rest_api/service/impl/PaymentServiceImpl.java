package edu.sliit.ds.assignment2.train_rest_api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sliit.ds.assignment2.train_rest_api.model.Payment;
import edu.sliit.ds.assignment2.train_rest_api.repository.PaymentRepository;
import edu.sliit.ds.assignment2.train_rest_api.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Payment create(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Override
	public List<Payment> getAll() {
		return paymentRepository.findAll();
	}

	@Override
	public List<Payment> findByCardNumberAndDate(String cardNumber, String date) {
		return paymentRepository.findByCardNumberAndDate(cardNumber, date);
	}

	@Override
	public Payment update(Payment payment, String payId) {
		Payment pay = paymentRepository.findByPayId(payId);
		if (null != pay) {
			pay.setStatus(true);
			return paymentRepository.save(payment);
			
		}
		return pay;

	}

	@Override
	public Payment findByPayId(String payId) {
		return paymentRepository.findByPayId(payId);
	}

	@Override
	public List<Payment> findByMobileAndDate(String mobile, String date) {
		return paymentRepository.findByMobileAndDate(mobile,date);
	}

	@Override
	public Payment findByTicketId(String ticketId) {
		return paymentRepository.findByTicketId(ticketId);
	}

}
