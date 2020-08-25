package com.infinitelambda.primenumberapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ServletComponentScan
@SpringBootApplication
public class PrimeNumberApp implements WebMvcConfigurer {
  public static void main(String[] args) {
    SpringApplication.run(PrimeNumberApp.class, args);
  }
}
