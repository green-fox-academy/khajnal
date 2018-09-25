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
    todoRepository.save(new Todo("Blabla"));
    todoRepository.save(new Todo("bubu", true, true));
    todoRepository.save(new Todo("blublu", true, true));
  }
}
