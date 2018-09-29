package com.greenfoxacademy.matrixchecker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matrix {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String date;
  Integer matrixNumbers;

  public Matrix() {
  }

  public Matrix(String date, Integer matrixNumbers) {
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

  public Integer getMatrixNumbers() {
    return matrixNumbers;
  }

  public void setMatrixNumbers(Integer matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }
}
