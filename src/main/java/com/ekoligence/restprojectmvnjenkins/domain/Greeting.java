package com.ekoligence.restprojectmvnjenkins.domain;


/**
 * The Class Greeting.
 */
public class Greeting {

  /** The id. */
  private final long id;

  /** The content. */
  private final String content;

  /**
   * Instantiates a new greeting.
   *
   * @param id      the id
   * @param content the content
   */
  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * Gets the content.
   *
   * @return the content
   */
  public String getContent() {
    return content;
  }

}
