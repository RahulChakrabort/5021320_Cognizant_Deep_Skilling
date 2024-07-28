package com.example;

public class SMSNotifierDecorator extends NotifierDecorator {

	public SMSNotifierDecorator(Notifier notifier) {
		super(notifier);
	}

	@Override
	public String send() {
		return notifier.send() + " with SMS!";
	}

}
