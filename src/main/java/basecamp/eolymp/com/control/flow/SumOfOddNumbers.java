package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int d = in.nextInt();

        if (c > 2000000000 && d > 2000000000) {
            System.out.println("Invalid Number");
        }
        int sum = 0;

        for (int i = c; i <= d; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
