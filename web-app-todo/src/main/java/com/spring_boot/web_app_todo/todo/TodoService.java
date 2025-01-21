package com.spring_boot.web_app_todo.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    public static List<Todo> TodoList = new ArrayList<>();

    public static int todoCount = 0;

    static {
        TodoList.add(new Todo(++todoCount, "Aathi", "Learn Spring Boot", LocalDate.now(), false));
        TodoList.add(new Todo(++todoCount, "Aathi", "Learn Three Js", LocalDate.now(), false));
        TodoList.add(new Todo(++todoCount, "Aathi", "Learn Web Design", LocalDate.now(), false));
    }

    public List<Todo> findByUserName(String userName) {
        return TodoList;
    }

    public void addTodoToList(
            String userName ,
            String description ,
            LocalDate localDate ,
            boolean status
    ) {
        Todo todo = new Todo(++todoCount,userName , description , localDate , status);
        TodoList.add(todo);
    }

    public void deleteTodo(long id){
        TodoList.removeIf(todo -> todo.getId() == id);
    }

}
