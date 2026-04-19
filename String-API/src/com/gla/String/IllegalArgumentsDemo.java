package com.gla.String;

import java.util.Scanner;

public class IllegalArgumentsDemo {

    static void generateException(String s) {
        System.out.println(s.substring(5, 2));
    }

    static void handleException(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        handleException(s);
    }
}
