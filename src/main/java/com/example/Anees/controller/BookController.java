package com.example.Anees.controller;


import com.example.Anees.exceptions.ApiException;
import org.springframework.ui.Model;
import com.example.Anees.model.Book;
import com.example.Anees.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor



public class BookController {
    private final BookService bookService;


    @PostMapping("/books")

    public Book saveStudent( @RequestBody Book book) {
      bookService.saveBook(book);
       return book;
    }
    @GetMapping("/books")
    public List<Book> listBooks() {


        return bookService.getAllBooks();

    }

    @GetMapping("/books/{id}")
    public String deleteBook(@PathVariable String id) {

        return bookService.deleteBookById(id);

    }


    @PostMapping("/books/{id}")
    public String updateBook(@PathVariable String id,
                             @RequestBody Book book
                               ) {

            // save updated book object
            bookService.updateBook(id,book);
            return "redirect:/books";
        //}
    }


}
