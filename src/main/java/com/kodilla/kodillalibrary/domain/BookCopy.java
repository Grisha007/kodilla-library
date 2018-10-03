package com.kodilla.kodillalibrary.domain;

public class BookCopy {
    private Long id;
    private Long titleId;
    private String status;

    public BookCopy(Long id, Long titleId, String status) {
        this.id = id;
        this.titleId = titleId;
        this.status = status;
    }

    public BookCopy() {

    }

    public Long getId() {
        return id;
    }

    public Long getTitleId() {
        return titleId;
    }

    public String getStatus() {
        return status;
    }
}