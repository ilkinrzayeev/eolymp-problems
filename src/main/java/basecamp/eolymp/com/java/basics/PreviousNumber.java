package basecamp.eolymp.com.java.basics;

import java.util.Scanner;

public class PreviousNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();

        System.out.println(number - 1);
    }
}
