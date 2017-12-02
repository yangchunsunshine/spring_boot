package org.spring.springboot.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class User {
    private Integer id;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}