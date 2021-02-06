package org.course.oop.lesson23.lesson.inter;

public class Whale extends Animal implements Swim{

  public Whale(String name) {
    super(name);
  }

  @Override
  public void swim() {
    System.out.println("Whale swimming...");
  }
}