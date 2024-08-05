package com.library;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.library.entity.Book;
import com.library.repository.BookRepository;

@SpringBootApplication
public class LibraryManagement9Application implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagement9Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Create and save 5 books
		List<Book> books = Arrays.asList(new Book(null, "Effective Java", "Joshua Bloch", new Date()),
				new Book(null, "Clean Code", "Robert C. Martin", new Date()),
				new Book(null, "Spring in Action", "Craig Walls", new Date()),
				new Book(null, "Java Concurrency in Practice", "Brian Goetz", new Date()),
				new Book(null, "Head First Design Patterns", "Eric Freeman", new Date()));

		bookRepository.saveAll(books);

		// Print all books to verify
		bookRepository.findAll().forEach(System.out::println);
	}
}
