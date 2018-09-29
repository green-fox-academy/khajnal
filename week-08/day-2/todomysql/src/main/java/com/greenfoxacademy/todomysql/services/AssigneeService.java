package com.greenfoxacademy.todomysql.services;

import com.greenfoxacademy.todomysql.model.Assignee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssigneeService {
  List<Assignee> findAll();

  void deleteById(long id);

  Assignee findById(long id);

  void save(Assignee assignee);
}