package com.rest.webservices.rest_web_services.Entity.Person;

public class PersonV1 {
    private String fullName ;

    public PersonV1(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
