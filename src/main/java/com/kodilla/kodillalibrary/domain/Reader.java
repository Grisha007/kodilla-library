package com.kodilla.kodillalibrary.domain;

import java.time.LocalDate;

public class Reader {
    private Long id;
    private String name;
    private String surname;
    private LocalDate createAccountDate;

    public Reader(Long id, String name, String surname, LocalDate createAccountDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.createAccountDate = createAccountDate;
    }

    public Reader() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getCreateAccountDate() {
        return createAccountDate;
    }
}