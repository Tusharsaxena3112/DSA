package stack;

public class Stack {
    private int top = 0;
    private int stackSize;
    private int[] stack = new int[stackSize];

    public Stack(int stackSize) {
        this.stackSize = stackSize;
    }

    public void push(int argument) {
        if (top > stackSize) {
            System.out.println("Overflow");
        } else {
            stack[top] = argument;
            top += 1;
            System.out.println("Pushed Successfully");
        }
    }
}
