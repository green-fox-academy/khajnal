package com.greenfoxacademy.todomysql.services;

import com.greenfoxacademy.todomysql.model.Assignee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AssigneeService {
  List<Assignee> findAll();
}
