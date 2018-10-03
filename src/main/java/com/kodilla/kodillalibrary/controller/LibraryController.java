package com.kodilla.kodillalibrary.controller;

import com.kodilla.kodillalibrary.domain.BookCopyDto;
import com.kodilla.kodillalibrary.domain.BookRental;
import com.kodilla.kodillalibrary.domain.ReaderDto;
import com.kodilla.kodillalibrary.domain.TitleDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    public void createReader(ReaderDto readerDto){

    }

    public void createTitle(TitleDto titleDto) {

    }

    public void createBookCopy(BookCopyDto bookCopyDto) {

    }

    public BookCopyDto updateBookCopyStatus (BookCopyDto) {
        return new BookCopyDto(1L, 2L, "Updated status");
    }

    public BookCopyDto getBookCopyQuantity (Long titleId) {
        return new BookCopyDto(1L, 2L, "Status");
    }

    public BookRental rentBook(Long bookCopyId, Long readerId) {
        return new BookRental();
    }

    public BookRental returnBook(Long bookCopyId, Long readerId) {
        return new BookRental();
    }
}
