package com.kodilla.library.repository;

import com.kodilla.library.domain.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends CrudRepository<Reader, Long> {
    @Override
    Reader save(Reader reader);
}
