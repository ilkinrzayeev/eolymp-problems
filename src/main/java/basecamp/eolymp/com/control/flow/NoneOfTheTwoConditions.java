package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class NoneOfTheTwoConditions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        boolean condition1 = (number % 2 == 0 && number > 0);
        boolean condition2 = (number % 2 != 0 && number < 0);

        if (!condition1 && !condition2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
