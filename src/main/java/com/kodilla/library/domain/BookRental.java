package com.kodilla.library.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "BOOK_RENTAL")
public class BookRental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "BOOK_COPY_QUANTITY")
    private BookCopy bookCopy;
    @Column(name = "READER")
    private Reader reader;
    @Column(name = "DATE_OF_RENT")
    private LocalDate dateOfRent;
    @Column(name = "DATE_OF_RETURN")
    private LocalDate dateOfReturn;

    public BookRental(Long id, BookCopy bookCopy, Reader reader, LocalDate dateOfRent, LocalDate dateOfReturn) {
        this.id = id;
        this.bookCopy = bookCopy;
        this.reader = reader;
        this.dateOfRent = dateOfRent;
        this.dateOfReturn = dateOfReturn;
    }

    public BookRental() {

    }

    public Long getId() {
        return id;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public Reader getReader() {
        return reader;
    }

    public LocalDate getDateOfRent() {
        return dateOfRent;
    }

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }
}