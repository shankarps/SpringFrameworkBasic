package com.shankar.practice.springwebapp.bootstrap;

import com.shankar.practice.springwebapp.domain.Author;
import com.shankar.practice.springwebapp.domain.Book;
import com.shankar.practice.springwebapp.domain.Publisher;
import com.shankar.practice.springwebapp.repositories.AuthorRepository;
import com.shankar.practice.springwebapp.repositories.BookRepository;
import com.shankar.practice.springwebapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author auth1 = new Author("Andrew", "Ng");
        Author auth2 = new Author("Jim", "O'Shaughnessy");

        Book book1 = new Book("Machine Learning for beginners", "123456");
        Book book2 = new Book("What works on Wall Street?", "123456");

        auth1.getBooks().add(book1);
        auth2.getBooks().add(book2);
        book1.getAuthors().add(auth1);
        book2.getAuthors().add(auth2);
        authorRepository.save(auth1);
        bookRepository.save(book1);
        authorRepository.save(auth2);
        bookRepository.save(book2);

        Publisher publisher = new Publisher("Wiley", "New York");
        publisher.getBooks().add(book1);
        publisher.getBooks().add(book2);
        publisherRepository.save(publisher);

        System.out.println("Started ");
        System.out.println("Database: authors count " + authorRepository.count()
                + ", books count " + bookRepository.count()+", publisher count "+publisherRepository.count());
    }
}
