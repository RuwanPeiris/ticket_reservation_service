package edu.sliit.ds.assignment2.train_rest_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "document")
public class Payment {

	@Id
	private String payId;
	private String type;// Mobile / credit card
	private String date;
	private double amount;
	private String mobile;
	private int pin;// pin for mobile users 4 digit number
	private String cardNumber;
	private int cvc;// at the back of the credit card (3 digits)
	private String cardHolderName;
	private String nic;
	private boolean status;
	private String email;
	private String ticketId;

	public Payment() {
	}

	Payment(String type, String date, double amount, String mobile, int pin, String nic, boolean status,String ticketId) {
		this.type = type;
		this.date = date;
		this.amount = amount;
		this.mobile = mobile;
		this.pin = pin;
		this.nic = nic;
		this.status = status;
		this.ticketId = ticketId;
	}

	Payment(String type, String date, double amount, String cardNumber, int cvc, String cardHolderName, String nic,
			boolean status, String email,String ticketId) {
		this.type = type;
		this.date = date;
		this.amount = amount;
		this.cardNumber = cardNumber;
		this.cvc = cvc;
		this.cardHolderName = cardHolderName;
		this.nic = nic;
		this.status = status;
		this.email = email;
		this.ticketId = ticketId;
	}

	Payment(String type, String date, double amount, String mobile, int pin, String cardNumber, int cvc,
			String cardHolderName, String nic, boolean status, String email, String ticketId) {
		this.type = type;
		this.date = date;
		this.amount = amount;
		this.mobile = mobile;
		this.pin = pin;
		this.cardNumber = cardNumber;
		this.cvc = cvc;
		this.cardHolderName = cardHolderName;
		this.nic = nic;
		this.status = status;
		this.email = email;
		this.ticketId = ticketId;
	}

	Payment(String payId, String type, String date, double amount, String mobile, int pin, String nic, boolean status,String ticketId) {
		this.payId = payId;
		this.type = type;
		this.date = date;
		this.amount = amount;
		this.mobile = mobile;
		this.pin = pin;
		this.nic = nic;
		this.status = status;
		this.ticketId = ticketId;
	}

	Payment(String payId, String type, String date, double amount, String cardNumber, int cvc, String cardHolderName,
			String nic, boolean status, String email,String ticketId) {
		this.payId = payId;
		this.type = type;
		this.date = date;
		this.amount = amount;
		this.cardNumber = cardNumber;
		this.cvc = cvc;
		this.cardHolderName = cardHolderName;
		this.nic = nic;
		this.status = status;
		this.email = email;
		this.ticketId = ticketId;
	}

	Payment(String payId, String type, String date, double amount, String mobile, int pin, String cardNumber, int cvc,
			String cardHolderName, String nic, boolean status, String email,String ticketId) {
		this.payId = payId;
		this.type = type;
		this.date = date;
		this.amount = amount;
		this.mobile = mobile;
		this.pin = pin;
		this.cardNumber = cardNumber;
		this.cvc = cvc;
		this.cardHolderName = cardHolderName;
		this.nic = nic;
		this.status = status;
		this.email = email;
		this.ticketId = ticketId;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{payId: " + payId + "	type: " + type + "	date: " + date + "	amount: " + amount + "	mobile: "
				+ mobile + "	pin: " + pin + "	cardNumber: " + cardNumber + "	cvc: " + cvc
				+ "	cardHolderName: " + cardHolderName + "	nic: " + nic + "	status: " + status + "	email: " + email
				+ "}";
	}

}
