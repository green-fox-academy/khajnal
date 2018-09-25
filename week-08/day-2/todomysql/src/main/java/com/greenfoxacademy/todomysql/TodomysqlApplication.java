package com.greenfoxacademy.todomysql;

import com.greenfoxacademy.todomysql.model.Todo;
import com.greenfoxacademy.todomysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodomysqlApplication implements CommandLineRunner {

  TodoRepository todoRepository;

  @Autowired
  public TodomysqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodomysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Ask how to do a sort by id"));
    todoRepository.save(new Todo("Finish the time of creation", true, true));
    todoRepository.save(new Todo("Do the more information page", true, false));
  }
}