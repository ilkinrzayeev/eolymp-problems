package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class Ones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        String binary = Integer.toBinaryString(number);

        int countOfOnes = 0;
        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                countOfOnes++;
            }
        }

        System.out.println(countOfOnes);
    }
}
