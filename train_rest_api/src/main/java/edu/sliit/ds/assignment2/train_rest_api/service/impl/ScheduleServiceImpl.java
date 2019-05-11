package edu.sliit.ds.assignment2.train_rest_api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sliit.ds.assignment2.train_rest_api.model.Schedule;
import edu.sliit.ds.assignment2.train_rest_api.repository.ScheduleRepository;
import edu.sliit.ds.assignment2.train_rest_api.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private ScheduleRepository scheduleRepository;

	@Override
	public Schedule create(Schedule schedule) {
		return scheduleRepository.save(schedule);
	}

	@Override
	public List<Schedule> getAll() {
		return scheduleRepository.findAll();
	}

	@Override
	public Schedule findByDayOfTheWeekAndTimeAndFromAndTo(String dayOfTheWeek, String time, String from, String to) {
		return scheduleRepository.findByDayOfTheWeekAndTimeAndFromAndTo(dayOfTheWeek, time, from, to);
	}

	@Override
	public Schedule update(Schedule schedule, String scheduleId) {
		Schedule sched = scheduleRepository.findByScheduleId(scheduleId);
		if (null != sched) {
			sched.setDayOfTheWeek(schedule.getDayOfTheWeek());
			sched.setFrom(schedule.getFrom());
			sched.setTo(schedule.getTo());
			sched.setTime(schedule.getTime());
			sched.setTrainId(schedule.getTrainId());
			return scheduleRepository.save(sched);
		}
		return sched;
	}

	@Override
	public Schedule findByScheduleId(String scheduleId) {
		return scheduleRepository.findByScheduleId(scheduleId);
	}
}
