package com.greatLearning.client;

import com.greatLearning.service.*;

public class Main {

	public static void main(String[] args) {

		AdminDepartment admin = new AdminDepartment();
		HRdepartment hr = new HRdepartment();
		TechDepartment tech = new TechDepartment();
		

		String adminName;
		String adminWork;
		String adminDeadline;
		String adminHoliday;
		String hrName;
		String hrWork;
		String hrDeadline;
		String hrActivity;
		String hrHoilday;
		String techName;
		String techWork;
		String techDeadline;
		String techStack;
		String techHoilday;

		adminName = admin.departmentName();
		adminWork = admin.getTodaysWork();
		adminDeadline = admin.getWorkDeadline();
		adminHoliday = admin.isTodayAHoliday();

		hrName = hr.departmentName();
		hrWork = hr.getTodaysWork();
		hrDeadline = hr.getWorkDeadline();
		hrActivity = hr.doActivity();
		hrHoilday = hr.isTodayAHoliday();

		techName = tech.departmentName();
		techWork = tech.getTodaysWork();
		techDeadline = tech.getWorkDeadline();
		techStack = tech.getTechStackInformation();
		techHoilday = tech.isTodayAHoliday();

		System.out.println("Welcome to " + adminName);
		System.out.println(adminWork);
		System.out.println(adminDeadline);
		System.out.println(adminHoliday);
		System.out.println();
		System.out.println("Welcome to " + hrName);
		System.out.println(hrActivity);
		System.out.println(hrWork);
		System.out.println(hrDeadline);
		System.out.println(hrHoilday);
		System.out.println();
		System.out.println("Welcome to " + techName);
		System.out.println(techWork);
		System.out.println(techDeadline);
		System.out.println(techStack);
		System.out.println(techHoilday);

	}

}
