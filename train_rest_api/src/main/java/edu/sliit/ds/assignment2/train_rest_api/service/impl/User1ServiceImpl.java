package edu.sliit.ds.assignment2.train_rest_api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sliit.ds.assignment2.train_rest_api.model.User1;
import edu.sliit.ds.assignment2.train_rest_api.repository.User1Repository;
import edu.sliit.ds.assignment2.train_rest_api.service.User1Service;

@Service
public class User1ServiceImpl implements User1Service{
	
	@Autowired
	User1Repository user1Repository;

	@Override
	public User1 createUser1(User1 user1) {
		return user1Repository.save(user1);
	}

	@Override
	public User1 loginUser1(String user1Name,String pass) {
		User1 user1 = user1Repository.findByUser1NameAndPass(user1Name,pass);
		if(null == user1) {
			//preventing internal server error(null pointer handling)
			user1 =new User1();
			user1.setUser1Name("");
			user1.setPass("");
		}else if (null != user1) {
			user1.setPass("");
			return user1;
		}
		return user1;
	}

}
