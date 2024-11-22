package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class NFactorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number < 0) {
            System.out.println("Invalid number");
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
