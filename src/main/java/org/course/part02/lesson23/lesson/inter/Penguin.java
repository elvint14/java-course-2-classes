package org.course.part02.lesson23.lesson.inter;

public class Penguin extends Animal implements Swim, Runner {
  public Penguin(String name) {
    super(name);
  }
  
  @Override
  public void swim() {
    System.out.println("Penguin swimming...");
  }

  @Override
  public void run() {
    System.out.println("Penguin running...");
  }
}
