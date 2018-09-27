package com.greenfoxacademy.todomysql;

import com.greenfoxacademy.todomysql.model.Assignee;
import com.greenfoxacademy.todomysql.model.Todo;
import com.greenfoxacademy.todomysql.repository.AssigneeRepository;
import com.greenfoxacademy.todomysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodomysqlApplication implements CommandLineRunner {

  TodoRepository todoRepository;
  AssigneeRepository assigneeRepository;

  @Autowired
  public TodomysqlApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodomysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Ask how to do a sort by id"));
    todoRepository.save(new Todo("Finish the time of creation", true, true));
    todoRepository.save(new Todo("Do the more information page", true, false));
    assigneeRepository.save(new Assignee("Bela", "bela@bela.com"));
    assigneeRepository.save(new Assignee("Kata", "kata@kata.com"));
  }
}