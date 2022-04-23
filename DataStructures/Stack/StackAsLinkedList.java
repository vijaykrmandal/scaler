package DataStructures.Stack;

public class StackAsLinkedList {
    private StackNode head;

    private class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            next = null;
        }
    }

    StackAsLinkedList() {
        head = null;
    }

    public void push(int x) {
        StackNode new_node = new StackNode(x);
        new_node.next = head;
        head = new_node;
    }

    public int pop() {
        int popped = Integer.MAX_VALUE;

        if(head == null){
            System.out.println("Stack is Empty");
        }
        StackNode temp_node = head;
        popped = head.data;
        head = temp_node.next;
        return popped;
    }

    public int peek() {
        return head.data;
    }

    public boolean isEmpty() {
        if(head == null) return true;
        else return false;
    }

    public void printStack() {
        StackNode t_node = head;
        while (t_node != null) {
            System.out.print(t_node.data + " -> ");
            t_node = t_node.next;
        }
        System.out.println();
    }
}
