package com.example;

public class DecoratorTest {

	public static void main(String[] args) {
		Notifier n = new EmailNotifier();
		System.out.println(n.send());
		n = new SMSNotifierDecorator(n);
		n = new SlackNotifierDecorator(n);
		System.out.println(n.send());

	}

}
