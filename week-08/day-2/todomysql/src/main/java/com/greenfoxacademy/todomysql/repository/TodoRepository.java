package com.greenfoxacademy.todomysql.repository;

import com.greenfoxacademy.todomysql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findByDone(Boolean isDone);
}