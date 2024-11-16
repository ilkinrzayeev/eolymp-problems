package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class EachConditionOfTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if ((number % 3 == 0) && (number % 2 == 0) && (number > 9 && number < 100)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
