package org.course.part01.lesson16.lesson;

public class StringConcatenationApp {
  public static void main(String[] args) {

    System.out.println("Elvin " + "Taghizade" + ". I am " + "21");
    String result = "Elvin ".concat("Taghizade").concat(". I am ").concat("21");
    System.out.println(result);

    // StringBuilder - not available multithreading
    StringBuilder builder = new StringBuilder();
    builder.append("Elvin ");
    builder.append("Taghizade");
    builder.append(". I am ");
    builder.append("21");
    System.out.println(builder.toString());

    // StringBuffer - available multithreading
    StringBuffer buffer = new StringBuffer();
    buffer.append("Elvin ");
    buffer.append("Taghizade");
    buffer.append(". I am ");
    buffer.append("21");
    System.out.println(buffer.toString());

    String name = "ABC123";
    char c = name.charAt(3);
    int unicode = c;

    int max = Math.max(10, 11);
    int min = Math.min(10, 11);

    // 10, 11, 12
    int max1 = Math.max(10, 11);
    int max2 = Math.max(max1, 12);
    // Math.max(Math.max(10, 11), 12);

    char dollar = '$';
    int dollarAsInt = (int) dollar; // ASCII
  }
}
