package com.shankar.practice.springwebapp.repositories;

import com.shankar.practice.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
