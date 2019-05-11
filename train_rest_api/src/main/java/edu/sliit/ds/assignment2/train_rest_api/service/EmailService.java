package edu.sliit.ds.assignment2.train_rest_api.service;


public interface EmailService {
	
	public void createSEND(String email,String ticketId,String date,String from,String to,String ticket_class);

}
