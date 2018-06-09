package com.jjwtan.graphql.demo.repository;

import com.jjwtan.graphql.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
