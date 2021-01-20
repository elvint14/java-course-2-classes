package org.course.oop.lesson18.lesson;

public class CarApp {
  public static void main(String[] args) {

    Masin emptyCar = new Masin();
    Masin bmw = new Masin("BMW", 2, 4, false);
    bmw.start();
    bmw.turnLeft();
    System.out.println(bmw.model);
    System.out.println(bmw.door);

    Masin ford = new Masin("Ford", 3, 8, false);
    System.out.println(ford.electricSupport);
    ford.start();
    ford.turnRight();
    ford.stop();

  }
}
