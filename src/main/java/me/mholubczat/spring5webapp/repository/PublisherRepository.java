package me.mholubczat.spring5webapp.repository;

import me.mholubczat.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
