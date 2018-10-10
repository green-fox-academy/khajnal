package com.greenfoxacademy.springsecurity.repositories;

import com.greenfoxacademy.springsecurity.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findByDone(boolean isDone);

  List<Todo> findAllByOrderByIdAsc();

  Todo findById(long id);
}