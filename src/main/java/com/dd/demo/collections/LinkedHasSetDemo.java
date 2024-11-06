package com.dd.demo.collections;

import java.util.LinkedHashSet;

public class LinkedHasSetDemo {
    public static void main(String[] args) {
        // To preserve te order of insertion using LinkedHashset instead of Hashset
        // Internal DataStructure is Hashtable
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("Hye ");
        lhs.add("added");
        lhs.add(true);
        lhs.add(null);
        System.out.println(lhs);
         // LinkedHashSet in extends the HashSet Class This means that all properties of HashSet is same to LinkedHashSet.
    }
}
