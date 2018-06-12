//package com.jjwtan.graphql.demo.resolver;
//
//import com.coxautodev.graphql.tools.GraphQLResolver;
//import com.jjwtan.graphql.demo.model.Author;
//import com.jjwtan.graphql.demo.model.Book;
//import com.jjwtan.graphql.demo.repository.AuthorRepository;
//
//import java.util.Optional;
//
//public class BookResolver implements GraphQLResolver<Book> {
//    private AuthorRepository authorRepository;
//
//    public BookResolver(AuthorRepository authorRepository) {
//        this.authorRepository = authorRepository;
//    }
//
//    public Optional<Author> getAuthor(Book book) {
//        return authorRepository.findById(book.getAuthor().getId());
//    }
//}
