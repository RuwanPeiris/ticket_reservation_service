package edu.sliit.ds.assignment2.train_rest_api.service.impl;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;
import edu.sliit.ds.assignment2.train_rest_api.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	@Override
	public void createSEND(String email,String ticketId,String date,String from,String to,String ticket_class) {
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");

		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("education.work@yahoo.com", "Yahoo123ABC");
			}
		});

		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress("education.work@yahoo.com", false));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			message.setSubject("Train Ticket Reservation");
			message.setContent("Your tiket/tickets has been booked. Please keep this email "
					+ "message as your proven booking document./n " + "Ticket id : " + ticketId
					+ "/n Date : " + date + "/n From : " + from + "/n To : " + to
					+ "/n Class : " + ticket_class + "", "text/html");
			message.setSentDate(new Date());
			Transport.send(message);

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
