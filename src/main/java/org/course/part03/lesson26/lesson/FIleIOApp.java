package org.course.part03.lesson26.lesson;

import java.io.*;

public class FIleIOApp {
  private static final String BASE_PATH = "src/main/java/org/course/part03/lesson26/file";

  public static void main(String[] args) {
    File file = new File(BASE_PATH, "io.txt");

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
      bw.write("Hello, World!");
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      System.out.println(br.readLine());
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
