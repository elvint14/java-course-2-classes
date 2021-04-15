package org.course.part02.lesson18.lesson;

public class Masin {
  // attributes - fields:
  String model;
  int door;
  int tier;
  boolean electricSupport;

  public Masin() {

  }

  public Masin(String model, int door, int tier, boolean electricSupport) {
    this.model = model;
    this.door = door;
    this.tier = tier;
    this.electricSupport = electricSupport;
  }

  // functionality - methods:
  void start() {
    System.out.println("Car started...");
  }

  void stop() {
    System.out.println("Car stopped...");
  }

  void turnLeft() {
    System.out.println("Car turns left...");
  }

  void turnRight() {
    System.out.println("Car turns right...");
  }
}
