package com.kodilla.library.controller;

import com.kodilla.library.domain.BookCopyDto;
import com.kodilla.library.domain.BookRentalDto;
import com.kodilla.library.domain.ReaderDto;
import com.kodilla.library.domain.TitleDto;
import com.kodilla.library.mapper.LibraryMapper;
import com.kodilla.library.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1/library")
public class LibraryController {
    @Autowired
    private DbService dbService;
    @Autowired
    private LibraryMapper libraryMapper;

//    @RequestMapping(method = RequestMethod.GET, value = "getTitleList")
//    public List<TitleDto> getTitleList() {
//        return libraryMapper.mapToTitleDtoList(dbService.getAllTitles());
//    }

    @RequestMapping(method = RequestMethod.POST, value = "createReader", consumes = APPLICATION_JSON_VALUE)
    public void createReader(@RequestBody ReaderDto readerDto){
        dbService.saveReader(libraryMapper.mapToReader(readerDto));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTitle", consumes = APPLICATION_JSON_VALUE)
    public void createTitle(@RequestBody TitleDto titleDto) {
        dbService.saveTitle(libraryMapper.mapToTitle(titleDto));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createBookCopy", consumes = APPLICATION_JSON_VALUE)
    public void createBookCopy(@RequestBody BookCopyDto bookCopyDto) {
        dbService.saveBookCopy(libraryMapper.mapToBookCopy(bookCopyDto));
    }

//    @RequestMapping(method = RequestMethod.PUT, value = "updateBookCopyStatus")
//    public BookCopyDto updateBookCopyStatus (@RequestBody BookCopyDto bookCopyDto) {
//        return new BookCopyDto(1L, 2L, "Updated status");
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "getBookCopyQuantity")
//    public BookCopyDto getBookCopyQuantity (@RequestParam Long titleId) {
//        return new BookCopyDto(1L, 2L, "Status");
//    }

    @RequestMapping(method = RequestMethod.POST, value = "rentBook")
    public void rentBook(@RequestParam Long bookCopyId, @RequestParam Long readerId) {
        dbService.rentBook(libraryMapper.mapToBookCopy(bookCopyId), libraryMapper.mapToReader(readerId));
    }

    @RequestMapping(method = RequestMethod.POST, value = "returnBook")
    public void returnBook(@RequestBody BookRentalDto bookRentalDto) {
        dbService.returnBook(libraryMapper.mapToBookRental(bookRentalDto));
    }
}