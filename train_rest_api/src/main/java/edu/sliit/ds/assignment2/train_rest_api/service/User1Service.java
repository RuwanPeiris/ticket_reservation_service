package edu.sliit.ds.assignment2.train_rest_api.service;

import edu.sliit.ds.assignment2.train_rest_api.model.User1;

public interface User1Service {
	public User1 createUser1(User1 user1);
	
	public User1 loginUser1(String user1Name,String pass);
}
