package com.greatLearning.service;

public class HRdepartment extends SuperDepartment {
	
	public String departmentName() {
		String name = "HR Department" ;
		return name;
	}
	
	public String getTodaysWork() {
		String todaysWork = "Fill today's timesheet and mark your attendance";
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
	public String doActivity() {
		String activity = "team Lunch";
		return activity;
	}

}
