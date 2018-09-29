package com.greenfoxacademy.todomysql.services;

import com.greenfoxacademy.todomysql.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  void save(Todo todo);

  Todo findById(long id);

  void deleteById(long id);

  List<Todo> getProperTodos(Boolean isActive, String searchedValue);
}