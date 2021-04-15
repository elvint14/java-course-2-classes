package org.course.part02.lesson22.lesson.abstraction;

public abstract class Figure {
  private String name;

  protected Figure(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract double calcArea();

  public abstract double calcPerimeter();
}