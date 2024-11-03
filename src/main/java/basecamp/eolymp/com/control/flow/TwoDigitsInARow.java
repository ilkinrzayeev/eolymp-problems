package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class TwoDigitsInARow {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.next();

        if (number.length() == 4 && number.contains("37") || number.contains("73")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
