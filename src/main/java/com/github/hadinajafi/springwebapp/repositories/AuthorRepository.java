package com.github.hadinajafi.springwebapp.repositories;

import com.github.hadinajafi.springwebapp.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
