package com.mvc.justin.services;


import com.mvc.justin.models.*;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mvc.justin.models.Book;
import com.mvc.justin.repositories.BookRepository;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


@Service
public class BookService {
	 // adding the book repository as a dependency
	private final BookRepository bookRepository;
	 
	 public BookService(BookRepository bookRepository) {
	     this.bookRepository = bookRepository;
	 }
	 
	 // returns all the books
	 public List<Book> allBooks() {
	     return bookRepository.findAll();
	 }
	 
	 // creates a book
	 public Book createBook(Book b) {
	     return bookRepository.save(b);
	 }
	 
	 // retrieves a book
	 public Book findBook(Long id) {
	     Optional<Book> optionalBook = bookRepository.findById(id);
	     
	     	if(optionalBook.isPresent()) {
	         return optionalBook.get();
	     } 
	     	else {
	     		return null;
	     }
	 }
	
//	 public Book updateBook(Long id, Book updatedBook) {
//		 return bookRepository.save(updatedBook);
//	 }
	 
	 public void updateBook(Long id, Book book) {
	    	   bookRepository.save(book);
	  }

	 public void deleteBook(Long id) {
		 bookRepository.deleteById(id);
	 }
	 
	 
	 
	 
	 
}