package com.dd.demo.collections;


import java.util.LinkedList;

public class LikendListDemo {
    public static void main(String[] args) {
        // uses doubly linked list
        LinkedList ls = new LinkedList();
        ls.add(100);
        ls.add(200);
        ls.add(true);
        ls.add(10.10);
        ls.add(100);
        ls.offer(1000);// if space is there then only
        System.out.println(ls);
    }
}
