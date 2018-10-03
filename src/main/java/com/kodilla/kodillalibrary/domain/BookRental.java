package com.kodilla.kodillalibrary.domain;

import java.time.LocalDate;

public class BookRental {
    private Long bookCopyId;
    private Long readerId;
    private LocalDate dateOfRent;
    private LocalDate dateOfReturn;

    public BookRental(Long bookCopyId, Long readerId, LocalDate dateOfRent, LocalDate dateOfReturn) {
        this.bookCopyId = bookCopyId;
        this.readerId = readerId;
        this.dateOfRent = dateOfRent;
        this.dateOfReturn = dateOfReturn;
    }

    public BookRental() {

    }

    public Long getBookCopyId() {
        return bookCopyId;
    }

    public Long getReaderId() {
        return readerId;
    }

    public LocalDate getDateOfRent() {
        return dateOfRent;
    }

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }
}