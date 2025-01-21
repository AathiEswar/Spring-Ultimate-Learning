package com.spring_boot.web_app_todo.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoControllerRest {

    @Autowired
    private TodoServiceRest todoService;

    @GetMapping
    public List<TodoRest> getAllTodos() {
        return todoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoRest> getTodoById(@PathVariable Long id) {
        return todoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TodoRest> createTodo(@RequestBody TodoRest todo) {
        TodoRest savedTodo = todoService.save(todo);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTodo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoRest> updateTodo(@PathVariable Long id, @RequestBody TodoRest todo) {
        return todoService.findById(id)
                .map(existingTodo -> {
                    todo.setId(id);
                    return ResponseEntity.ok(todoService.save(todo));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodoById(@PathVariable Long id) {
        if (todoService.findById(id).isPresent()) {
            todoService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

