package com.example.Anees.service;

import com.example.Anees.model.Book;
import com.example.Anees.repository.BookRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void saveBook(Book book) {

       bookRepository.save(book);
    }

}
