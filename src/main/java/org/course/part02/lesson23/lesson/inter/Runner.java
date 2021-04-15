package org.course.part02.lesson23.lesson.inter;

public interface Runner {

  default void startRunning() {
    System.out.println("Running started...");
  }

  void run();
}
