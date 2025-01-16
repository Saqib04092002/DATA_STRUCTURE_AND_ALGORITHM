// Stack using ArrayList -->
/*import java.util.ArrayList;
public class StackB {
     static class stack{
        static ArrayList<Integer>list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //Push 
        public static void push(int data){
            list.add(data);
        }
        //Pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // Peek;
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

     }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.print(s.peek()+ " ");
            s.pop();
        }
    }
}*/

// Stack using LinkedList -->
/*import java.util.ArrayList;
public class StackB {
     
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
       

         public static class Stack{
            static Node head = null;
            public static boolean isEmpty(){
                return head == null;
            }
            //Push
            public static void push(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }
            // POP
            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
               int top = head.data;
               head = head.next;
               return top;
            }

            // Peek
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }
        }
    
     public static void main(String[] args) {
        
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}*/

// Stack using Java Framework -->

/*import java.util.*;

public class StackB {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/

// Question 1:
//  Push at the Bottom of the Stack.
/*import java.util.*;
public class StackB{
    
    public static void pushAtBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        pushAtBottom(s,4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
} */

// Question 2 - 
// Reverse a String using a a stack

/*import java.util.*;
public class StackB{
    public static String  reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while(idx < str.length() ){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr); 
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}*/

// Question 3 - 
// Reverse a Stack -
/*import java.util.*;
public class StackB{
    
    public static void pushAtBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        printStack(s);
    }
}*/

/*// Question 4 - Stock span problem
import java.util.*;
public class StackB{
    public static void stockspan(int stock[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1;i<stock.length;i++){
            int currprice = stock[i];
            while(!s.isEmpty() && currprice>stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int [stocks.length];
        stockspan(stocks,span);

        for(int i=0; i<span.length;i++){
            System.out.println(span[i] + " ");
        }
    }
}*/

// Question 5- Next Greater Element
/* The next greater element of some element x in an array is
 the first greater element that is to the right of x in the same array */

/*import java.util.*;

public class StackB {
    public static void main(String[] args) {
        
    int arr[] = { 6, 8, 0, 1, 3 };
    Stack<Integer> s = new Stack<>();
    int nextGreater[] = new int[arr.length];
    
    for(int i = arr.length - 1;i>=0;i--){
        // 1 while -
        while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
            s.pop();
        }
        // 2 If-else -
        if (s.isEmpty()) {
            nextGreater[i] = -1;
        } else {
            nextGreater[i] = arr[s.peek()];
        }
        // 3 push in s
        s.push(i);
    }
    
    for(int i = 0;i<nextGreater.length;i++){
        System.out.print(nextGreater[i] + " ");
    }
    System.out.println();
  }
}*/

// Valid Parentheses ->

/*import java.util.*;

public class StackB {
    public static boolean isvalid(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            
          // Opening
          if(ch == '('||ch =='{'||ch=='['){
            s.push(ch);
          }else{
            // Closing
            if(s.isEmpty()){
                return false;
            }
            if((s.peek() == '('&& ch == ')')||
               (s.peek() == '{'&& ch == '}')
               || (s.peek() == '['&& ch == ']')){
                s.pop();
               }else{
                return false;
               }
          }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println(isvalid(str));
    }
}*/

// Duplicate parentheses ->

/*import java.util.*;

public class StackB {
    public static boolean isduplicateparentheses(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            // closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; // Duplicate
                }else{
                    s.pop(); //opening pair
                }
                
                }
                else{
                    // opening
                    s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(a+b)";
        System.out.println(isduplicateparentheses(str));
    }
}*/

// Max Area in Histogram
// height = [2,1,5,6,2,3]

import java.util.*;

public class StackB {
    public static void maxarea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        // Next smaller right
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next smaller left
        s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Current area : width = nsr[i]-nsl[i]-1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Max area in histogram = " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        maxarea(arr);
    }
}