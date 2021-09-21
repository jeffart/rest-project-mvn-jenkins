package com.ekoligence;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * The Class ServletInitializer.
 */
public class ServletInitializer extends SpringBootServletInitializer {

  /* (non-Javadoc)
   * @see org.springframework.boot.web.servlet.support.SpringBootServletInitializer
   * #configure(org.springframework.boot.builder.SpringApplicationBuilder)
   */
  @Override
  protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
    return application.sources(RestProjectMvnJenkinsApplication.class);
  }

}
