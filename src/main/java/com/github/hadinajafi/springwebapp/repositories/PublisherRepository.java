package com.github.hadinajafi.springwebapp.repositories;

import com.github.hadinajafi.springwebapp.models.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
