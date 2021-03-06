package stack;

public class Stack {
    private int top = 0;
    private int stackSize;
    private int[] stack;

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        stack = new int[stackSize];
    }

    public void push(int argument) {
        if (top > stackSize) {
            System.out.println("Overflow");
        } else {
            stack[top] = argument;
            top += 1;
            System.out.printf("Pushed Successfully %d\n", argument);
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Underflow");
        } else {
            System.out.printf("Pop successfully %d\n", stack[top - 1]);
            stack[top - 1] = 0;
            top -= 1;
        }
    }

    public void showStack() {
        for (int i = stackSize - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
