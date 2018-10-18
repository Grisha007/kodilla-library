package com.kodilla.library.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "READER")
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "READER_NAME")
    private String name;
    @Column(name = "READER_SURNAME")
    private String surname;
    @Column(name = "CREATE_ACCOUNT_DATE")
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