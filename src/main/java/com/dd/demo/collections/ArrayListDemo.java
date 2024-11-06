package com.dd.demo.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10.0);
        arrayList.add(true);
        arrayList.add(null);
        //System.out.println("Array list is : " + arrayList);

//        Iterator itr = arrayList.iterator();
//        while (itr.hasNext()) {
//            System.out.println( "Itr"+ itr.next());
//        }
//
//         ListIterator itrList =  arrayList.listIterator(arrayList.size());
//        while (itrList.hasPrevious()) {
//            System.out.println( "List Itr"+ itrList.previous());
//        }

// Arrays for array (used to handle the operations)
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.stream(arr).max().getAsInt());

        int a = 20;
        Integer b1 = Integer.valueOf(a);//Boxing
        Integer b = a;//Auto boxing
        int c = b1.intValue();//unboxing
        int c1 = b1; // Auto unboxing

    }

}
