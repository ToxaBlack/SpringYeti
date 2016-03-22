package com.antonchernov.yetilibrary.rest.model;

/**
 * Created by anton.charnou on 21.03.2016.
 */

public class Response<T> {
    private String type;
    private T data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
