package com.infinitelambda.primenumberapi.model;

public class PrimeNumber {

  private final boolean isPrime;
  private final int number;

  public PrimeNumber(boolean isPrime, int number) {
    this.isPrime = isPrime;
    this.number = number;
  }

  public boolean isPrime() {
    return isPrime;
  }

  public int getNumber() {
    return number;
  }
}
