package com.raultavares.Todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raultavares.Todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long > {
    
}
