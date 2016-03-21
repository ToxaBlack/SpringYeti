package com.antonchernov.yetilibrary.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by anton.charnou on 21.03.2016.
 */
@Data
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private Date  date;


}
