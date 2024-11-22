package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class NumberOfDivisors {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number > 1000) {
            System.out.println("Invalid Number");
        }
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
