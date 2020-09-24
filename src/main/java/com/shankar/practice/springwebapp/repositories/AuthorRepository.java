package com.shankar.practice.springwebapp.repositories;

import com.shankar.practice.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
