package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class PositiveAndNegativeNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        boolean condition1 = (a > 0 || b > 0 || c > 0);
        boolean condition2 = (a < 0 || b < 0 || c < 0);

        if (condition1 && condition2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
