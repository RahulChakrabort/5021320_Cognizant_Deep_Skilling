package com.dsa;

public class Task {
	private String taskId;
	private String taskName;
	private String status;

	// Constructor
	public Task(String taskId, String taskName, String status) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.status = status;
	}

	// Getters
	public String getTaskId() {
		return taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public String getStatus() {
		return status;
	}

	// Setters
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// toString method for easy printing of task details
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", status=" + status + "]";
	}
}
