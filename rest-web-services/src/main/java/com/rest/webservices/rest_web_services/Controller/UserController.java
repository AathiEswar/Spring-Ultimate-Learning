package com.rest.webservices.rest_web_services.Controller;

import com.rest.webservices.rest_web_services.Entity.User;
import com.rest.webservices.rest_web_services.Service.UserDoaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class UserController {

    // service for user to process business logic
    private final UserDoaService userDoaService;

    // auto-injection using constructor
    public UserController(UserDoaService userDoaService) {
        this.userDoaService = userDoaService;
    }

    // get method to retrieve all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userDoaService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable long id) throws Exception {
        return userDoaService.findOne(id);
    }
}
