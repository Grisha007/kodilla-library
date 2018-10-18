package com.kodilla.library.domain;

public class BookCopyDto {
    private Long id;
    private Long titleId;
    private String status;

    public BookCopyDto(Long id, Long titleId, String status) {
        this.id = id;
        this.titleId = titleId;
        this.status = status;
    }

    public BookCopyDto() {

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