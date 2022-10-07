package com.greatLearning.service;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		String name = "Tech Department" ;
		return name;
	}
	
	public String getTodaysWork() {
		String todaysWork = "Complete coding of module 1";
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
	public String getTechStackInformation() {
		String StackInformation = "Core Java";
		return StackInformation;
	}

}
