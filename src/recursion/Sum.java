package recursion;

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

}
