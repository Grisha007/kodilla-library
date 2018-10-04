package com.kodilla.kodillalibrary.domain;

public class BookCopy {
    private Long id;
    private Title title;
    private String status;

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
}