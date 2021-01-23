package org.course.oop.lesson19.hw;

public class UserApp {
  public static void main(String[] args) {

    User eli = new User("eli", "456");
    User elvin = new User("elvin", "123");
    User rovshen = new User("rovshen", "789");

    User[] users = new User[3];
    users[0] = eli;
    users[1] = elvin;
    users[2] = rovshen;

    User[] userArr = new User[]{eli, elvin, rovshen};

  }
}