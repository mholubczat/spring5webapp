package me.mholubczat.spring5webapp.repository;

import me.mholubczat.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book,Long> {
}
