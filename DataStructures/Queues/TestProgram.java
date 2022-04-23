package DataStructures.Queues;
class TestProgram {

    public static void main(String[] args) {
        QueueAsArray q = new QueueAsArray();
        q.push(5);
        q.push(10);
        q.push(11);
        q.printQueue();
        q.pop();
        q.printQueue();
        q.pop();
        System.out.println(q.isEmpty());
        System.out.println(q.front());
        q.pop();
        System.out.println(q.isEmpty());
    }
                    
}