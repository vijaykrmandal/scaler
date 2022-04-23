package DataStructures.Queues;

public class QueueAsLinkedList<V> {
   /*
    private class Node<V>{
        V data;
        Node<V> next;
        Node(V data){
            this.data = data;
            next = null;
        }
    }
    private Node<V> front;
    private Node<V> rear;
    QueueAsLinkedList(){
        front = rear = null;
    }
    
    public boolean isEmpty() {
        if (rear == null && front == null)
            return true;
        return false;
    }

    public V front() {
        return front.data;
    }

    public void push(V data) {
        Node<V> new_node=new Node<>(data);
        if (isEmpty()) {
            front = new_node;
            rear = new_node;
        } 
            rear.next = new_node;
            rear = new_node;        
    }

    public void pop(){
        if(isEmpty()) {
            System.out.println(" Queue is empty");
            return;
        }
        else if (front == rear){
            front = rear = null;
        }
        else{
            Node<V> temp_node = front; 
            front = temp_node.next;
        }

    }
    public void printQueue() {
        Node<V> t_node = front;
        while (t_node != null) {
            System.out.print(t_node.data + " -> ");
            t_node = t_node.next;
        }
        System.out.println();
    }
    */
}
