package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class MinimumAndMaximum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        if (a > 1_000_000_000 || b > 1_000_000_000) {
            System.out.println("Invalid Number");
        } else {
            if (a > b) {
                System.out.println(a + " " + b);
            } else {
                System.out.println(b + " " + a);
            }
        }
    }
}
