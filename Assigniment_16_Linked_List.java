/*
 Question 1 :Intersection of Two Linked Lists 
 In a system there are two singly linked list . By some programming error,the end node of one of the linked lists got 
 linked to the second list , forming an inverted Y-shaped list . Write a program to get the point where two linked
  lists merge.
  We have to find the intersection part in this system.
 */

/*import java.util.LinkedList;

public class Assigniment_16_Linked_List {
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

    public int getsize(Node head) {
        int counter = 0;
        Node curr = head;

        while (curr != null) {
            counter++;
            curr = curr.next;
        }
        return counter;
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        int sizeA = getsize(headA);
        int sizeB = getsize(headB);

        while (sizeA > sizeB) {
            headA = headA.next;
            sizeA--;
        }
        while (sizeA < sizeB) {
            headB = headB.next;
            sizeB--;
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;

        }
        return headA;
    }

    public static void main(String[] args) {
        Assigniment_16_Linked_List ll = new Assigniment_16_Linked_List();
        Node headA, headB;
        headA = new Node(10);
        headB = new Node(3);
        Node newNode = new Node(6);
        headB.next = newNode;

        newNode = new Node(9);
        headB.next.next = newNode;
        newNode = new Node(15);
        headA.next = newNode;
        headB.next.next.next = newNode;
        newNode = new Node(30);
        headA.next.next = newNode;

        headA.next.next.next = null;
        Node intersectionPoint = ll.getIntersectionNode(headA, headB);
        if (intersectionPoint == null) {
            System.out.print(" No Intersection Point \n");
        } else {
            System.out.print("Intersection Point: " + intersectionPoint.data);

        }
    }
}*/

/*
 Question 2 :
 Delete N Nodes After M Nodes of a Linked List
 We have a linked list and two integers M and N.Traverse the linked list such that you retain M nodes the n delete next N nodes , continue the same till end of the 
 linkedlist . 
 Difficulty Level:Rookie.
 Sample Input 1: M=2 N=2    LL: 1->2->3->4->5->6->7->8
 Sample Output 1: 1->2->5->6
 Sample Input 2: M=3 N=2    LL: 1->2->3->4->5->6->7->8->9->10
 Sample Output 2: 1->2->3->6->7->8
 */

/*import java.util.LinkedList;

public class Assigniment_16_Linked_List {
   public static class Node{
       int data;
       Node next;
       public Node(int data){
           this.data= data;
           this.next = null;
       }
   }
   public static Node head;
   public static Node tail;

   public static Node adAthead(Node head,int val){
      
        Node newNode = new Node(val);
        newNode.next = head;


        return newNode;
   }
  public static Node linkedelete(Node head,int M,int N){
   int counter = 1;
   Node curr = head;
   Node reshead = null;
   Node restail = null;
   while(curr!=null){
       if(counter<=M){
           //retain
           if(restail == null){
               reshead = restail = curr;            
           }else{
               restail.next = curr;
               restail = curr;
           }
       }
       if(counter == (M+N)){
           counter = 1;
       }else{
           counter++;
       }
       curr = curr.next;
   }
   restail.next = null;
   return reshead;
  
  }
  public static void main(String[] args) {
   Node head = new Node(100);
   head = adAthead(head,90);
   head = adAthead(head,80);
   head = adAthead(head,70);
   head = adAthead(head,60);
   head = adAthead(head,50);
   head = adAthead(head,40);
   head = adAthead(head,30);
   head = adAthead(head,20);
   head = adAthead(head,10);

   head = linkedelete(head,3,2);
   while(head!=null){
       System.out.print(head.data+"->");
       head = head.next;
   }
  System.out.println("null");
  }
}*/

/*
 Question 3 :
 Swapping Nodes in a Linked List We have a linked list and two keys in it,swap nodes for two given 
 keys. Nodes should be swapped by changing links . Swapping data of nodes maybe expensive in many situations 
 when data contains many fields. 
 It may be assumed that all keys in the linked list are distinct.
 Sample Input 1: 1->2->3->4,  x = 2, y = 4
 Sample Output 1: 1->4->3->2
 */

