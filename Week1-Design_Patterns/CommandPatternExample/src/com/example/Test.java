package com.example;

public class Test {

	public static void main(String[] args) {
		Command c = new LightOnCommand(new Light());
		RemoteControl rc = new RemoteControl(c);
		rc.executeCommand();

		System.out.println("---------------");
		c = new LightOffCommand(new Light());
		rc = new RemoteControl(c);
		rc.executeCommand();
	}

}
