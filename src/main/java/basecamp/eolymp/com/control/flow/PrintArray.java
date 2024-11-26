package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pieces = in.nextInt();
        int[] numbers = new int[pieces];

        for (int i = 0; i < pieces; i++) {
            numbers[i] = in.nextInt();
        }
        for (int i = 0; i < pieces; i++) {
            System.out.println(numbers[i]);
        }
    }
}
