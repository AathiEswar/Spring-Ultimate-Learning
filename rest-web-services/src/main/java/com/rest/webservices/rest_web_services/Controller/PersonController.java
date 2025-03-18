package com.rest.webservices.rest_web_services.Controller;

import com.rest.webservices.rest_web_services.Entity.Person.PersonV1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PersonController {

    @GetMapping("/name")
    public PersonV1 personNameV1() {
        return new PersonV1("Aathi Eswar");
    }

}

