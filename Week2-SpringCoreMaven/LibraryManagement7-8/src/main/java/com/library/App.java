package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

/**
 * Hello Spring!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("-----Using Constructor-----");
		BookService b1 = (BookService) ac.getBean("bookServiceConstructor");
		b1.performService();

		System.out.println("---------------------------------");

		System.out.println("-----Using Setter-----");
		BookService b2 = (BookService) ac.getBean("bookServiceSetter");
		b2.performService();
	}
}
