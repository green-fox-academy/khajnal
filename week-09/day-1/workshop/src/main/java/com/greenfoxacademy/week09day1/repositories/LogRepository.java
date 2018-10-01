package com.greenfoxacademy.week09day1.repositories;

import com.greenfoxacademy.week09day1.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

  List<Log> findAll();
}
