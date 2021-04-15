package org.course.part02.lesson23.lesson.inter;

public class Cat extends Animal implements Runner {
  public Cat(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println("Cat is running...");
  }
}
