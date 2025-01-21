package com.spring_boot.web_app_todo.controller;

import com.spring_boot.web_app_todo.todo.Todo;
import com.spring_boot.web_app_todo.todo.TodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("list-todo")
    public String listTodo(ModelMap modelMap) {
        modelMap.put("todos", todoService.findAllTodo());
        return "listTodo";
    }

    @GetMapping("add-todo")
    public String addTodo(ModelMap modelMap) {
        Todo todo = new Todo(
                0 ,
                (String) modelMap.get("name"),
                "",
                LocalDate.now().plusYears(1),
                false
        );
        modelMap.put("todo" , todo);
        return "addTodo";
    }

    @PostMapping("add-todo")
    // Binding Result -> gets the data about error messages
    public String addNewTodo(ModelMap modelMap, @Valid Todo todo , BindingResult result) {

        if(result.hasErrors()){
            return "addTodo";
        }

        todoService.addTodoToList(
                (String) (modelMap.get("name")),
                todo.getDescription(),
                todo.getLocalDate(),
                todo.isDone()
        );

        return "redirect:/list-todo";
    }

    @GetMapping("delete-todo")
    public String deleteTodo(@RequestParam(name = "id") long id ){
        todoService.deleteTodo(id);
        return "redirect:/list-todo";
    }

    @GetMapping("update-todo")
    public String showUpdateTodo(@RequestParam(name = "id") long id , ModelMap modelMap ){
        Todo todo = todoService.getTodoById(id);
        modelMap.put("todo" , todo);
        return "addTodo";
    }

    @PostMapping("update-todo")
    // Binding Result -> gets the data about error messages
    public String updateTodo(ModelMap modelMap, @Valid Todo todo , BindingResult result) {

        if(result.hasErrors()){
            return "todo";
        }

        todo.setUserName((String) modelMap.get("userName"));
        todoService.updateTodo(todo);

        return "redirect:/list-todo";
    }
}
