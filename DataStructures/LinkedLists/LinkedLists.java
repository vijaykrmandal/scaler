package DataStructures.LinkedLists;

import java.util.HashSet;

class LinkedLists {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node head;
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }

    public void deleteNode(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;
        prev.next = temp.next;
    }
    public void deleteNodeAtPosition(int position){
        if(head==null) return;
        Node temp=head;
        if(position==0){
            head=temp.next;
            return;
        }
        while(position>1){
            --position;
            temp=temp.next;
        }
        if(temp==null|| temp.next==null) return;
        Node next=temp.next.next;
        temp.next=next;
    }
    public void deleteList(){
        head=null;
    }
    public int getCount(){
       /* Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    */
        return getCountRec(head);
    }

    public int getCountRec(Node node){
        if(node==null) return 0;
        return 1+getCountRec(node.next);
    }
    public boolean searchElement(int x){
        Node temp=head;
        while(temp!=null){
            if(temp.data==x){
                return true;
            }
            temp=temp.next;
        }
        return false;

    }
    public int getNth(int index){
        if(head == null) return -1;
        if(index==0) return head.data;
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(count==index){
                return temp.data;
            }
            count++;
            temp=temp.next;
        }    
        return 0;
    }
    public boolean detectLoop(Node node){
        HashSet<Node> s=new HashSet<Node>();
        while(node !=null){
            if(s.contains(node)) return true;
            s.add(node);
            node=node.next;
        }
        return false;
    }
    public int printMiddle(){
        Node slow_ptr=head;
        Node fast_ptr=head;
        while(fast_ptr!=null && fast_ptr.next!=null){
            fast_ptr=fast_ptr.next.next;
            slow_ptr=slow_ptr.next;
        }
        return slow_ptr.data;
    }
    public void printNthFromLast(int pos){
        int length=this.getCount();
        if(length<pos) return;
        Node temp=head;
        int index=length-pos+1;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);

    }
    public void reverseList(){
        Node current=head;
        Node prev=null;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        head=prev;
    }
    public void printList() {
        Node t_node = head;
        while (t_node != null) {
            System.out.print(t_node.data + " -> ");
            t_node = t_node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedLists llist = new LinkedLists();
        llist.push(8);
        llist.push(10);
        llist.push(20);
        llist.printList();
       // llist.head.next.next.next.next = llist.head;
        System.out.println(llist.detectLoop(llist.head));
        llist.append(11);
        llist.append(13);
        llist.push(7);
        llist.printList();
        llist.insertAfter(llist.head.next, 6);
        llist.printList();
        System.out.print("From Last : 3rd : ");llist.printNthFromLast(3);
        System.out.println("Middle : "+ llist.printMiddle());
        System.out.println("Size of List : "+llist.getCount());
        //llist.deleteNodeAtPosition(1);
        //llist.deleteNode(9);
        System.out.println("element present : "+llist.searchElement(30));
        llist.printList();
        System.out.println("reverse list ");
        llist.reverseList();
        llist.printList();        
        System.out.println(llist.getNth(4));

        String A="ab";
        System.out.println(A.hashCode());
    }
}