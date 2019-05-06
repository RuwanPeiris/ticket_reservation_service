package edu.sliit.ds.assignment2.train_rest_api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.sliit.ds.assignment2.train_rest_api.model.Train;
import edu.sliit.ds.assignment2.train_rest_api.repository.TrainRepository;
import edu.sliit.ds.assignment2.train_rest_api.service.TrainService;

@Service("trainService")
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository trainRepository;

	@Override
	public Train create(Train train) {
		return trainRepository.save(train);
	}

	@Override
	public List<Train> getAll() {
		return trainRepository.findAll();
	}

	@Override
	public Train findByType(String type) {
		return trainRepository.findTrainByType(type);
	}

	@Override
	public Train findById(String trainId) {
		return trainRepository.findTrainById(trainId);
	}

	@Override
	public Train findByNumber(String number) {
		return trainRepository.findTrainByNumber(number);
	}

	public Train update(Train train) {
		Train tra = trainRepository.findTrainByNumber(train.getNumber());
		tra.setType(train.getType());
		tra.setNumber(train.getNumber());
		return trainRepository.save(tra);

	}
}
