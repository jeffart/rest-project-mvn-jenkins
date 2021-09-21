package com.ekoligence.restprojectmvnjenkins.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ekoligence.restprojectmvnjenkins.domain.Greeting;

/**
 * The Class GreetingController.
 */
@RestController
public class GreetingController {

  /** The Constant template. */
  private static final String template = "Hello, %s!";

  /** The counter. */
  private final AtomicLong counter = new AtomicLong();

  /**
   * Greeting.
   *
   * @param name the first param
   * @return the greeting
   */
  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World Donatien") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }

}
