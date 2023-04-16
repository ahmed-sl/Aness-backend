package com.example.Anees.service;


import com.example.Anees.exceptions.ApiException;
import com.example.Anees.model.Book;
import com.example.Anees.repository.BookRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void saveBook(Book book) {

       bookRepository.save(book);

    }
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }


    public String deleteBookById(String id) {

        Book existingBook = getBookById(id);
        if (existingBook==null) {
            throw new ApiException("Not found");
        }


         else{
        bookRepository.deleteById(id);

             return "Deleted";
         }
    }


    public Book updateBook(String id,Book book) {
        // get book from database by id
        Book existingBook = getBookById(id);
        existingBook.setId(id);
        existingBook.setBookName(book.getBookName());
        existingBook.setBookReadIt(book.getBookReadIt());
        existingBook.setBookAuthor(book.getBookAuthor());
        existingBook.setBookEdition(book.getBookEdition());
        existingBook.setBookCategory(book.getBookCategory());
        existingBook.setBookRate(book.getBookRate());
        existingBook.setBookType(book.getBookType());
        existingBook.setBookSummary(book.getBookSummary());
        existingBook.setBookLanguage(book.getBookLanguage());
        existingBook.setBookWantIt(book.getBookWantIt());
        existingBook.setBookYear(book.getBookYear());

        if (existingBook==null) {
            throw new ApiException("Not found");
        }
       else{
        return bookRepository.save(existingBook);}
    }

    public Book getBookById(String id) {
        return bookRepository.findById(id).orElse(null);
    }

}
