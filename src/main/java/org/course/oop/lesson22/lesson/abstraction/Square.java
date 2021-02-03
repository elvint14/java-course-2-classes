package org.course.oop.lesson22.lesson.abstraction;

public class Square extends Figure {
  private double side;

  public Square(double side) {
    super("Square");
    this.side = side;
  }

  @Override
  public double calcArea() {
    // A = side^2;
    return Math.pow(this.side, 2);
  }

  @Override
  public double calcPerimeter() {
    // P = 4*side
    return 4 * this.side;
  }

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }
}