package org.course.oop.lesson24.lesson;

public class HandlingExceptionFinallyApp {
  public static void main1(String[] args) {
    String name = null;

    try {
      System.out.println(name.charAt(3));         // StringIndexOutOfBoundsException
      System.out.println(name.toUpperCase());     // NullPointerException
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Ad chox qisadir!");
    } catch (NullPointerException e) {
      System.out.println("Ad daxil edilmeyib!");
    } finally {
      System.out.println("Program finished...");
    }

  }

  public static void main(String[] args) {
    String name = "nul";

    try {
      System.out.println(name.charAt(3));         // StringIndexOutOfBoundsException
      System.out.println(name.toUpperCase());     // NullPointerException
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println(e.getMessage());
    }finally {
      System.out.println("Program finished...");
    }
  }

}
