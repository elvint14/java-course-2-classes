package org.course.part02.lesson23.lesson.inter;

public class Dog extends Animal implements Runner {
  public Dog(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return String.format("Dog[name='%s']", super.getName());
  }

  @Override
  public void run() {
    System.out.println("Dog is running...");
  }
}