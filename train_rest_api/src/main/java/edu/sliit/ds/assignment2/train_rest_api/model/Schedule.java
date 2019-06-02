package edu.sliit.ds.assignment2.train_rest_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = 	"schedule")
public class Schedule {
	
	@Id
	private String scheduleId;
	private String dayOfTheWeek;
	private String time;
	private String trainId;
	private String from;
	private String to;
	private double price;
	
	Schedule() {
		
	}
	
	Schedule(String scheduleId,String dayOfTheWeek,String time,String trainId,String from,String to,double price) {
		this.scheduleId= scheduleId;
		this.dayOfTheWeek = dayOfTheWeek;
		this.time = time;
		this.trainId = trainId;
		this.from = from;
		this.to = to;
		this.price = price;
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}

	public void setDayOfTheWeek(String dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTrainId() {
		return trainId;
	}

	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
