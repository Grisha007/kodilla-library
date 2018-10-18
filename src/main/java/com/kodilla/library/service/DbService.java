package com.kodilla.library.service;

import com.kodilla.library.domain.BookCopy;
import com.kodilla.library.domain.BookRental;
import com.kodilla.library.domain.Reader;
import com.kodilla.library.domain.Title;
import com.kodilla.library.repository.BookCopyRepository;
import com.kodilla.library.repository.BookRentalRepository;
import com.kodilla.library.repository.ReaderRepository;
import com.kodilla.library.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Transactional
@Service
public class DbService {
    @Autowired
    private TitleRepository titleRepository;
    @Autowired
    private BookCopyRepository bookCopyRepository;
    @Autowired
    private ReaderRepository readerRepository;
    @Autowired
    private BookRentalRepository bookRentalRepository;

    public List<Title> getAllTitles(){
        return titleRepository.findAll();
    }

    public BookCopy getBookCopy(Long bookCopyId) {
        return bookCopyRepository.findOne(bookCopyId);
    }

    public Reader getReader(Long readerId) {
        return readerRepository.findOne(readerId);
    }

    public void rentBook(BookCopy bookCopy, Reader reader) {
        BookRental bookRental = new BookRental(null, bookCopy, reader, LocalDate.now(), null);
        bookRentalRepository.save(bookRental);
    }

    public Title getTitle(Long titleId) {
        return titleRepository.findOne(titleId);
    }

    public void returnBook(BookCopy bookCopy, Reader reader) {

    }

    public Reader saveReader(final Reader reader) {
        return readerRepository.save(reader);
    }

    public Title saveTitle(Title title) {
        return titleRepository.save(title);
    }
}
