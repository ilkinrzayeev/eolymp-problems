package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class EvenAndOddNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > 10000 || b > 10000 || c > 10000) {
            System.out.println("Invalid Number");
        } else if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0 || a % 2 == 1 && b % 2 == 1 && c % 2 == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
