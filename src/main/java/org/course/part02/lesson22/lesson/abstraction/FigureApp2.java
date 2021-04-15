package org.course.part02.lesson22.lesson.abstraction;

public class FigureApp2 {
  public static void main(String[] args) {

    // Square IS-A Figure
    Figure square = new Square(5);
    Figure circle = new Circle(10);
    Figure rectangle = new Rectangle(5, 15);

    showFigureInfo(square);
    showFigureInfo(circle);
    showFigureInfo(rectangle);

  }

  private static void showFigureInfo(Figure figure) {
    System.out.println(figure.getName());
    System.out.println(figure.calcArea());
    System.out.println(figure.calcPerimeter());
    System.out.println();
  }
}
