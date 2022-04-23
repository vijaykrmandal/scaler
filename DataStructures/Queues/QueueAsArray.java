package DataStructures.Queues;

public class QueueAsArray {
    static final int MAX_SIZE = 1000;
    private int front;
    private int rear;
    private int arr[] = new int[MAX_SIZE];

    QueueAsArray() {
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (rear == -1 && front == -1)
            return true;
        return false;
    }

    public int front() {
        return arr[front];
    }

    public boolean isFull() {
        if (rear == MAX_SIZE - 1) {
            System.out.println(" Queue is full");
            return true;
        } else
            return false;
    }

    public void push(int data) {
        if (isFull())
            return;
        else if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = rear + 1;
        }
        arr[rear] = data;
    }

    public void pop(){
        if(isEmpty()) {
            System.out.println(" Queue is empty");
            return;
        }
        else if (front == rear){
            front = rear = -1;
        }
        else{
            front = front + 1;
        }

    }
    public void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}
