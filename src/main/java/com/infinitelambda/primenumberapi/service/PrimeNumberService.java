package com.infinitelambda.primenumberapi.service;

import com.infinitelambda.primenumberapi.model.NextPrimeNumber;
import com.infinitelambda.primenumberapi.model.PrimeNumber;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PrimeNumberService {
  private static final Logger LOGGER = LoggerFactory.getLogger(PrimeNumberService.class);

  public PrimeNumber isPrime(int number) {
    return new PrimeNumber(isNumberPrime(number), number);
  }

  public NextPrimeNumber nextPrimeNumber(int number) {
    if (isNumberPrime(number)) {
      return new NextPrimeNumber(number, number);
    } else {
      return new NextPrimeNumber(number, nextPrime(number));
    }
  }

  private int nextPrime(int number) {
    LOGGER.info("Find next prime number bigger than {}.", number);
    boolean found = false;
    while (!found) {
      if (isNumberPrime(number)) found = true;
      else number++;
    }
    return number;
  }

  private boolean isNumberPrime(int number) {
    LOGGER.info("Check if number {} is prime.", number);
    for (int i = 2; i <= Math.sqrt(number); i += 2) {
      if (number % i == 0) return false;
    }
    return true;
  }
}
