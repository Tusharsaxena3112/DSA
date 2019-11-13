package recursion;

import java.util.Scanner;

public class Sum {
    public int sum(int a) {
        int s = 0;
        if (a == 1) {
            return a;
        } else {
            s = a + sum(a - 1);
            return s;
        }
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();
        System.out.println(sum.sum(number));
    }
}
