package com.antonchernov.yetilibrary.rest.model;

import org.springframework.data.annotation.Id;

import java.util.List;


/**
 * Created by anton.charnou on 21.03.2016.
 */

public class Account {

    @Id
    private String id;
    private String username;
    private String password;
    private List<Role> roles;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account() {
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
