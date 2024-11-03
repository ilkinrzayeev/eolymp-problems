package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class FirstOrLast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int hundredDigit = number / 100;
        int oneDigit = number % 10;

        if (hundredDigit > oneDigit) {
            System.out.println(hundredDigit);
        } else if (hundredDigit == oneDigit) {
            System.out.println("=");
        } else {
            System.out.println(oneDigit);
        }
    }
}
