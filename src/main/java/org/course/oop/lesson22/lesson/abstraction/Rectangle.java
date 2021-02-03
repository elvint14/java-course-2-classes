package org.course.oop.lesson22.lesson.abstraction;

public class Rectangle extends Figure {
  private double width;
  private double length;

  public Rectangle(double width, double length) {
    super("Rectangle");
    this.width = width;
    this.length = length;
  }

  @Override
  public double calcArea() {
    // A = width*length;
    return this.width * this.length;
  }

  @Override
  public double calcPerimeter() {
    // P = 2*(width+length)
    return 2 * (this.width + this.length);
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }
}