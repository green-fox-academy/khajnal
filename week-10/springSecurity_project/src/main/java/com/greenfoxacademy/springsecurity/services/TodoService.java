package com.greenfoxacademy.springsecurity.services;

import com.greenfoxacademy.springsecurity.models.Todo;

import java.util.List;

public interface TodoService {
  void save(Todo todo);

  Todo findById(long id);

  void deleteById(long id);

  List<Todo> getProperTodos(Boolean isActive, String searchedValue);
}