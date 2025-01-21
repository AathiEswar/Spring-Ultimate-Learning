package com.spring_boot.web_app_todo.REST;


import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepositoryRest extends JpaRepository<TodoRest, Long> {
}