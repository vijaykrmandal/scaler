package DataStructures.Stack;
class TestProgram {

    public static void main(String[] args) {
        StackAsLinkedList stack = new StackAsLinkedList();
        stack.push(5);
        stack.push(10);
        stack.push(11);
        stack.printStack();
        System.out.println(stack.pop());
        stack.printStack();
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
                    
}