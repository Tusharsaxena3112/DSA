package stack;

public class StackExecution {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.pop();
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.push(5);

        stack.showStack();
    }
}
