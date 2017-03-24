package com.sightcorner.quartz.service;

import com.sightcorner.quartz.model.ScheduleTask;

import java.util.List;


public interface IScheduleTaskService {


	public void proceedTask(List<ScheduleTask> list) throws Exception;
	
	


}
