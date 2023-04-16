package com.example.Anees.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class Book {


  @Id
  @Column(unique = true)
    private String id = UUID.randomUUID().toString().toUpperCase();
    @NotNull(message = "Book name is required")
    @Column(unique = true)
   private String bookName;
    @NotNull(message = "Book edition is required")
    private String bookEdition;
    @NotNull(message = "Book year is required")
    private String bookYear;
    @NotNull(message = "Book Category is required")
    private String bookCategory;
    @NotNull(message = "Book author is required")
    private String bookAuthor;
    @NotNull(message = "Book Summary is required")
    private String bookSummary;
    @NotNull(message = "Book language is required")
    private String bookLanguage;
    @NotNull(message = "Book type is required")
    private String bookType;
    private String bookRate;
    private String bookWantIt;
    private String bookReadIt;
}



