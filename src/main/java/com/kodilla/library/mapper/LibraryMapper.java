package com.kodilla.library.mapper;

import com.kodilla.library.domain.*;
import com.kodilla.library.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class LibraryMapper {
    @Autowired
    private DbService dbService;

    public BookCopy mapToBookCopy(final BookCopyDto bookCopyDto) {
        return new BookCopy(bookCopyDto.getId(),
                dbService.getTitle(bookCopyDto.getTitleId()),
                bookCopyDto.getStatus());
    }

    public BookCopyDto mapToBookCopyDto(final BookCopy bookCopy) {
        return new BookCopyDto(bookCopy.getId(),
                bookCopy.getTitle().getId(),
                bookCopy.getStatus());
    }

    public List<BookCopyDto> mapToBookCopyDtoList(final List<BookCopy> bookCopyList) {
        return bookCopyList.stream()
                .map(b -> new BookCopyDto(b.getId(), b.getTitle().getId(), b.getStatus()))
                .collect(Collectors.toList());
    }

    public BookRental mapToBookRental(final BookRentalDto bookRentalDto) {
        return new BookRental(bookRentalDto.getId(),
                dbService.getBookCopy(bookRentalDto.getBookCopyId()),
                dbService.getReader(bookRentalDto.getReaderId()),
                LocalDate.now(), null);
    }

    public BookRentalDto mapToBookRentalDto(final BookRental bookRental) {
        return new BookRentalDto();
    }

    public List<BookRentalDto> mapToBookRentalDtoList(final List<BookRental> bookRentalList) {
        return bookRentalList.stream()
                .map(b -> new BookRentalDto(b.getId(), b.getBookCopy().getId(), b.getReader().getId(), b.getDateOfRent(), b.getDateOfReturn()))
                .collect(Collectors.toList());
    }

    public Reader mapToReader(final ReaderDto readerDto){
        return new Reader(readerDto.getId(),
                readerDto.getName(),
                readerDto.getSurname(),
                readerDto.getCreateAccountDate());
    }

    public ReaderDto mapToReaderDto(final Reader reader){
        return new ReaderDto(reader.getId(),
                reader.getName(),
                reader.getSurname(),
                reader.getCreateAccountDate());
    }

    public List<ReaderDto> mapToReaderDtoList(final List<Reader> readerList) {
        return readerList.stream()
                .map(r -> new ReaderDto(r.getId(), r.getName(), r.getSurname(), r.getCreateAccountDate()))
                .collect(Collectors.toList());
    }

    public Title mapToTitle(final TitleDto titleDto) {
        return new Title(titleDto.getId(),
                titleDto.getTitle(),
                titleDto.getAuthor(),
                titleDto.getPublicationYear());
    }

    public TitleDto mapToTitleDto(final Title title) {
        return new TitleDto(title.getId(),
                title.getTitle(),
                title.getAuthor(),
                title.getPublicationYear());
    }

    public List<TitleDto> mapToTitleDtoList(final List<Title> titleList) {
        return titleList.stream()
                .map(t -> new TitleDto(t.getId(), t.getTitle(), t.getAuthor(), t.getPublicationYear()))
                .collect(Collectors.toList());
    }

    public BookCopy mapToBookCopy(Long bookCopyId) {
        return dbService.getBookCopy(bookCopyId);
    }

    public Reader mapToReader(Long readerId) {
        return dbService.getReader(readerId);
    }
}