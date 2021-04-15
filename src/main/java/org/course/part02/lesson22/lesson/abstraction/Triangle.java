package org.course.part02.lesson22.lesson.abstraction;

public class Triangle extends Figure {
  private double a;
  private double b;
  private double c;

  public Triangle() {
    super("Triangle");
  }

  @Override
  public double calcArea() {
    return 1_000_000d;
  }

  @Override
  public double calcPerimeter() {
    return this.a + this.b + this.c;
  }
}