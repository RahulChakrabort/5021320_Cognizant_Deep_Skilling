package com.example;

public class SlackNotifierDecorator extends NotifierDecorator {

	public SlackNotifierDecorator(Notifier notifier) {
		super(notifier);
	}

	@Override
	public String send() {
		return notifier.send() + " with Slack Message!";
	}

}
