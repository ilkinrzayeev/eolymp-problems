package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class AllDigitsAreEven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.next();

        if (number.length() == 4) {
            boolean allEven = true;

            for (int i = 0; i < number.length(); i++) {
                int digit = number.charAt(i) - '0';

                if (digit % 2 != 0) {
                    allEven = false;
                    break;
                }
            }
            if (allEven) {
                System.out.println("YES");
            } else if (number.charAt(0) == '0') {
                System.out.println("NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}
