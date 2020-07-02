package com.greenfoxacademy.springstart;

public class Greeting {
    protected Long id;
    protected String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}