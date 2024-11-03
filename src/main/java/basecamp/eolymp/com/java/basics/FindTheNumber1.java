package basecamp.eolymp.com.java.basics;

import java.util.Scanner;

public class FindTheNumber1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = in.nextInt();

        int oneDigit = number % 10;
        int tenDigit = number / 10;

        System.out.println(oneDigit + "" + tenDigit);
    }
}
