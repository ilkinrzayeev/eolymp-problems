package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class OddDivisors {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number > 100000) {
            System.out.println("Invalid number");
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
