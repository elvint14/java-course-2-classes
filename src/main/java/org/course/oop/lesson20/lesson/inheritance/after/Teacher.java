package org.course.oop.lesson20.lesson.inheritance.after;

public class Teacher extends Human {
  private double salary;

  public Teacher(String name, String surname, int age, double salary) {
    super(name, surname, age);
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return String.format("Teacher[name='%s', surname='%s', age=%d, salary=%s]",
            super.getName(), super.getSurname(), super.getAge(), this.salary);
  }
}
