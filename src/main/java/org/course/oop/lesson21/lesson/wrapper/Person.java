package org.course.oop.lesson21.lesson.wrapper;

public class Person {
  private String name;
  private Boolean hasCredit;
  private boolean credit;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isHasCredit() {
    return hasCredit;
  }

  public void setHasCredit(boolean hasCredit) {
    this.hasCredit = hasCredit;
  }

  @Override
  public String toString() {
    return String.format("Person[name='%s', hasCredit=%s]", name, hasCredit);
  }
}
