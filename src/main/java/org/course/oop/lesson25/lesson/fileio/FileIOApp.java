package org.course.oop.lesson25.lesson.fileio;

import java.io.*;

public class FileIOApp {
  private static final String RESOURCE_PATH = "src/main/java/org/course/oop/lesson25/lesson/fileio/resource";

  public static void main(String[] args) {
    // fayli tap
    // open/create file
    // write into file or read from
    // close (save) file

//    write();
//    try {
//      write2();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    write3();

//    try {
//      read();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    read2();
  }

  private static void read() throws IOException {
    File file = new File(RESOURCE_PATH, "write_try_with_resources.txt");
    FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    try {
      String line = bufferedReader.readLine();
      System.out.println(line);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      bufferedReader.close();
      fileReader.close();
    }
  }

  private static void read2() {
    File file = new File(RESOURCE_PATH, "write_try_with_resources.txt");
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      String line = br.readLine();
      System.out.println(line);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void write() {
    File file = new File(RESOURCE_PATH, "write.txt");
    try {
      FileWriter writer = new FileWriter(file);
      writer.write("Hello, World!");
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void write2() throws IOException {
    File file = new File(RESOURCE_PATH, "write_finally.txt");
    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter(file);
      fileWriter.write("Finally block added...");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fileWriter != null) fileWriter.close();
    }

  }

  private static void write3() {
    File file = new File(RESOURCE_PATH, "write_try_with_resources.txt");
    try (FileWriter fileWriter = new FileWriter(file)) {
      fileWriter.write("try with resources...");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void write4() {
    File file = new File(RESOURCE_PATH, "write_try_with_resources.txt");
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
      bw.write("try with resources...");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}