package com.example;

public class Test {

	public static void main(String[] args) {
		Student s = new Student("Rahul", 86, "B+");
		StudentView v = new StudentView();
		StudentController sc = new StudentController(s, v);
		sc.display();

		sc.updateStudentGrade("A+");
		sc.display();

	}

}
