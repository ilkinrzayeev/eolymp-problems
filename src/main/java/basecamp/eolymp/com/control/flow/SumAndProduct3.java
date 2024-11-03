package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class SumAndProduct3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = in.nextInt();

        if (number >= 100 && number <= 999) {
            int hundredDigit = number / 100;
            int tenDigit = (number % 100) / 10;
            int oneDigit = number % 10;

            int sum = hundredDigit + tenDigit + oneDigit;
            int product = hundredDigit * tenDigit * oneDigit;

            System.out.println(sum + " " + product);

        } else {
            System.out.println("Invalid number");
        }
    }
}
