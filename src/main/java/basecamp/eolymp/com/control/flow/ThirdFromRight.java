package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class ThirdFromRight {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int number = in.nextInt();

        if (number >= 100 && number <= Math.pow(10, 9)) {
            int thirdFromRight = (number / 100) % 10;
            System.out.println(thirdFromRight);

        } else {
            System.out.println("Invalid number");
        }
    }
}
