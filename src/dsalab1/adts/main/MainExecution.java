package dsalab1.adts.main;

import dsalab1.adts.MyArrayAdt;

public class MainExecution {
    public static void main(String[] args) {
        MyArrayAdt mr = new MyArrayAdt(5);
        mr.insert(1);
        mr.insert(2);
        System.out.println(mr.contains(0));
        mr.traverse();

    }
}
