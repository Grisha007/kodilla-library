package com.kodilla.library.domain;

import java.time.LocalDate;

public class BookRentalDto {
    private Long id;
    private Long bookCopyId;
    private Long readerId;
    private LocalDate dateOfRent;
    private LocalDate dateOfReturn;

    public BookRentalDto(Long id, Long bookCopyId, Long readerId, LocalDate dateOfRent, LocalDate dateOfReturn) {
        this.id = id;
        this.bookCopyId = bookCopyId;
        this.readerId = readerId;
        this.dateOfRent = dateOfRent;
        this.dateOfReturn = dateOfReturn;
    }

    public BookRentalDto() {

    }

    public Long getId() {
        return id;
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