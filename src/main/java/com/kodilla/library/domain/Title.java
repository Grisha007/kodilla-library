package com.kodilla.library.domain;

import javax.persistence.*;
import java.util.List;

@Entity(name = "TITLE")
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "AUTHOR")
    private String author;
    @Column(name = "PUBLICATION_YEAR")
    private int publicationYear;
    @OneToMany(targetEntity = BookCopy.class,
                mappedBy = "title")
    private List<BookCopy> copies;

    public Title(Long id, String title, String author, int publicationYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public Title() {

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public List<BookCopy> getCopies() {
        return copies;
    }
}