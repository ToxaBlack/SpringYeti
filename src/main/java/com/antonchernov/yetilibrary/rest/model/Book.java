package com.antonchernov.yetilibrary.rest.model;

import org.springframework.data.annotation.Id;

/**
 * Created by anton.charnou on 21.03.2016.
 */

public class Book {
    @Id
    private String id;
    private String title;
    private String author;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
