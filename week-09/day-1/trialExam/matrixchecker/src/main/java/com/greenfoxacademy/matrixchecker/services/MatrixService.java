package com.greenfoxacademy.matrixchecker.services;


public interface MatrixService {

  String[] transformToMatrix(String matrix);

  boolean checkIfSquare(String[] matrix);

  boolean checkIfIncreasing(String[] matrix);

  void setResult(String matrix);

  String getResult();
}