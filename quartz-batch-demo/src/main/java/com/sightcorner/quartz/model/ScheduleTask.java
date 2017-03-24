package com.sightcorner.quartz.model;


public class ScheduleTask {

	/**
	 * 任务码
	 */
	private String taskCode;
	
	/**
	 * 任务名称
	 */
	private String taskName;
	
	/**
	 * 定时配置
	 */
	private String taskConf;
	
	/**
	 * 执行地址
	 */
	private String taskClass;
	
	/**
	 * 指定IP
	 */
	private String taskServerIp;
	
	/**
	 * 任务状态(0:可用;1:禁用)
	 */
	private String status;
	

	public String getTaskCode() {
		return taskCode;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskConf() {
		return taskConf;
	}

	public void setTaskConf(String taskConf) {
		this.taskConf = taskConf;
	}

	public String getTaskClass() {
		return taskClass;
	}

	public void setTaskClass(String taskClass) {
		this.taskClass = taskClass;
	}

	public String getTaskServerIp() {
		return taskServerIp;
	}

	public void setTaskServerIp(String taskServerIp) {
		this.taskServerIp = taskServerIp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
