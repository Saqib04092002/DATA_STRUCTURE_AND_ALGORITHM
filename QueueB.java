// Queue using Array
/*public class QueueB {

    static class Queue{
    static int arr[];
    static int size;
    static int rear;

    Queue(int n){
        arr = new int[n];
        size = n;
        rear = -1;
    }
    public static boolean isEmpty(){
        return rear == -1;
        }

        // Add 
        public static void add(int data){
            if(rear == size-1){
              System.out.println("Queue is full");
              return;
            }
            rear = rear+1;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
        }
        return arr[0];
    }
}
public static void main(String[] args) {
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);

    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
  }
}*/
    

// Circular Queue - 
/* public class QueueB {

    static class Queue{
    static int arr[];
    static int size;
    static int rear;
    static int front;

    Queue(int n){
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }
    public static boolean isEmpty(){
        return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        // Add 
        public static void add(int data){
            if(isFull()){
              System.out.println("Queue is full");
              return;
            }
            // Add 1st Element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }
        // Remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
        }
        return arr[front];
    }
}
public static void main(String[] args) {
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    System.out.println(q.remove());
    
    q.add(4);
    System.out.println(q.remove());
    q.add(5);

    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
  }
}*/

// Queue using Linked List - 
/*public class QueueB {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty(){
        return head == null & tail == null;
        }
        // Add 
        public static void add(int data){
           Node newNode = new Node(data);
            // Add 1st Element
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
           
        }
        // Remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            // Single element in queue
            if(head == tail){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
        }
        return head.data;
    }
}
public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    

    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
  }
}*/


// Queue using Javaframe work - 
/*import java.util.*;
public class QueueB {
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/


// Question - Queue using 2 stacks - important
// 1) push operation - 0(n)
/*import java.security.PublicKey;
import java.util.*;
public class QueueB {

    public static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/



// Question 3 - Stack using 2 Queue -
/*import java.util.*;
public class QueueB {
    public static class stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Empty stack");
                return -1;
            }
            int top = -1;
            // Case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }

            }else{  // Case 2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }

            }
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty stack");
                return -1;
            }
            int top = -1;
            // Case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }

            }else{  // Case 2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }

            }
            return top;

        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/

// Question 4 - First non-repeating Letter in a stream of characters.
/*import java.util.*;
public class QueueB {
    public static void printNonrepeating(String str){
        int freq[] = new int[26];// 'a'-'z'
        Queue<Character> q = new LinkedList<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonrepeating(str);
    }
}*/


// Question 5 - Interleave 2 halves of a queue(Even length).
/*import java.util.*;
public class QueueB {
    public static void interLeave(Queue<Integer> q){
        Queue<Integer>firsthalf = new LinkedList<>();
        int size = q.size();
        
        for(int i=0;i<size/2;i++){
            firsthalf.add(q.remove());
        }
        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        
        interLeave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
            
        }
    }
}*/


// Question 6- Queue Reversal - 
/*import java.util.*;
public class QueueB {
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
         while(!s.isEmpty()){
            q.add(s.pop());
            
         } 
    }
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
            
        }
    }
}*/

//  DEQUE - Double ended queue - 
/*import java.util.*;
public class QueueB {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("First element = "+deque.getFirst());
        System.out.println("Last element = "+deque.getLast());
            
        }
    }*/


// Question 7 - Stack Queue using Deque
/*import java.util.*;
public class QueueB {
    static class stack{
        static Deque<Integer> deque = new LinkedList<>();
        public static void push(int data){
            deque.addLast(data);
         }
         public static int pop(){
            return deque.removeLast();
         }
         public static int peek(){
            return deque.getLast();
         }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Peek = "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}*/


// Queue using Deque
/*import java.util.*;
public class QueueB {
    static class Queue{
        static Deque<Integer> deque = new LinkedList<>();
        public static void add(int data){
            deque.addLast(data);
         }
         public static int remove(){
            return deque.removeFirst();
         }
         public static int peek(){
            return deque.getFirst();
         }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek = "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}*/


// Priority Queue
/*import java.util.*;
public class QueueB {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(-11);
        pq.add(3);

        System.out.println(pq.peek());
    }
}*/

// Maximum or Reversed Priority Queue

/*import java.util.*;
public class QueueB {
    public static void main(String[] args) {
        PriorityQueue<Integer> mpq= new PriorityQueue<Integer>(Collections.reverseOrder());
        mpq.add(5);
        mpq.add(-11);
        mpq.add(3);

        System.out.println(mpq.peek());
        System.out.println(mpq);
        int ele = mpq.poll();
       // System.out.println(ele);
        System.out.println(mpq);
    }
}*/

// Question 
import java.util.*;
public class QueueB {
    public static int lastStoneweight(int stones[]){
        PriorityQueue<Integer> mpq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            mpq.add(stones[i]);
        }
        while(mpq.size()>1){
            int top = mpq.poll();
            int secondtop = mpq.poll();
            int finalstone = top-secondtop;

            if(finalstone != 0){
                mpq.add(finalstone);
            }
        }
        if(mpq.size()>0){
            return mpq.peek();
        }
        return 0;
    }
    public static void main(String[] args) {
        int stones[] = {2,7,4,1,8,1};
        System.out.println(lastStoneweight(stones));
    }
}


























