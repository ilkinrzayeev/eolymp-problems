package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class SumOfSquaresOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int number = in.nextInt();

        if (number >= 1000 && number <= 9999) {
            int sumOfSquares = 0;

            while (number > 0) {
                int digit = number % 10;
                sumOfSquares += digit * digit;
                number /= 10;
            }

            System.out.println(sumOfSquares);

        } else {
            System.out.println("Invalid number");
        }
    }
}
