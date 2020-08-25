package com.infinitelambda.primenumberapi.controller;

import com.infinitelambda.primenumberapi.model.NextPrimeNumber;
import com.infinitelambda.primenumberapi.model.PrimeNumber;
import com.infinitelambda.primenumberapi.service.PrimeNumberService;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PrimeNumberController implements PrimeNumberApi {

  private final PrimeNumberService primeNumberService;

  @Autowired
  public PrimeNumberController(PrimeNumberService primeNumberService) {
    this.primeNumberService = primeNumberService;
  }

  @GetMapping(
      value = "/prime/${api.version}/numbers/{number}",
      produces = MediaType.APPLICATION_JSON_VALUE)
  @Override
  public PrimeNumber checkIfNumberIsPrime(@PathVariable Integer number) {
    return primeNumberService.isPrime(number);
  }

  @GetMapping(
      value = "/prime/${api.version}/next/{number}",
      produces = MediaType.APPLICATION_JSON_VALUE)
  @Override
  public NextPrimeNumber nextPrimeNumber(@PathVariable Integer number) {
    return primeNumberService.nextPrimeNumber(number);
  }
}
