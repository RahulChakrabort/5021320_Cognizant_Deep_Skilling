package com.example;

public class LightOnCommand implements Command {
	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("Commanding:Lights On!!");
		light.turnOn();
	}

}
