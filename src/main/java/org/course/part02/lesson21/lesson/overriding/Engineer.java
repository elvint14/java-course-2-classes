package org.course.part02.lesson21.lesson.overriding;

public class Engineer extends Person {

  private String spec;

  public Engineer(String name, String surname, int age, String spec) {
    super(name, surname, age);
    this.spec = spec;
  }

  @Override
  public void goHome() {
    System.out.println("Engineer is going home...");
  }

  @Override
  public String toString() {
    return String.format("Engineer[name='%s', surname='%s', age=%d, spec='%s'}",
            super.getName(), super.getSurname(), super.getAge(), this.spec);
  }
}