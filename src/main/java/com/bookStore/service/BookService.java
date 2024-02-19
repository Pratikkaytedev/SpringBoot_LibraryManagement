package com.bookStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bRepo;

	public void save(Book b) {
		bRepo.save(b);
	}

	public List<Book> getAllBook() {
		List<Book> findAll = bRepo.findAll();
		return findAll;
	}

	public Book getBookById(int id) {
		Book bookById = bRepo.getBookById(id);

		return bookById;
	}

	public void deleteById(int id) {
		bRepo.deleteById(id);
	}
}
