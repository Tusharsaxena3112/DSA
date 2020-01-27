package recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int a) {
        int fact = 1;
        if (a == 0 || a == 1) {
            return 1;
        } else {
            fact = a * factorial(a - 1);
            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a no.:");
        int number = scan.nextInt();
        System.out.println(Factorial.factorial(number));
    }
}
