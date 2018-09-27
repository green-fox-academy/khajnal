package com.greenfoxacademy.todomysql.repository;

import com.greenfoxacademy.todomysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
