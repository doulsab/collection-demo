package com.dd.demo.collections;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        //1. How to use HashSet ? By Creating object of the class.
        HashSet hsSet = new HashSet();

        hsSet.add(100);
        hsSet.add(500);
        hsSet.add(10);
        hsSet.add(30);
        hsSet.add(60);
        System.out.println("Print the Hash" + hsSet);
        // 2. What data structure will it use to store ? Hashtable
        // 3. What algorithm  will it use  ?
        // Hash function(which is confidential  ex data%10 to store the value to address of hashtable)
        // Combination of data structure and algorithm called Hashing.
        // Default location to store in hashtable is 16
        // To avoid the collision uses double of the memory location when data is filled with 75% of (default location which is 16)
       // Stored in Bucket form

    }
}
