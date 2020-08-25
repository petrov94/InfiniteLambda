package com.infinitelambda.primenumberapi.model;

public class NextPrimeNumber {
  private final int number;
  private final int nextNumber;

  public NextPrimeNumber(int number, int nextNumber) {
    this.number = number;
    this.nextNumber = nextNumber;
  }

  public int getNumber() {
    return number;
  }

  public int getNextNumber() {
    return nextNumber;
  }
}
