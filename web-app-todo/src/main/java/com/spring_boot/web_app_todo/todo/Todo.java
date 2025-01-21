package com.spring_boot.web_app_todo.todo;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String userName ;

    @Size(min = 10 , message = "Enter atleast 10 Characters")
    private String description ;

    private LocalDate localDate;
    private boolean done;

    public Todo(int id, String userName, String description, LocalDate localDate, boolean done) {
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.localDate = localDate;
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", localDate=" + localDate +
                ", done=" + done +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
