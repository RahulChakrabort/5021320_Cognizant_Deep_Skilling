package com.example;

public class BuilderTest {

	public static void main(String[] args) {
		Computer c = new Computer.Builder().setCpu("NVIDIA RTX 3080").setRam(64).setStorage(1000).build();
		System.out.println(c);

	}

}
