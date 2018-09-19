package com.greenfoxacademy.week07day03;

import com.greenfoxacademy.week07day03.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week07day03Application implements CommandLineRunner {

@Autowired
Printer printer;
  public static void main(String[] args) {
    SpringApplication.run(Week07day03Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
  }
}