package com.dd.demo.collections;

public class TryWithoutCatchDemo {
    public static void main(String[] args) {
        try{
            int result = 10/0;
        }finally {
            System.out.println("This is finally block");
        }
        System.out.println("  this is outside the try scope.");
    }
}
