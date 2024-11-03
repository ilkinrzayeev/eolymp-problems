package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class SumAndProduct2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int number = in.nextInt();

        if (number >= 10 && number <= 99) {
            int tenDigit = number / 10;
            int oneDigit = number % 10;

            int sum = tenDigit + oneDigit;
            int product = tenDigit * oneDigit;

            System.out.println(sum + " " + product);

        } else {
            System.out.println("Invalid number");
        }
    }
}
