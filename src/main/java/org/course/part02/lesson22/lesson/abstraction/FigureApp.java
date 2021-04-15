package org.course.part02.lesson22.lesson.abstraction;

public class FigureApp {
  public static void main(String[] args) {

    Circle circle = new Circle(10);
    System.out.println(circle.getRadius());
    System.out.println(circle.calcArea());
    System.out.println(circle.calcPerimeter());

    System.out.println("-------------------");

//    Figure figure = new Figure();
//    System.out.println(figure.calcArea());
//    System.out.println(figure.calcPerimeter());

    System.out.println("-------------------");

    AnotherFigure anotherFigure = new AnotherFigure();
    System.out.println(anotherFigure.calcArea());
    System.out.println(anotherFigure.calcPerimeter());

  }
}