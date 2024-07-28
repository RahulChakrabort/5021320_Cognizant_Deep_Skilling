package com.example;

public abstract class NotifierDecorator implements Notifier {
	protected Notifier notifier;

	public NotifierDecorator(Notifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public abstract String send();

}
