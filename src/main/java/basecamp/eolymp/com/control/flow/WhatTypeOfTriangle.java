package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class WhatTypeOfTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a == b && b == c) {
            System.out.println(1);
        } else if (a == b || b == c || c == a) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}