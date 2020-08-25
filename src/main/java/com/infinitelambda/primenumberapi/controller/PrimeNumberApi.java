package com.infinitelambda.primenumberapi.controller;

import com.infinitelambda.primenumberapi.model.NextPrimeNumber;
import com.infinitelambda.primenumberapi.model.PrimeNumber;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.validation.annotation.Validated;

@OpenAPIDefinition(info = @Info(title = "Article Availability Service", version = "1"))
@Validated
public interface PrimeNumberApi {

  @Operation(
      summary = "Find next prime number.",
      description =
          "Find next prime number bigger that the given. In case of given number is prime then it will be returned")
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "200", description = "Calculation was done successfully."),
        @ApiResponse(responseCode = "500", description = "Internal Server error.")
      })
  NextPrimeNumber nextPrimeNumber(
      @Parameter(
              description = "Find next prime number.",
              schema = @Schema(implementation = Integer.class, defaultValue = "0"))
          Integer number);

  @Operation(
      summary = "Find out if number is prime.",
      description =
          "Check if given number is primer and return true or false depending on the calculation.")
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "200", description = "Calculation was done successfully."),
        @ApiResponse(responseCode = "500", description = "Internal Server error.")
      })
  PrimeNumber checkIfNumberIsPrime(
      @Parameter(
              description = "The number which will be check if it is prime.",
              schema = @Schema(implementation = Integer.class, defaultValue = "0"))
          Integer number);
}
