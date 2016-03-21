package com.antonchernov.yetilibrary.controller;

import com.antonchernov.yetilibrary.model.Book;
import com.antonchernov.yetilibrary.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by anton.charnou on 21.03.2016.
 */
@RestController
@Slf4j
@RequestMapping("api/books")
public class BookController {
    @Autowired
    public BookRepository repository;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable String id) {
        log.info("getBookById with parameter $id");
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        log.info("getAllBooks()");
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Book createBook(@RequestBody Book newBook) {
        log.info("createBook with parameter $newBook");
        newBook.setId(null);
        return repository.save(newBook);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Book updateBook(@PathVariable String id, @RequestBody Book updatedBook) {
        log.info("updateBook with parameter $id and $updatedBook");
        updatedBook.setId(id);
        return repository.save(updatedBook);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void removeBook(@PathVariable String id) {
        log.info("removeBook with parameter $id");
        repository.delete(id);
    }


    @RequestMapping(value = "/search/byTitle/{firstName}", method = RequestMethod.GET)
    public Book getBookByTitle(@PathVariable String firstName) {
        log.info("getBookByFirstName with parameter $firstName");
        return repository.findByTitle(firstName);
    }
}
