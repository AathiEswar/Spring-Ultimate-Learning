package com.rest.webservices.rest_web_services.Controller;

import com.rest.webservices.rest_web_services.Entity.Person.Name;
import com.rest.webservices.rest_web_services.Entity.Person.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class PersonControllerV2 {

    @GetMapping("/name")
    public PersonV2 personNameV2() {
        return new PersonV2(new Name("Mark", "Grayson"));
    }
}
