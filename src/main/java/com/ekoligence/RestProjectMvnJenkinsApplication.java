package com.ekoligence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Class RestProjectMvnJenkinsApplication.
 */
@SpringBootApplication
public class RestProjectMvnJenkinsApplication {

  /**
   * Instantiates a new RestProjectMvnJenkinsApplication. protected to prevent instantiation
   */
  private RestProjectMvnJenkinsApplication() {
    // prevents calls from subclass
    throw new AssertionError("Instantiating RestProjectMvnJenkinsApplication class.");
  }

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(final String[] args) {
    SpringApplication.run(RestProjectMvnJenkinsApplication.class, args);
  }

}
