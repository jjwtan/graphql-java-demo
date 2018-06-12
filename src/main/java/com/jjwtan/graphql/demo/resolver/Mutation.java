//package com.jjwtan.graphql.demo.resolver;
//
//import com.coxautodev.graphql.tools.GraphQLMutationResolver;
//import com.jjwtan.graphql.demo.exception.BookNotFoundException;
//import com.jjwtan.graphql.demo.model.Author;
//import com.jjwtan.graphql.demo.model.Book;
//import com.jjwtan.graphql.demo.repository.AuthorRepository;
//import com.jjwtan.graphql.demo.repository.BookRepository;
//
//import java.util.Optional;
//
//public class Mutation implements GraphQLMutationResolver {
//    private BookRepository bookRepository;
//    private AuthorRepository authorRepository;
//
//    public Mutation(AuthorRepository authorRepository, BookRepository bookRepository) {
//        this.authorRepository = authorRepository;
//        this.bookRepository = bookRepository;
//    }
//
//    public Author newAuthor(String firstName, String lastName) {
//        Author author = new Author();
//        author.setFirstName(firstName);
//        author.setLastName(lastName);
//
//        authorRepository.save(author);
//
//        return author;
//    }
//
//    public Book newBook(String title, String isbn, Integer pageCount, Long authorId) {
//        Book book = new Book();
//        book.setAuthor(new Author(authorId));
//        book.setTitle(title);
//        book.setIsbn(isbn);
//        book.setPageCount(pageCount != null ? pageCount : 0);
//
//        bookRepository.save(book);
//
//        return book;
//    }
//
//    public boolean deleteBook(Long id) {
//        bookRepository.deleteById(id);
//        return true;
//    }
//
//    public Book updateBookPageCount(Integer pageCount, Long id) {
//        Optional<Book> book = bookRepository.findById(id);
//        if(!book.isPresent()) {
//            throw new BookNotFoundException("The book to be updated was not found", id);
//        }
//        book.get().setPageCount(pageCount);
//
//        bookRepository.save(book.get());
//
//        return book.get();
//    }
//
//}
