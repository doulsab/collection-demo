package com.dd.demo.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet used Datastructure is Balanced Binary Search Tree / Binary Tree
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(60);
        ts.add(70);
        ts.add(30);
        ts.add(400);
        ts.add(80);

        System.out.println(ts.lower(70));// will get the lower value than given value. 60
        System.out.println(ts.ceiling(78));// will get the given value or higher value. 80
        System.out.println(ts.floor(75));// will get the given value or lower value. 70
        System.out.println(ts.higher(80));// will get the lower value than given value. 100
        System.out.println("Printing the Values in b : "+ts.clone());// will shallow copy
        System.out.println("Prints the below value from given header not header value"+ ts.headSet(60)); // [30, 50]
        System.out.println("Prints the above value from given tail including tail"+ ts.tailSet(50)); //[50, 60, 70, 80, 100, 400]
    }

}
