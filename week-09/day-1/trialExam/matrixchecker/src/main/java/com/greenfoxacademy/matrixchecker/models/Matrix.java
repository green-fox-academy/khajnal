package com.greenfoxacademy.matrixchecker.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Matrix {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String date;
  String[] matrixNumbers;

  public Matrix() {
  }

  public Matrix(String[] matrixNumbers) {
    this.date = LocalDateTime.now().toString();
    this.matrixNumbers = matrixNumbers;
  }

  public Matrix(String date, String[] matrixNumbers) {
    this.date = date;
    this.matrixNumbers = matrixNumbers;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String[] getMatrixNumbers() {
    return matrixNumbers;
  }

  public void setMatrixNumbers(String[] matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }

}