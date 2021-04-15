package org.course.part01.lesson05.lesson;

public class DataTypeApp {
  public static void main(String[] args) {

    // integer data types:
    byte myByte = 5;       // 1 byte = 8 bit -> [-128, 127] -> 256
    short myShort = 12345; // 2 byte = 16 bit -> [-32768, 32767] -> 65536
    int myInt = -75;       // 4 byte = 32 bit -> [~-2bln, ~2bln] -> 4294967296
    long myLong = 0;       // 8 byte = 64 bit -> ...

    // floating-point data types:
    float myFloat = -3.14F;         //less numbers after point!
    double myDouble = 50.55564841;  //more numbers after point!

    // logical data type:
    boolean isOk = true;
    boolean isFree = false;
    boolean is50Even = true;

    // character data type:
    char myChar = '\u00C4';
    char x = 'a';
    char l = '$';

    String name = "Elvin";
    String surname = "Taghizade";
    String ageStr = "21";


    // data_type  variable_name =  value;
       String     myName        =  "Elvin";
       int        myAge         =  21;
       char       newChar       =  '#';
       long       y             =  5;

    int course_duration = 6;          // declaration-initialization
    System.out.println(course_duration);

    short finger_count;               // declaration
    finger_count = 10;                // initialization
    System.out.println(finger_count);

    int a;      // declaration
    a = 50;     // initialization

    int b = 60; // declaration-initialization
  }
}