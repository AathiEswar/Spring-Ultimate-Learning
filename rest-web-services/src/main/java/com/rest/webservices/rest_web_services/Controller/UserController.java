package com.rest.webservices.rest_web_services.Controller;

import com.rest.webservices.rest_web_services.Entity.User;
import com.rest.webservices.rest_web_services.Service.UserDoaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/users")
    public ResponseEntity<User> createUser(
            // Enable Validation the object when binding
            @Valid
            // Get Data from request body
            @RequestBody
            // get the user
            User user
    ) throws Exception {
        return userDoaService.saveOne(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable long id) throws Exception {
        return userDoaService.deleteOne(id);
    }
}
