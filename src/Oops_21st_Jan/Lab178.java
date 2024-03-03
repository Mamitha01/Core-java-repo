package src.Oops_21st_Jan;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

import java.util.List;

public class Lab178 {
    public static void main(String[] args) {

        // Collections Framework
        List fruits = List.of("Orange","Mango","Banana","Apple");
        List shoppingitems =List.of("Milk","Bread","Rice","Wheat");
        List marks =List.of(56,89,66,68,70);
        List datatypes = List.of("Mamitha",true,55);


        System.out.println(fruits.get(0));
        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.indexOf("Mango"));

        //is empty

        System.out.println(fruits.isEmpty());
        //fruits.add("Watermelon");
        //fruits.remove("Apple");

        // java.lang.UnsupportedOperationException -- immutable
        // ArrayList, LinkedList, - Add or Replcae anything - Full Auth

    }
}
