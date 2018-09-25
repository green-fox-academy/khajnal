package com.greenfoxacademy.todoembeddeddata.repository;

import com.greenfoxacademy.todoembeddeddata.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
