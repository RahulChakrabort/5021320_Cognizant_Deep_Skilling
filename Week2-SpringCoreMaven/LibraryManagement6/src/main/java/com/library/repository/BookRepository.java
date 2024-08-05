package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	public void performActions() {
		System.out.println("Repository action performed");
	}
}
