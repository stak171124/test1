package com.jk.model;

import java.io.Serializable;

public class User implements Serializable{
    private Integer id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public Integer getId() {

        return id;
    }
}
