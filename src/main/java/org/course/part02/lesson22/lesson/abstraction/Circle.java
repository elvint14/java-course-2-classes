package org.course.part02.lesson22.lesson.abstraction;

public class Circle extends Figure {
  private double radius;

  public Circle(double radius) {
    super("Circle");
    this.radius = radius;
  }

  @Override
  public double calcArea() {
    // A = PI * r^2
    return Math.PI * Math.pow(this.radius, 2);
  }

  @Override
  public double calcPerimeter() {
    // P = 2 * PI * r
    return 2 * Math.PI * this.radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return String.format("Circle[radius=%s]", radius);
  }
}