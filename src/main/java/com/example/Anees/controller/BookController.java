package com.example.Anees.controller;


import com.example.Anees.model.Book;
import com.example.Anees.service.BookService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor



public class BookController {
    private BookService bookService;
    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }

    @PostMapping("/books")

    public String saveStudent( @RequestBody Book book) {
      bookService.saveBook(book);
        return "redirect:/books";
    }
}
