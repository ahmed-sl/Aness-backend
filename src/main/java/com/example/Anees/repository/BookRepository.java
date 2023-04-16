package com.example.Anees.repository;
import com.example.Anees.model.Book;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    void deleteById(Long id);

//    @Override
//    <S extends Book> boolean exists(Example<S> example);
}
