package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class ThreeDigitNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int count = 0;

        for (int i = 100; i <= 999; i++) {
            int sumOfDigits = (i / 100) + ((i / 10) % 10) + (i % 10);
            if (sumOfDigits == number) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 100; i <= 999; i++) {
            int sumOfDigits = (i / 100) + ((i / 10) % 10) + (i % 10);
            if (sumOfDigits == number) {
                System.out.println(i);
            }
        }
    }
}
