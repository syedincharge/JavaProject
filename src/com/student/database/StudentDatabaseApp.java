package com.student.database;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		// Ask How many new Students wants to add

		System.out.println("Entter number of new stident to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];

		// create a number of new students

		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();

		}
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
		}
	}
}
