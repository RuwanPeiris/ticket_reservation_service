package edu.sliit.ds.assignment2.train_rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.sliit.ds.assignment2.train_rest_api.model.User1;
import edu.sliit.ds.assignment2.train_rest_api.service.User1Service;

@RestController
@RequestMapping("/users")
public class User1Controller {

	@Autowired
	User1Service user1Service;

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" })
	public User1 saveUser(@RequestBody User1 user1) {
		return user1Service.createUser1(user1);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET, consumes = { "application/json" })
	public User1 user1Login(@RequestParam(name = "user1Name") String user1Name,@RequestParam(name = "pass") String pass) {
		return user1Service.loginUser1(user1Name,pass);
	}

}
