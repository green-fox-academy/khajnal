package com.greenfoxacademy.springsecurity.services;


import com.greenfoxacademy.springsecurity.models.Todo;
import com.greenfoxacademy.springsecurity.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService {

  TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public Todo findById(long id) {
    return todoRepository.findById(id);
  }

  @Override
  public void deleteById(long id) {
    todoRepository.deleteById(id);
  }

  @Override
  public List<Todo> getProperTodos(Boolean isActive, String searchedValue) {
    List<Todo> properTodo = todoRepository.findAllByOrderByIdAsc();

    if (isActive == null && searchedValue != null) {
      properTodo = properTodo.stream().filter(x -> x.getTitle().contains(searchedValue)).collect(Collectors.toList());
    }
    if (isActive != null && searchedValue == null) {
      properTodo = todoRepository.findByDone(!isActive);
    }
    if (isActive != null && searchedValue != null) {
      properTodo = todoRepository.findByDone(!isActive).stream().filter(x -> x.getTitle().contains(searchedValue)).collect(Collectors.toList());
    }
    return properTodo;
  }
}