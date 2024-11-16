package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class AtLeastOneConditionOutOfTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if ((number % 2 != 0) || (number > 99 && number < 1000)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
