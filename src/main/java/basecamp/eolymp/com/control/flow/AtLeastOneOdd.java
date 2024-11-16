package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class AtLeastOneOdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean odd = false;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                odd = true;
                break;
            }
            number /= 10;
        }

        if (odd) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

