package edu.sliit.ds.assignment2.train_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.sliit.ds.assignment2.train_rest_api.model.Schedule;
import edu.sliit.ds.assignment2.train_rest_api.service.ScheduleService;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {

	@Autowired
	private ScheduleService scheduleService;

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET, produces = { "application/json" })
	public List<Schedule> findSchedules() {
		return scheduleService.getAll();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" })
	public Schedule saveSchedules(@RequestBody Schedule schedule) {
		return scheduleService.create(schedule);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.PUT, consumes = { "application/json" })
	public Schedule updateSchedules(@RequestBody Schedule schedule, @RequestParam(name = "scheduleId") String scheduleId) {
		return scheduleService.update(schedule, scheduleId);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/select", method = RequestMethod.GET, produces = { "application/json" })
	public Schedule findSchedulesByDayAndTimeAndFromAndTo(@RequestParam(name = "dayOfTheWeek") String dayOfTheWeek, @RequestParam(name = "time") String time,
			@RequestParam(name = "from") String from, @RequestParam(name = "to") String to) {
		return scheduleService.findByDayOfTheWeekAndTimeAndFromAndTo(dayOfTheWeek, time, from, to);
	}

}
