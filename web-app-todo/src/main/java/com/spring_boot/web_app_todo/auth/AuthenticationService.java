package com.spring_boot.web_app_todo.auth;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticationService(String name , String password){
        boolean validName = name.equalsIgnoreCase("Aathi");
        boolean validPassword = password.equalsIgnoreCase("pass") ;

        return validName && validPassword ;
    }
}
