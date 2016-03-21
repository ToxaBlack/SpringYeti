package com.antonchernov.yetilibrary.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;


/**
 * Created by anton.charnou on 21.03.2016.
 */
@Data
public class Account {

    @Id
    private String id;
    private String username;
    private String password;
    private List<Role> roles;

}
