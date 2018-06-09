package com.jjwtan.graphql.demo.repository;

import com.jjwtan.graphql.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
