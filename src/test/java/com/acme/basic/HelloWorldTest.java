package com.acme.basic;

import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    new HelloWorld().sayHello();
  }

  @Test
  public void notCovered() {
    new HelloWorld().notCovered();
  }

  @Test
  public void covered() {
    new HelloWorld().covered();
  }

  @Test
  public void sayhi() {
    new HelloWorld().sayHi();
  }
}
