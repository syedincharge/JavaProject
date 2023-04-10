package com.student.database;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear = 0;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;


	// constructor :  prompt user to enter the name and year

	public Student() {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the Student First Name  :  ");
		this.firstName = in.nextLine();

		System.out.print("Enter the Student  Last Name  :  ");
		this.lastName = in.nextLine();

		System.out.print("1 - Freshman\n2 - Softmore\n3 - Junior\n4 - Senior\nEnter the Student Grade Level :  ");
		this.gradeYear = in.nextInt();

		setStudentID();

	}


	//  Generate Id's

	private void setStudentID() {

		// Grade Level + ID
		id++;

		this.studentID = gradeYear + "" + id;
	}


	// Enroll in the courses


	public void enroll() {

		// get inside the Loop, users hit 0

		do {

			System.out.print("Enter course to enroll ( Q to quit) : ");

			Scanner scn = new Scanner(System.in);

			String course = scn.nextLine();

			if(!course.equals("Q")) {
				courses = courses + "\n " +course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		}
		while(1 != 0);
	}

	// View balance

	public void viewBalance() {
		System.out.println("Your Balance for this year  : $  "  +tuitionBalance);
	}

	//  pay tuition

	public void payTuition () {

		System.out.print("Enter Your payment : $ ");
		Scanner scan = new Scanner(System.in);
		int payment = scan.nextInt();

		tuitionBalance = tuitionBalance - payment;

		System.out.println("Thank you for your Payment of $ " +payment);

		viewBalance();
	}

	//  show status

	public String toString(){

		return "Student Name: " +firstName +
				"" + lastName +
				"\nGrade Level : "+gradeYear+
				"\nStudent ID: "+studentID+
				"\nCourses Enrolled : "+ courses +
				" \nBalance : $"  +tuitionBalance;

	}
}
