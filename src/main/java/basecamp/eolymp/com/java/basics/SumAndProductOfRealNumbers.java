package basecamp.eolymp.com.java.basics;

import java.util.Scanner;

public class SumAndProductOfRealNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        double sum = x + y + z;
        double product = x * y * z;

        System.out.printf("%.4f %.4f\n", sum, product);
    }
}
