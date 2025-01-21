package com.spring_boot.web_app_todo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    public String redirectToLogin(){
        return "redirect:/login";
    }

    // To create a get request with the specified end-point
    @GetMapping("/say-hello")
    // To return the exact value and not through any View
    @ResponseBody
    public String sayHello(){
        return "Hello from Controller";
    }

    @GetMapping("/say-hello-jsp")
    public String sayHelloJSP(){
        return "hello";
    }
}
