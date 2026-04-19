package com.gla.String;

import java.util.Scanner;

public class NumberFormatDemo {

    static void generateException(String s) {
        int n = Integer.parseInt(s);
        System.out.println(n);
    }

    static void handleException(String s) {
        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        handleException(s);
    }
}
