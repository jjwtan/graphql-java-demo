//package com.jjwtan.graphql.demo.resolver;
//
//import com.coxautodev.graphql.tools.GraphQLQueryResolver;
//import com.jjwtan.graphql.demo.model.Author;
//import com.jjwtan.graphql.demo.model.Book;
//import com.jjwtan.graphql.demo.repository.AuthorRepository;
//import com.jjwtan.graphql.demo.repository.BookRepository;
//
//public class Query implements GraphQLQueryResolver {
//    private BookRepository bookRepository;
//    private AuthorRepository authorRepository;
//
//    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//        this.authorRepository = authorRepository;
//    }
//
//    public Iterable<Book> findAllBooks() {
//        return bookRepository.findAll();
//    }
//
//    public Iterable<Author> findAllAuthors() {
//        return authorRepository.findAll();
//    }
//
//    public Long countBooks() {
//        return bookRepository.count();
//    }
//
//    public Long countAuthors() {
//        return authorRepository.count();
//    }
//}
