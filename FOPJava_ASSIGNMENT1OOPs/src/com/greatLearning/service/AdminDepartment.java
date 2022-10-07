package com.greatLearning.service;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		String name = "Admin Department" ;
		return name;
	}
	
	public String getTodaysWork() {
		String todaysWork = "Complete your documents Submission";
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}

}
