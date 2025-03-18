package com.rest.webservices.rest_web_services.Service;

import com.rest.webservices.rest_web_services.Entity.User;
import com.rest.webservices.rest_web_services.Exceptions.NegativeIdException;
import com.rest.webservices.rest_web_services.Exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

@Service
public class UserDoaService {

    static int latestId = 0;
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(++latestId, "Mark", LocalDate.now().minusYears(30)));
        users.add(new User(++latestId, "Eve", LocalDate.now().minusYears(28)));
        users.add(new User(++latestId, "Oliver", LocalDate.now().minusYears(5)));
    }

    public List<User> findAll() {
        if (users == null || users.isEmpty()) {
            throw new NoSuchElementException("No User Database");
        }
        return users;
    }

    public User findOne(long id) throws Exception {
        if (id < 0) {
            throw new NegativeIdException("ID cannot be negative");
        }

        if (users == null || users.isEmpty()) {
            throw new NoSuchElementException("User list is empty or uninitialized");
        }

        Predicate<? super User> predicate = user -> user.getId() == id;

        return users.stream()
                .filter(predicate)
                .findFirst().orElseThrow(
                        () -> new UserNotFoundException("User Not Found")
                );
    }

    public ResponseEntity<User> saveOne(User user) throws Exception {

        // when no user DB is found Create it
        if (users == null || users.isEmpty()) {
            users = new ArrayList<User>();
        }

//        // when the name is empty throw error
//        if (user.getName().trim().isEmpty()) {
//            throw new IllegalAccessException("Name not valid");
//        }
//
        // or else
        user.setId(++latestId);
        users.add(user);

        // build the location URI to help user locate the newly created resource in the response
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();

        // a response entity that allows returns created status with the uri location
        return ResponseEntity.created(location).body(user);
    }

    public ResponseEntity<User> deleteOne(long id) throws Exception {
       User deleteUser = findOne(id);
       users.remove(deleteUser);
       return ResponseEntity.status(HttpStatus.OK).body(deleteUser);
    }

}
