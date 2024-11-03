package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class MonthlyAndQuarterly {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();

        if (1 <= month && month <= 3) {
            System.out.println("First");
        } else if (4 <= month && month <= 6) {
            System.out.println("Second");
        } else if (7 <= month && month <= 9) {
            System.out.println("Third");
        } else if (10 <= month && month <= 12) {
            System.out.println("Fourth");
        } else {
            System.out.println("Invalid Month");
        }
    }
}
