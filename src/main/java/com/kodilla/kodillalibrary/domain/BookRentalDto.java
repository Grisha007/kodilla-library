package com.kodilla.kodillalibrary.domain;

import java.time.LocalDate;

public class BookRentalDto {
    private Long bookCopyId;
    private Long readerId;
    private LocalDate dateOfRent;
    private LocalDate dateOfReturn;

    public BookRentalDto(Long bookCopyId, Long readerId, LocalDate dateOfRent, LocalDate dateOfReturn) {
        this.bookCopyId = bookCopyId;
        this.readerId = readerId;
        this.dateOfRent = dateOfRent;
        this.dateOfReturn = dateOfReturn;
    }

    public BookRentalDto() {

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