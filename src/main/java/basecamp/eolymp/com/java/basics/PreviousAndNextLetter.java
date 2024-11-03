package basecamp.eolymp.com.java.basics;

import java.util.Scanner;

public class PreviousAndNextLetter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char I = in.next().charAt(0);

        char previous = (char) (I - 1);
        char next = (char) (I + 1);

        System.out.println(previous + " " + next);
    }
}
