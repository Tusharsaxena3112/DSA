package recursion;

public class Factorial {
    public int factorial(int a) {
        int fact = 1;
        if (a == 0) {
            return 1;
        } else {
            fact = a * factorial(a - 1);
            return fact;
        }
    }
}
