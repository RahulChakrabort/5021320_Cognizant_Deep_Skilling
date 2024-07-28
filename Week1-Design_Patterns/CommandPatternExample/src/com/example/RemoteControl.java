package com.example;

public class RemoteControl {
	private Command command;

	public RemoteControl(Command command) {
		this.command = command;
	}

	public void executeCommand() {
		command.execute();
	}
}
