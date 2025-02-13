import java.util.LinkedList;
public class DoubleLL {
    

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
          }
          newNode.next = head;
          head.prev = newNode;
          head = newNode;
        }

        // Print 
        public void print(){
            Node temp = head;
            while(temp != null){
               System.out.print(temp.data+"<->");
               temp = temp.next;
            }
            System.out.println("null");
        }
    // Remove - removefirst
    public int removeFirst(){
        if(head == null){
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head= tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    // AddLast
    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Reverce a Double Linked List
    public void reversedll(){
        if(head == null){
            head = tail = null;
            return;
        }
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            
            prev = curr;
           curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
         dll.addFirst(3);
         dll.addFirst(2);
         dll.addFirst(1);
         dll.print();
         System.out.println(size);

         dll.removeFirst();
         dll.print();
         System.out.println(size);

         dll.addlast(4);
         dll.print();
         
         dll.reversedll();
         dll.print();
    }
}

// Circular Linked List  

    