import java.util.LinkedList;

public class Assigniment_16_Linked_List {
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

    public static void swapNode(int x, int y) {
        if (x == y) {
            return;
        }
        Node preX = null, currX = head;
        while (currX != null || currX.data != x) {
            preX = currX;
            currX = currX.next;
        }
        Node preY = null, currY = head;
        while (currY != null || currY.data != y) {
            preY = currY;
            currY = currY.next;
        }
        if (currX == null || currY == null) {
            return;
        }
        if (preX != null) {
            preX.next = currY;
        } else {
            head = currY;
        }
        if (currY != null) {
            preY.next = currX;
        } else {
            head = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void adLast(int data) {
        // Step 1- Create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - tail next = newNode
        tail.next = newNode; // Link

        // Step 3- tail = newNode
        tail = newNode;
    }

    public static void print() {
        if (head == null) {
            System.out.println("LL is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Assigniment_16_Linked_List llist = new Assigniment_16_Linked_List();
        llist.adLast(1);
        llist.adLast(2);
        llist.adLast(3);
        llist.adLast(4);
        llist.adLast(5);
        llist.adLast(6);
        llist.adLast(7);
        
        llist.print();

        llist.swapNode(4, 3);

        llist.print();
    }
}

/*
 * Question 5 :
 * Merge k Sorted ListsWe have K sorted linked lists of size N each, merge them
 * and print the sorted output.
 * Sample Input 1:k = 2, n = 2
 * l1 = 1->3->NULL
 * l2 = 6->8->NULL
 * l3 = 9->10->NULL
 * Sample Output 1: 1>3->6->8->9->10->NULL
 */

/*
 * import java.util.LinkedList;
 * 
 * public class Assigniment_16_Linked_List {
 * public static class Node{
 * int data;
 * Node next;
 * public Node(int data){
 * this.data= data;
 * this.next = null;
 * }
 * }
 * public static Node head;
 * public static Node tail;
 * 
 * public static void AddFirst(int data){
 * 
 * 
 * Node newNode = new Node(data);
 * if(head == null){
 * head = tail = newNode;
 * }
 * newNode.next = head;
 * head = newNode;
 * }
 * public static void print(){
 * if(head == null){
 * System.out.println("LL is empty");
 * return;
 * }
 * Node temp = head;
 * while(temp != null){
 * System.out.print(temp.data+"-->");
 * temp = temp.next;
 * }
 * System.out.println("null");
 * }
 * 
 * public static Node merge(Node ll1,Node ll2){
 * Node mergell = new Node(-1);
 * Node temp = mergell;
 * while(ll1 != null && ll2 != null){
 * if(ll1.data<=ll2.data){
 * temp.next = ll1;
 * ll1 = ll1.next;
 * temp = temp.next;
 * }else{
 * temp.next=ll2;
 * ll2 = ll2.next;
 * temp = temp.next;
 * }
 * }
 * while(ll1!=null){
 * temp.next = ll1;
 * ll1 = ll1.next;
 * temp = temp.next;
 * 
 * }
 * while(ll2!=null){
 * temp.next = ll2;
 * ll2 = ll2.next;
 * temp = temp.next;
 * 
 * }
 * return mergell;
 * }
 * public static void main(String[] args) {
 * Assigniment_16_Linked_List ll1 = new Assigniment_16_Linked_List();
 * Assigniment_16_Linked_List ll2 = new Assigniment_16_Linked_List();
 * Assigniment_16_Linked_List ll3 = new Assigniment_16_Linked_List();
 * 
 * ll1.AddFirst(3);
 * ll1.AddFirst(1);
 * 
 * ll2.AddFirst(8);
 * ll2.AddFirst(6);
 * 
 * //ll1.print();
 * System.out.println(ll2);
 * }
 * 
 * }
 */