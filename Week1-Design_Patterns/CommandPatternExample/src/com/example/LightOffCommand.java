package com.example;

public class LightOffCommand implements Command {
	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("Commanding:Lights Off!!");
		light.turnOff();
	}

}
