package com.rest.webservices.rest_web_services.Service;

import com.rest.webservices.rest_web_services.Entity.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDoaService {

    private static List<Users> users = new ArrayList<>();

    static {
        users.add(new Users(1, "Mark", LocalDate.now().minusYears(30)));
        users.add(new Users(2, "Eve", LocalDate.now().minusYears(28)));
        users.add(new Users(3, "Oliver", LocalDate.now().minusYears(5)));
    }

    public List<Users> findAll(){
        return users;
    }

}
