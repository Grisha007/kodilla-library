package com.kodilla.library.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "BOOK_COPY")
public class BookCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "TITLE_ID")
    private Title title;
    @Column(name = "STATUS")
    private String status;
    @OneToMany(targetEntity = BookRental.class,
            mappedBy = "bookCopy")
    private List<BookRental> rentals = new ArrayList<>();

    public BookCopy(Long id, Title title, String status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public BookCopy() {

    }

    public Long getId() {
        return id;
    }

    public Title getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public List<BookRental> getRentals() {
        return rentals;
    }
}