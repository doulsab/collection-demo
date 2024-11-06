package com.dd.demo.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // HaspMap is Map based Class which will use Hashtable has internal data structure in key value pair.
        HashMap hm = new HashMap();
        hm.put(1, "DD");
        hm.put(2, "KD");
        hm.put(3, "ED");
        hm.put(4, "RD");
        hm.put(5, "XD");
        // To display the key value pair both using entrySet.
        System.out.println("Key Value pair iteration");
        Set s = hm.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
        // To display the only keys will use keySet.
        System.out.println("Key iteration.");
        Set keySet = hm.keySet();
        Iterator keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) System.out.println(keyIterator.next());
        // to display the only values will use values() method.
        System.out.println("Value iteration.");

        Collection c = hm.values();

        Iterator valueItr = c.iterator();
        while (valueItr.hasNext()) System.out.println(valueItr.next());


    }
}
