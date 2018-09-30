package com.greenfoxacademy.matrixchecker.services;

import com.greenfoxacademy.matrixchecker.repositories.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MatrixServiceImpl implements MatrixService {

  MatrixRepository matrixRepository;
  String result;

  @Autowired
  public MatrixServiceImpl(MatrixRepository matrixRepository) {
    this.matrixRepository = matrixRepository;
  }


  @Override
  public String[] transformToMatrix(String matrix) {
    String[] splittedMatrix = matrix.split("\n");
    for (int i = 0; i < splittedMatrix.length; i++) {
      splittedMatrix[i] = splittedMatrix[i].replaceAll("[\r,\n]", "");
      splittedMatrix[i] = splittedMatrix[i].replaceAll(" ", "");
    }
    return splittedMatrix;
  }

  @Override
  public boolean checkIfSquare(String[] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      if ((matrix[i].length() != matrix.length)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean checkIfIncreasing(String[] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      String[] splittedLine = matrix[i].split("");
      for (int j = splittedLine.length - 1; j > 0; j--) {
        if (j != 0) {
          if (Integer.parseInt(splittedLine[j]) < Integer.parseInt(splittedLine[j - 1])) {
            return false;
          }
        }
      }
    }
    return true;
  }

  @Override
  public void setResult(String matrix) {
    String[] transformedMatrix = transformToMatrix(matrix);
    if (!checkIfSquare(transformedMatrix)) {
      result = "Not a square matrix. Try it again.";
    } else if (!checkIfIncreasing(transformedMatrix)) {
      result = "Not an increasing matrix. Try it again.";
    } else if (checkIfIncreasing(transformedMatrix) && checkIfSquare(transformedMatrix)) {
      result = "Increasing matrix.";
    }
  }

  @Override
  public String getResult() {
    return result;
  }
}