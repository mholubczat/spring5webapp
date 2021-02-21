package me.mholubczat.spring5webapp.repository;

import me.mholubczat.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
