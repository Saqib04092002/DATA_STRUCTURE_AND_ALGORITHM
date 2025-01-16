/*public class Linked_list {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // ADD FIRST
    public void adFirst(int data) {
        // Step 1- Create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - newNode next = head
        newNode.next = head; // Link

        // Step 3- head = newNode
        head = newNode;
    }

    // ADD LAST
    public void adLast(int data) {
        // Step 1- Create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - tail next = newNode
        tail.next = newNode; // Link

        // Step 3- tail = newNode
        tail = newNode;
    }

    // Add Node in the Middle of Linkeslist

    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            adFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx - 1 ; temp --> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print a Linked List .
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("->  null");
    }

    // Remove node from first in a Linked list-
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove Node from last in a linked list
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // Prev : i= size-2.
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int SearchNode(int key) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }
    // Search (using Recuration)
    // - Search for a key in a Linked List. Return the position where it is found.
    // If not found return -1. Use Recursive
    
     public int helper(Node head,int key){
     if(head == null){
     return -1;
     }
     if(head.data = key){
     return 0;
     }
     int idx = helper(head.next,key);
     if(idx = -1){
     return -1;
     }
     return idx+1;
     }
     public int recSearch(int key){
     return helper(head,key);
     }
     

    // REVERSE A LINKED LIST(ITERATIVE APPROACH)

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Find and remove Nth node from end (Iterative approach).
    public void deleteNthfromend(int n) {
        // Calculate size :
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    // Check if Linked list is a palindrome
    // 1) Find middleNode.
    // 2) 2nd half reverse.
    // 3) check if 1st half(left) == 2nd half(right)

    // 1) Find middleNode -- Using slow fast approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow; // Slow is my middle Node
    }

    public boolean checkpalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);

        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // step 3- check left or right part
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    

    public static void main(String[] args) {
        Linked_list ll = new Linked_list();

        // ll.adFirst(1);
        // ll.adFirst();
        ll.adLast(1);
        ll.adLast(2);
        ll.adLast(2);
        //ll.adLast(1);
        
         ll.addMiddle(2, 9);
         ll.print();
         
         ll.removeFirst();
         ll.print();
         
         ll.removeLast();
        ll.print();
         
         System.out.println(ll.SearchNode(3));
         System.out.println(ll.size);
         
         
         //System.out.println(ll.recSearch(1));
         ll.print();
         ll.reverse();
         ll.print();
         
        ll.print();
        ll.deleteNthfromend(3);
        ll.print();

        ll.print();
        System.out.println(ll.checkpalindrome());
    }

}*/

//  Detect a loop/cycle in a Linked list exist or nou

/*public class Linked_list {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean isCycle() { // Floyd's cycle finding algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // Cycle exists
            }
        }
        return false; // Cycle doesn't exist
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());

    }
}*/

// Remove a loop / cycle in a Linked list - 

/*  public class Linked_list {
     public static class Node {
         int data;
         Node next;
 
         public Node(int data) {
             this.data = data;
             this.next = null;
         }
     }
 
     public static Node head;
     public static Node tail;
     public static int size;
     public static boolean isCycle() { // Floyd's cycle finding algorithm
     Node slow = head;
     Node fast = head;

     while (fast != null && fast.next != null) {
         slow = slow.next;// +1
         fast = fast.next.next; // +2
         if (slow == fast) {
             return true; // Cycle exists
         }
     }
     return false; // Cycle doesn't exist
 }
 
 public static void removeCycle(){
     // Detect Cycle - 
     Node slow = head;
     Node fast = head;
     boolean cycle = false;
     while(fast != null && fast.next != null){
         slow = slow.next;
         fast = fast.next.next; 
         if(fast == slow){
             cycle = true;
             break;
         }
     }
     if(cycle == false){
         return;
     }
     // Find meeting point -
     slow = head;
     Node prev = null;
     while(slow != fast){
         prev = fast;
         slow = slow.next;
         fast = fast.next;
     }

     // Remove cycle -> last.next = null
     prev.next = null;
 }
 public static void main(String[] args) {
     head = new Node(1);
     Node temp = new Node(2);
     head.next = temp;
     head.next.next = new Node(3);
     head.next.next.next = temp;
     // 1->2->3->1
     System.out.println(isCycle());
     removeCycle();
     System.out.println(isCycle());
 }
}*/

// Linked list using java collection framework - 
/*import java.util.LinkedList;
public class Linked_list{
    public static void main(String[] args) {
        // Create- 
         LinkedList<Integer>ll = new LinkedList<>();
        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}*/

// Merge Sort on a Linked list-
/*import java.util.LinkedList;
public class Linked_list{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static Node size;

    public Node getmid (Node head){
         Node slow = head;
         Node fast = head.next;
         while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; 
         }
         return slow;
    }

    public Node merge(Node head1,Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while(head1 != null && head2 != null ){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            
        }while ((head2 != null)) {
            temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            
        }
     return mergedll;
        
    }
    
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // Find mid
        Node mid = getmid(head);
        // Left & Right Mergesort
        Node righthead = mid.next;
         mid.next= null;
         Node newleft = mergeSort(head);
         Node newright = mergeSort(righthead);

         // merge
         return merge(newleft,newright);

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println(ll);
        ll.head = ll.mergeSort(ll.head);
        System.out.println(ll);

    }
}*/

// Zig - Zag Linked List
/*import java.util.LinkedList;
public class Linked_list{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static Node size;
    
    public static void zigzag(){
        // Find mid
        Node slow = head;
        Node fast = head.next;
        while(fast.next != null && fast != null){
           slow = slow.next;
           fast = fast.next.next;
        }
        Node mid = slow;
        // Reverse second half - 
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        // Alt merge - Zig-Zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    } 
   // Print a Linked List .
   public void print() {
    if (head == null) {
        System.out.println("LL is empty");
        return;
    }
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + "-->");
        temp = temp.next;
    }
    System.out.println("->  null");
}
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
      
        System.out.println(ll);
        zigzag();
    }
}*/


// DOUBLE LINKED LIST 
