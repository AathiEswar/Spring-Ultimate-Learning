package com.rest.webservices.rest_web_services.Controller;

import com.rest.webservices.rest_web_services.Entity.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

// To enable REST operations
@RestController
// Has @ResponseJson into them which will auto convert beans to json
public class HelloWorldController {

    // request mapping for enabling dispatcher servlet to know what method is exposed and which path is used
//    @RequestMapping(path = "hello" , method = RequestMethod.GET)
    @GetMapping(path = "/hello")
    public String helloWorld(){
        // return just a string
        return "Hello World Frm REST WebServices";
    }

    @GetMapping(path = "/hello-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello from Bean");
    }

    // Path variable is used to get params from url and use it inside our mapping functions
    @GetMapping(path = "/hello-bean/path-var/{name}")
    public HelloWorldBean helloWorldBeanPathVar(@PathVariable String name){
        return new HelloWorldBean("Hello  " + name  + " from Bean");
    }
}
