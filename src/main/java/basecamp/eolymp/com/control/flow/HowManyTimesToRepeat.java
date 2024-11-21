package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class HowManyTimesToRepeat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int operations = 0;

        if (number > 2000000000) {
            System.out.println("The number exceeds the maximum allowed limit of 2,000,000,000.");
        }

        while (number > 0) {
            number -= sumOfDigits(number);
            operations++;
        }

        System.out.println(operations);
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
