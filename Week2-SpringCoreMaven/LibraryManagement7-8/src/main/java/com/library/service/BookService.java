package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository repository;

	public BookService() {
		super();
	}

	public BookService(BookRepository repository) {
		this.repository = repository;
	}

	public void setRepository(BookRepository repository) {
		this.repository = repository;
	}

	public void performService() {
		System.out.println("Service method called");
		repository.performActions();
	}
}
