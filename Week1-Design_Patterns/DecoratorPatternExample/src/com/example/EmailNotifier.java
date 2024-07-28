package com.example;

public class EmailNotifier implements Notifier {

	@Override
	public String send() {
		return "Email notification send";
	}

}
