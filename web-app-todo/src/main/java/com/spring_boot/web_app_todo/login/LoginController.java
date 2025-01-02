package com.spring_boot.web_app_todo.login;

import com.spring_boot.web_app_todo.auth.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

// to mention it s a web controller
@Controller
// used for adding attributes to session handling to persist the value across multiple request
@SessionAttributes("name")
public class LoginController {

    //    private Logger logger = LoggerFactory.getLogger(getClass());
//
//    // performs a get request in the mentioned end-point
//    @GetMapping("login")
//    // @RequestParam is to get the specified params query from the url
//    // Model Map - creates a LinkedHashMap and maps a model to a data reference
//    public String login(@RequestParam(name="name" , defaultValue = "Traveller") String name , ModelMap modelMap){
//        // returns the login.jsp with the provided prefix in the application.properties
//        modelMap.put("name" , name);
//        logger.debug("Name is : {}" , name);
//        logger.warn("Name is : {}" , name);
//        logger.info("Name is : {}" , name);
//        return "login";
//    }

    private AuthenticationService authService;

    public LoginController(AuthenticationService authService) {
        this.authService = authService;
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @PostMapping("login")
    public String loginToWelcome(@RequestParam(name = "name") String name,
                                 @RequestParam String password,
                                 ModelMap modelMap
    ) {

        if (authService.authenticationService(name, password)) {

            modelMap.put("name", name);
            return "welcome";
        }
        modelMap.put("error" , "Invalid Credentials");
        return "login";
    }
}
