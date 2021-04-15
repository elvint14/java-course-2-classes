package org.course.part02.lesson23.lesson.inter;

import java.util.Objects;

public abstract class Animal {
  private String name;

  protected Animal(String name) {
    this.name = name;
  }

//  public abstract void foo();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Animal[name='%s']", name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Animal animal = (Animal) o;
    return name.equals(animal.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}