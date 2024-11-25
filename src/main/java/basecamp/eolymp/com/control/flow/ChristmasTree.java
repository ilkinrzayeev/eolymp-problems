package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

