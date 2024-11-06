package com.dd.demo.collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Using ArrayDeque we can construct the Queue and Stack
        // Use add() method to create the Queue
        // Use push() method to create the Stack
        // There are no index

        ArrayDeque fifo = new ArrayDeque();
        fifo.add(222);
        fifo.add(224);
        fifo.add(223);
        //fifo.remove(2);
        fifo.add(225);
        System.out.println(fifo);

        ArrayDeque lifo = new ArrayDeque();
        lifo.push(10);
        lifo.push(20);
        lifo.push(30);
        lifo.push(40);
        lifo.push(50);
        lifo.pop();
        lifo.push(50);
        System.out.println(lifo);
    }
}
