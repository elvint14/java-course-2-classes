package org.course.part03.lesson26.lesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayApp {
  public static void main(String[] args) {

    int[] arr1 = new int[]{1, 2};
    int[] arr2 = new int[3];
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = arr1[i];
    }
    arr2[2] = 10;

    // lists
    ArrayList<Object> list = new ArrayList<>();
    list.add(1);
    list.add(-10);
    list.add("Elvin");

    System.out.println(list.toString());

    // sets
    HashSet<Object> set = new HashSet<>();
    set.add(1);
    set.add(1);
    set.add(1);
    set.add(2);
    set.add(2);

    System.out.println(set.toString());

    // map: key-value
    // Elvin - 123
    // Eli   - 12345
    HashMap<Object, Object> map = new HashMap<>();
    map.put("name", "Elvin");
    map.put("age", 21);
    map.put("surname", "Taghizade");

    System.out.println(map.toString());

  }
}