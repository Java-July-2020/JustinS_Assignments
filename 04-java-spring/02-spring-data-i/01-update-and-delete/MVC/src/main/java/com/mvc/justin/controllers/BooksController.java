package com.mvc.justin.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.justin.models.Book;
import com.mvc.justin.services.BookService;

@Controller
public class BooksController {
		
	 private final BookService bookService;
	 
	 public BooksController(BookService bookService) {
	     this.bookService = bookService;
	 }
	 
	//This is only printing the all the current books;
	 @RequestMapping("/books") 
	 public String index(Model model) { 
		 List<Book> books = bookService.allBooks(); model.addAttribute("books", books); 
		 return "/books/index.jsp"; 
	 }
	 
		 
	  @RequestMapping("/books/new")
	  public String newBook(@ModelAttribute("book") Book book) {
		  return "/books/new.jsp";
	  }
	  
		 
	  @RequestMapping(value="/books", method=RequestMethod.POST)
	  public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		  if (result.hasErrors()) {
		      return "/books/new.jsp";
		  } 
		  else {
		      bookService.createBook(book);
		      return "redirect:/books";
		  }
	  }
	  
	  @RequestMapping("/books/{index}")
	  public String findBookByIndex(Model model, @PathVariable("index") Long index) {
		  Book book = bookService.findBook(index);
		  model.addAttribute("book", book);
		  return "showBook.jsp";
	  }
	  
	 
	 @RequestMapping("/books/delete/{id")
	 public String deleteBook(@PathVariable("id") Long id) {
		 bookService.deleteBook(id);
		 return "redirect:/books";
	 }

	
	    @PostMapping("/books/edit/{id}")
	    public String updateBook(@PathVariable("id") int id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
	        if (result.hasErrors()) {
	            return "editBook.jsp";
	        }else{
	            bookService.updateBook(id, book);
	            return "redirect:/books";
	        }
	    }
	    
	  

	

	 
	 
}
