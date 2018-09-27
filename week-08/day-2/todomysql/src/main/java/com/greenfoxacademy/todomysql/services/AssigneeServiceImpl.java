package com.greenfoxacademy.todomysql.services;

import com.greenfoxacademy.todomysql.model.Assignee;
import com.greenfoxacademy.todomysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService {

  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public List<Assignee> findAll() {
    return assigneeRepository.findAll();
  }

  @Override
  public void deleteById(long id) {
    assigneeRepository.deleteById(id);
  }

  @Override
  public Assignee findById(long id) {
    return assigneeRepository.findById(id);
  }

  @Override
  public void save(Assignee assignee) {
    assigneeRepository.save(assignee);
  }
}