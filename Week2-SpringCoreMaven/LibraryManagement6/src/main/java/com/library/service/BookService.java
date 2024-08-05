package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {
	private BookRepository repository;

	@Autowired
	public void setBookRepository(BookRepository bookRepository) {
		this.repository = bookRepository;
	}

	public void performService() {
		System.out.println("Service method called");
		repository.performActions();
	}
}
