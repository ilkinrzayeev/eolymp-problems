package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class WaterAndIce {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number > 0 && number <= 1_000_000_000) {
            System.out.println("Water");

        } else if (number >= -1_000_000_000 && number <= 0) {
            System.out.println("Ice");
        }
    }
}
