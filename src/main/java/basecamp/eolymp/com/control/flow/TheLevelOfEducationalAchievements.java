package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class TheLevelOfEducationalAchievements {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();

        if (grade >= 1 && grade <= 3) {
            System.out.println("Initial");
        } else if (grade >= 4 && grade <= 6) {
            System.out.println("Average");
        } else if (grade >= 7 && grade <= 9) {
            System.out.println("Sufficient");
        } else if (grade >= 10 && grade <= 12) {
            System.out.println("Highest");
        }
    }
}
