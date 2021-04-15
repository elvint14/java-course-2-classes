package org.course.part02.lesson22.lesson.abstraction;

public class AnotherFigure extends Figure{
  public AnotherFigure() {
    super("AnotherFigure");
  }

  @Override
  public double calcArea() {
    return 0;
  }

  @Override
  public double calcPerimeter() {
    return 0;
  }

//  public double getArea() {
//    return 52d;
//  }
//
//  public double getPerimeter() {
//    return 10d;
//  }
}
