package com.kodilla.library.repository;

import com.kodilla.library.domain.BookRental;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRentalRepository extends CrudRepository<BookRental, Long> {
}
