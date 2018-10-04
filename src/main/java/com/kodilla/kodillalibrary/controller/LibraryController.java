package com.kodilla.kodillalibrary.controller;

import com.kodilla.kodillalibrary.domain.BookCopyDto;
import com.kodilla.kodillalibrary.domain.ReaderDto;
import com.kodilla.kodillalibrary.domain.TitleDto;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/library")
public class LibraryController {

    @RequestMapping(method = RequestMethod.POST, value = "createReader", consumes = APPLICATION_JSON_VALUE)
    public void createReader(@RequestBody ReaderDto readerDto){

    }

    @RequestMapping(method = RequestMethod.POST, value = "createTitle", consumes = APPLICATION_JSON_VALUE)
    public void createTitle(@RequestBody TitleDto titleDto) {

    }

    @RequestMapping(method = RequestMethod.POST, value = "createTitle", consumes = APPLICATION_JSON_VALUE)
    public void createBookCopy(@RequestBody BookCopyDto bookCopyDto) {

    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateBookCopyStatus")
    public BookCopyDto updateBookCopyStatus (@RequestBody BookCopyDto bookCopyDto) {
        return new BookCopyDto(1L, 2L, "Updated status");
    }

    @RequestMapping(method = RequestMethod.GET, value = "getBookCopyQuantity")
    public BookCopyDto getBookCopyQuantity (@RequestParam Long titleId) {
        return new BookCopyDto(1L, 2L, "Status");
    }

    public void rentBook(@RequestParam Long bookCopyId, @RequestParam Long readerId) {

    }

    public void returnBook(@RequestParam Long bookCopyId, @RequestParam Long readerId) {

    }
}
