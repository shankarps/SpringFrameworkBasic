package com.shankar.practice.springwebapp.repositories;

import com.shankar.practice.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
