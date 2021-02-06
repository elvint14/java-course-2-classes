package org.course.oop.lesson23.lesson.inter;

public interface Runner {

  default void startRunning() {
    System.out.println("Running started...");
  }

  void run();
}
