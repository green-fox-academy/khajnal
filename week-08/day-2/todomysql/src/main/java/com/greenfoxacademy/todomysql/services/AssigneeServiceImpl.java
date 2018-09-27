package com.greenfoxacademy.todomysql.services;

import com.greenfoxacademy.todomysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AssigneeServiceImpl implements AssigneeService {

  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }
}
