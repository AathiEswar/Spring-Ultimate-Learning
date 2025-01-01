package com.spring_boot.web_app_todo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// to mention it s a web controller
@Controller
public class LoginController {

    // performs a get request in the mentioned end-point
    @GetMapping("login")
    // @RequestParam is to get the specified params query from the url
    // Model Map - creates a LinkedHashMap and maps a model to a data reference
    public String login(@RequestParam(name="name" , defaultValue = "Traveller") String name , ModelMap modelMap){
        // returns the login.jsp with the provided prefix in the application.properties
        modelMap.put("name" , name);
        return "login";
    }
}
