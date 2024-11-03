package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class DigitsOf3DigitNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = in.nextInt();

        if (number >= 100 && number <= 999) {
            int hundredDigit = number / 100;
            int tenDigit = (number / 10) % 10;
            int oneDigit = number % 10;

            System.out.println(hundredDigit + " " + tenDigit + " " + oneDigit);

        } else {
            System.out.println("Invalid number");
        }
    }
}
