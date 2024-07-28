package com.example;

public class StudentController {
	private Student model;
	private StudentView view;

	// Constructor
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	// Methods to update the model
	public void updateStudentName(String name) {
		model.setName(name);
	}

	public void updateStudentId(int id) {
		model.setId(id);
	}

	public void updateStudentGrade(String grade) {
		model.setGrade(grade);
	}

	// Method to display the view
	public void display() {
		view.displayStudentDetails(model);
	}
}
