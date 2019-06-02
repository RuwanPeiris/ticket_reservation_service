package edu.sliit.ds.assignment2.train_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.sliit.ds.assignment2.train_rest_api.model.Train;
import edu.sliit.ds.assignment2.train_rest_api.service.TrainService;

@RestController
@RequestMapping("/trains")
public class TrainController {

	@Autowired
	private TrainService trainService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Train> findTrains() {
		return trainService.getAll();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Train saveTrain(@RequestBody Train train) {
		return trainService.create(train);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.PUT, consumes = { "application/json" })
	public Train updateTrain(@RequestBody Train train, @RequestParam(name = "number") String number) {
		return trainService.update(train, number);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/types", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Train> findTrainByType(@RequestParam(name = "type") String type) {
		return trainService.findByType(type);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/ids", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Train findTrainById(@RequestParam(name = "trainId") String trainId) {
		return trainService.findById(trainId);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/numbers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Train findTrainByNumber(@RequestParam(name = "number") String number) {
		return trainService.findByNumber(number);
	}
}
