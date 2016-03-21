package com.antonchernov.yetilibrary.repository;

import com.antonchernov.yetilibrary.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by anton.charnou on 21.03.2016.
 */
public interface BookRepository extends MongoRepository<Book, String> {
    Book findByTitle(String title);
    List<Book> findByAuthor(String author);
}
