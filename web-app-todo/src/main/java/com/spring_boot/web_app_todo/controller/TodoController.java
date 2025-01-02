package com.spring_boot.web_app_todo.controller;

import com.spring_boot.web_app_todo.todo.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    private TodoService todoService ;

    @GetMapping("list-todo")
    public String listTodo(ModelMap modelMap){
        modelMap.put("todos" , todoService.findByUserName("SomeRandom"));
        return "listTodo";
    }
}
