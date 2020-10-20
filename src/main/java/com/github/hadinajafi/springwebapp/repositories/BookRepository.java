package com.github.hadinajafi.springwebapp.repositories;

import com.github.hadinajafi.springwebapp.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
