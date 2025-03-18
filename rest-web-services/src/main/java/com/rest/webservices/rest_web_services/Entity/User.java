package com.rest.webservices.rest_web_services.Entity;

import java.time.LocalDate;

// A POJO as Entity with User details with constructor , getter , setter and toString methods
public class User {
    private String name;
    private long id;
    private LocalDate birthDate;

    public User(long id, String name , LocalDate birthDate) {
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", birthDate=" + birthDate +
                '}';
    }
}
