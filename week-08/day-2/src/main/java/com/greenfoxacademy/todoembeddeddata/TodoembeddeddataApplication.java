package com.greenfoxacademy.todoembeddeddata;

import com.greenfoxacademy.todoembeddeddata.model.Todo;
import com.greenfoxacademy.todoembeddeddata.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoembeddeddataApplication implements CommandLineRunner {

  TodoRepository todoRepository;

  @Autowired
  public TodoembeddeddataApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoembeddeddataApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo(("I have to learn Object Relational Mapping")));
    todoRepository.save(new Todo(("I have to learn what I am doing")));
  }
}
