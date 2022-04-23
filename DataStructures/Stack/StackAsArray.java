package DataStructures.Stack;

public class StackAsArray {
    static final int MAX_SIZE = 1000;
    private int top;
    private int A[] = new int[MAX_SIZE];

    StackAsArray() {
        top = -1;
    }

    public void push(int x) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow ");
            return;
        }
        A[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println(" Stack is Empty ..");
        }
        return A[top--];
    }

    public int peek() {
        return A[top];
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void printStack() {
        for (int i =0; i<=top;i++) {
            System.out.print(" " + A[i]);
        }
        System.out.println();
    }
}
