package me.mholubczat.spring5webapp.bootstrap;

import me.mholubczat.spring5webapp.model.Author;
import me.mholubczat.spring5webapp.model.Book;
import me.mholubczat.spring5webapp.model.Publisher;
import me.mholubczat.spring5webapp.repository.AuthorRepository;
import me.mholubczat.spring5webapp.repository.BookRepository;
import me.mholubczat.spring5webapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher zebra = new Publisher("Zebra", "Waryńskiego 12", "Warszawa", "Polska", "02-992");
        publisherRepository.save(zebra);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);


        ddd.setPublisher(zebra);
        noEJB.setPublisher(zebra);



        authorRepository.save(eric);
        bookRepository.save(ddd);


        authorRepository.save(rod);
        bookRepository.save(noEJB);



        publisherRepository.save(zebra);




        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher: " + publisherRepository.findAll().toString());
        System.out.println("Publisher: " + publisherRepository.count());


    }
}
