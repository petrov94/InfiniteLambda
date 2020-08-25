package com.infinitelambda.primenumberapi.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.infinitelambda.primenumberapi.model.NextPrimeNumber;
import com.infinitelambda.primenumberapi.model.PrimeNumber;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrimeNumberServiceTest {

  @Autowired PrimeNumberService primeNumberService;
  private final int PRIME_NUMBER = 3;
  private final int NEXT_PRIME_NUMBER = 7;
  private final int NOT_PRIME_NUMBER = 6;

  @Test
  void isPrime() {
    PrimeNumber primeNumber = primeNumberService.isPrime(PRIME_NUMBER);
    assertThat(primeNumber.getNumber()).isEqualTo(PRIME_NUMBER);
    assertThat(primeNumber.isPrime()).isTrue();
  }

  @Test
  void isPrimeOddNumber() {
    PrimeNumber primeNumber = primeNumberService.isPrime(NOT_PRIME_NUMBER);
    assertThat(primeNumber.getNumber()).isEqualTo(NOT_PRIME_NUMBER);
    assertThat(primeNumber.isPrime()).isFalse();
  }

  @Test
  void nextPrimeNumberSame() {
    NextPrimeNumber nextPrimeNumber = primeNumberService.nextPrimeNumber(PRIME_NUMBER);
    assertThat(nextPrimeNumber.getNextNumber()).isEqualTo(PRIME_NUMBER);
    assertThat(nextPrimeNumber.getNumber()).isEqualTo(PRIME_NUMBER);
  }

  @Test
  void nextPrimeNumber() {
    NextPrimeNumber nextPrimeNumber = primeNumberService.nextPrimeNumber(NOT_PRIME_NUMBER);
    assertThat(nextPrimeNumber.getNextNumber()).isEqualTo(NEXT_PRIME_NUMBER);
    assertThat(nextPrimeNumber.getNumber()).isEqualTo(NOT_PRIME_NUMBER);
  }
}
