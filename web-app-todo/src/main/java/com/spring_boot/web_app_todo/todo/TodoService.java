package com.spring_boot.web_app_todo.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    public static List<Todo> TodoList = new ArrayList<>();

    static {
        TodoList.add(new Todo(1 , "Aathi", "Learn Spring Boot" , LocalDate.now() , false));
        TodoList.add(new Todo(2 , "Aathi", "Learn Three Js" , LocalDate.now() , false));
        TodoList.add(new Todo(3 , "Aathi", "Learn Web Design" , LocalDate.now() , false));
    }

    public List<Todo> findByUserName(String userName){
        return TodoList;
    }

}
