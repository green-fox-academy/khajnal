package com.greenfoxacademy.springstartfixed;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private long id;
  private String content;
  private static AtomicLong idCounter = new AtomicLong(0);

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public Greeting(String content) {
    this.content = content;
    this.id = idCounter.incrementAndGet();
  }
}