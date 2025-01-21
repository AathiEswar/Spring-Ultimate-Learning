package com.spring_boot.web_app_todo.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceRest {

    @Autowired
    private TodoRepositoryRest todoRepository;

    public List<TodoRest> findAll() {
        return todoRepository.findAll();
    }

    public Optional<TodoRest> findById(Long id) {
        return todoRepository.findById(id);
    }

    public TodoRest save(TodoRest todo) {
        return todoRepository.save(todo);
    }

    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }
}
