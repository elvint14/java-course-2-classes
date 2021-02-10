package org.course.oop.lesson24.lesson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExceptionApp {
  public static void main(String[] args) throws IOException {

    // 1. open file
    // 2. do job
    // 3. save file
    // 4. close file

    File file = new File("exceptions.kasjd");

    FileWriter fileWriter = new FileWriter(file);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    bufferedWriter.write("Hello, Java!");
    bufferedWriter.close();
    fileWriter.close();

  }
}
