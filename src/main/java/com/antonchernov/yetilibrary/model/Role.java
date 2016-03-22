package com.antonchernov.yetilibrary.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by anton.charnou on 21.03.2016.
 */

public class Role {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
