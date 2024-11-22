package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class SumOfIntegersOnTheInterval {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a > 2000000000 && b > 2000000000) {
            System.out.println("Invalid Number");
        }

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
