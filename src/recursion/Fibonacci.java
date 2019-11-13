package recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no.");
        int number = scanner.nextInt();
        System.out.println(Fibonacci.fibonacci(number));
    }
}
