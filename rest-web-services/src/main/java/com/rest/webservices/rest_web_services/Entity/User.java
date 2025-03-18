package com.rest.webservices.rest_web_services.Entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

// A POJO as Entity with User details with constructor , getter , setter and toString methods
public class User {

    private long id;

    // Validation for length
    @Size(min = 2 , message = "Name should be of at least 2 characters")
    @NotBlank(message = "Name should not be Blank")
    private String name;

    // Validation for past date only
    @Past(message = "Birth Date should be from past")
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
