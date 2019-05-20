package edu.sliit.ds.assignment2.train_rest_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User11")
public class User1 {
	
	@Id
	private String user1Id;
	private String user1Name;
	private String pass;
	public User1() {
		super();
	}
	public User1(String user1Id, String user1Name, String pass) {
		super();
		this.user1Id = user1Id;
		this.user1Name = user1Name;
		this.pass = pass;
	}
	public String getUser1Id() {
		return user1Id;
	}
	public void setUser1Id(String user1Id) {
		this.user1Id = user1Id;
	}
	public String getUser1Name() {
		return user1Name;
	}
	public void setUser1Name(String user1Name) {
		this.user1Name = user1Name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
