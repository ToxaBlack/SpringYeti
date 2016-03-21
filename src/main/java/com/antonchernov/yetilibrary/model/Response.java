package com.antonchernov.yetilibrary.model;

import lombok.Data;

/**
 * Created by anton.charnou on 21.03.2016.
 */
@Data
public class Response<T> {
    private String type;
    private T data;


}
