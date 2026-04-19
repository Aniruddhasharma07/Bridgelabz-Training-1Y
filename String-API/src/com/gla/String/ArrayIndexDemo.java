package com.gla.String;

public class ArrayIndexDemo {

    static void generateException() {
        int[] a = new int[5];
        System.out.println(a[10]);
    }

    static void handleException() {
        try {
            int[] a = new int[5];
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}
