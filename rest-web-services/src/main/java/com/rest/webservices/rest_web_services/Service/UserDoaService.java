package com.rest.webservices.rest_web_services.Service;

import com.rest.webservices.rest_web_services.Entity.User;
import com.rest.webservices.rest_web_services.Exceptions.NegativeIdException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

@Service
public class UserDoaService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Mark", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Eve", LocalDate.now().minusYears(28)));
        users.add(new User(3, "Oliver", LocalDate.now().minusYears(5)));
    }

    public List<User> findAll() {
        if(users == null || users.isEmpty()){
            throw new NoSuchElementException("No User Database");
        }
        return users;
    }

    public User findOne(long id) throws Exception  {
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
                        () -> new NoSuchElementException("No User Found")
                );
    }


}
