package com.example.todo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class ToDo {
    @Id
    @GeneratedValue
    private long id;
    private String text;
    private boolean completed;

    public ToDo() {
    }

    public ToDo(String text, boolean completed) {
        this.text = text;
        this.completed = completed;
    }

    public ToDo(long id, String text, boolean completed) {
        this.id = id;
        this.text = text;
        this.completed = completed;
    }
}
