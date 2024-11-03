package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class Month {

    // Solution with Array

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int number = in.nextInt();
//
//        String[] months = {
//                "January", "February", "March", "April", "May", "June",
//                "July", "August", "September", "October", "November", "December"
//        };
//        if (number >= 1 && number <= 12) {
//            System.out.println(months[number - 1]);
//        } else {
//            System.out.println("Invalid month number");
//        }
//    }

    // Solution with Switch Operator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) { case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Invalid month"); break;
        }
    }
}
