/*import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int number = 1;
        int sum = 0 ;
        while(number <= n){
           // System.out.print(number+" ");
            sum = sum+number;
            number++;
           
        }
        System.out.println(sum);
       
    }
}*/



// For loop
/*public class Practice{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

// Reverce of number
/*import java.util.*;
public class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        
        while(number > 0){
            int Lastdigit  = number%10;
            System.out.print(Lastdigit + " ");
            Lastdigit--;
            number = number/10;
        }
        
    }
}*/

/*import java.util.*;
public class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int rev = 0;
        
        while(number > 0){
            int Lastdigit  = number%10;
            rev = (rev*10)+Lastdigit;
            Lastdigit--;
            number = number/10;
        }
        System.out.println(rev);
        
    }
}*/

//DO WHILE LOOP
/*public class Practice{
    public static void main(String[] args) {
        int counter =0;
        do{
            System.out.println("Hello word");
            counter++;
        }while(counter <= 10);
    }
}*/

// Break statement 
/*import java.util.*;
public class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        do{
            System.out.print("Enter the number :");
            int num = sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println(num);

        }while(true);
     }
}*/

// PRIME NUMBER
/*import java.util.*;
public class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num  = sc.nextInt();
        if(num == 2){
            System.out.println("Given number is prime");
        }else{
        boolean isprime = true;
       
        for(int i=2;i<=Math.sqrt(num);i++){
           if(num%i == 0){
            isprime = false;
           }
        }
        if(isprime == true){
            System.out.println("Given number is Prime");
        }else{
            System.out.println("Given number is not prime");
        }
    }
}}*/

/*public class Practice{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

// FUNCTION
/*public class Practice {

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }public static void main(String[] args) {
        printHelloWorld();
    }
}*/
/*import java.util.*;
public class Practice {

    public static int product(int a,int b){
        
        
        int pro = a*b;
        System.out.println("Product of A and B is :"+pro);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int A = sc.nextInt();
        System.out.println("Enter the value of B");
        int B = sc.nextInt();
        product(A,B);
        
    }
}*/

/*import java.util.*;
public class Practice {

    public static int factorial(int n){
        int fact_n=1;
        for(int i=1;i<=n;i++){
         fact_n = fact_n*i;
        
        }
        System.out.println(fact_n);
        return fact_n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        factorial(n);
        }
}*/

// PRINT PRIME NUMBER IN RANGE
/*import java.util.*;
public class Practice{
    public static boolean isprime(int num){
           for(int i=2;i<=Math.sqrt(num);i++){
               if(num%i == 0){
                return false;
               }
            }
            return true;
        
    }
        public static void primeinrange(int n){
        
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
             }
            }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of number");
        int n = sc.nextInt();
        primeinrange(n);

    }
}*/

/*import java.util.*;
public class Practice{
    public static void decTobin(int n){
        int pow =0 ;
        int binnum = 0;
        
        while(n>0){
            int rad = n%2;
            binnum = binnum + (rad*(int)Math.pow(10,pow));
            pow++;
            n = n/2;
           

        }
        System.out.println(binnum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        decTobin(n);
    }
    }*/

/*import java.util.*;
public class Practice{
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phy marks");
        marks[0] = sc.nextInt();
        System.out.println("Enter che marks");
        marks[1] = sc.nextInt();
        System.out.println("Enter maths marks");
        marks[2] = sc.nextInt();
       
        System.out.println("Phy marks = "+marks[0]);
        System.out.println("che marks = "+marks[1]);
        System.out.println("marhs marks = "+marks[2]);
        System.out.println("Length of array = "+ marks.length);
    }
}*/

/*public class Practice{
    public static void update(int marks[],int n){
        n = 10;
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;
        }

    }
    public static void main(String[] args) {
        int marks[] = {99,95,98};
        int n = 5;
        update(marks,n);
        System.out.println(n);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }

    }
}*/
    /*public class Practice{
        public static int linearsearch(String number[],String key){
            for(int i =0;i<number.length;i++){
                if(number[i] == key){
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            String number[] = {"pizza","dosa","samosa","Burger","Momos"};
            String key = "Momos";
            int index = linearsearch(number, key);
            if(index == -1){
                System.out.println("Key is not exist in array");
            }else{
                System.out.println(index);
            }
        }
    }*/


    /*public class Practice{
        public static void Largest_num(int array[]){
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;

            for(int i=0;i<array.length;i++){
                if(largest<array[i]){
                    largest = array[i];
                }
                if(smallest>array[i]){
                    smallest = array[i];
                }

            }
            System.out.println("Largest number : "+largest);
            System.out.println("Smallest number : "+smallest);

        }
        public static void main(String[] args) {
            int array[] = {2,5,4,7,6,8};
            Largest_num(array);
            
        }
    }*/

    /*public class Practice {
      public static int Binary_search(int number[],int key){
        int start = 0;
        int end = number.length - 1;
        
        while(start<=end){
            int middle = (start + end)/2;

            if(number[middle] == key){
                return middle;
            }
             if(key > number[middle]){
                start = middle+1;
            }else{
                end = middle-1;

            }
        }
        return -1;

 }
        public static void main(String[] args) {
            int number[] = {2,3,4,5,6,7,8,9,10};
            int key = 9;
            System.out.println("Index for key is : "+Binary_search(number,key));
        }
    }*/

    /*public class Practice {
        public static void Reverse_Array(int number[]){
          int first = 0 , last=number.length-1;

          while(first < last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
          }
          
   }
          public static void main(String[] args) {
              int number[] = {2,3,4,5,6,7,8,9,10};
              Reverse_Array(number);
              for(int i=0;i<number.length;i++){
                System.out.print(number[i] + " ");
              }
          }
      }*/

      /*public class Practice {
        public static void Pairs_array(int number[]){
            int tp = 0;
          for(int i =0;i<=number.length-1;i++){
            for(int j = i+1;j<=number.length-1;j++){
                System.out.print("("+number[i]+","+number[j]+")");
                tp++;
            }
            
            System.out.println();
          }
          System.out.println("Total number of pairs = "+tp);
          
   }
          public static void main(String[] args) {
              int number[] = {2,3,4,5};
              Pairs_array(number);
              
              }
          }*/

/* public class Practice {
            public static void Pairs_subarray(int number[]){
             for(int i =0;i<number.length-1;i++){
                for(int j = i;j<number.length;j++){
                    for(int k = i;k<=j;k++){
                        System.out.print(number[k] + " ");
                    }
                    System.out.println();
                }
               System.out.println();
              }
              System.out.println();
}
// BRUTE FORCE METHOD
public static void PrintSubarraySum(int number[]){
    int currsum = 0;
    int maxsum = Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++){
        for(int j=i;j<number.length;j++){
            currsum = 0;
            for(int k=i;k<=j;k++){
                currsum += number[k];
            }
            System.out.println(currsum);
            if(maxsum < currsum){
                maxsum = currsum;
            }
         }
    }
    System.out.print("Maximum sum of subarray is = "+maxsum + " ");

    // PREFIX SUM
   }
   public static void PreficSum(int number[]){
    int prefix[] = new int [number.length];
    int currsum = 0;
    int maxsum = Integer.MIN_VALUE;

    prefix[0] = number[0];
    for(int i=1;i<prefix.length;i++){
        prefix[i] = prefix[i-1]+number[i];
    }
    for(int i=0;i<prefix.length;i++){
        for(int j=i;j<prefix.length;j++){
            currsum = i == 0?prefix[j] : prefix[j] - prefix[i-1];
            if(maxsum<currsum){
                maxsum = currsum;
            }
        }
    }
    System.out.println("Maximum sum of subarray = "+ maxsum);
        
   }

   // KADANE'S ALGORITHM
   public static void kadanesum(int number[]){
    int maxsum = Integer.MIN_VALUE;
    int currsum = 0;

    for(int i=0;i<number.length;i++){
        currsum = currsum + number[i];
    
    if(currsum<0){
        currsum = 0;
    }  
    

    maxsum = Math.max(maxsum,currsum);
    }
    
    System.out.println("Maximum sum of subarray = "+maxsum);
    
   }
              public static void main(String[] args) {
                  int number[] = {-2,-3,4,-1,-2,1,5,-3};
                  Pairs_subarray(number);
                  kadanesum(number);
                  
                  }
              }*/


// TRAPPING RAIN WATER

/*public class Practice{
    public static int trapwater(int  height[]){
        int n = height.length;

        int leftmax[] = new int[n];
        leftmax[0] =  height[0];
        for(int i=1;i< n;i++){
            leftmax[i] = Math.max( height[i], leftmax[i-1]);
        }

        int rightmax[] = new int[ n];
        rightmax[ n-1] =  height[ n-1];

        for(int i=n-2;i>=0;i--){
             rightmax[ i] = Math.max(height[i],rightmax[i+1]);
    }
    int trappedwater = 0;
    for(int i=0;i<n;i++){
        int waterlevel = Math.min(leftmax[i],rightmax[i]);
        trappedwater += waterlevel - height[i];

    }
    
    return trappedwater;
}
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
       System.out.println( trapwater(height));
    }
}*/

/*import java.util.*;
public class Practice {
    public static void Largest_Num(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
        }
        System.out.println("Largest number is :"+largest);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length,m = matrix[0].length;
        System.out.println("Enter the value of matrix element");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                matrix[i][j] = sc.nextInt();
            }
        }
        // Output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Largest_Num(matrix);
    }
}
*/
// C++ program for Dijkstra's single source shortest path
// algorithm. The program is for adjacency matrix
// representation of the graph
/*#include <iostream>
using namespace std;
#include <limits.h>
 
// Number of vertices in the graph
#define V 9
 
// A utility function to find the vertex with minimum
// distance value, from the set of vertices not yet included
// in shortest path tree
int minDistance(int dist[], bool sptSet[])
{
 
    // Initialize min value
    int min = INT_MAX, min_index;
 
    for (int v = 0; v < V; v++)
        if (sptSet[v] == false && dist[v] <= min)
            min = dist[v], min_index = v;
 
    return min_index;
}
 
// A utility function to print the constructed distance
// array
void printSolution(int dist[])
{
    cout << "Vertex \t Distance from Source" << endl;
    for (int i = 0; i < V; i++)
        cout << i << " \t\t\t\t" << dist[i] << endl;
}
 
// Function that implements Dijkstra's single source
// shortest path algorithm for a graph represented using
// adjacency matrix representation
void dijkstra(int graph[V][V], int src)
{
    int dist[V]; // The output array.  dist[i] will hold the
                 // shortest
    // distance from src to i
 
    bool sptSet[V]; // sptSet[i] will be true if vertex i is
                    // included in shortest
    // path tree or shortest distance from src to i is
    // finalized
 
    // Initialize all distances as INFINITE and stpSet[] as
    // false
    for (int i = 0; i < V; i++)
        dist[i] = INT_MAX, sptSet[i] = false;
 
    // Distance of source vertex from itself is always 0
    dist[src] = 0;
 
    // Find shortest path for all vertices
    for (int count = 0; count < V - 1; count++) {
        // Pick the minimum distance vertex from the set of
        // vertices not yet processed. u is always equal to
        // src in the first iteration.
        int u = minDistance(dist, sptSet);
 
        // Mark the picked vertex as processed
        sptSet[u] = true;
 
        // Update dist value of the adjacent vertices of the
        // picked vertex.
        for (int v = 0; v < V; v++)
 
            // Update dist[v] only if is not in sptSet,
            // there is an edge from u to v, and total
            // weight of path from src to  v through u is
            // smaller than current value of dist[v]
            if (!sptSet[v] && graph[u][v]
                && dist[u] != INT_MAX
                && dist[u] + graph[u][v] < dist[v])
                dist[v] = dist[u] + graph[u][v];
    }
 
    // print the constructed distance array
    printSolution(dist);
}
 
// driver's code
int main()
{
 
    /* Let us create the example graph discussed above */
    /*int graph[V][V] = { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                        { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                        { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                        { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                        { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                        { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                        { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                        { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                        { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
 
    // Function call
    dijkstra(graph, 0);
 
    return 0;
}*/


/*public class Practice{
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fact_n = n*fnm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}*/

/*public class Practice{
    public static int sum(int n){
        if(n == 0){
            return 0 ;
        }
        int snm1 = sum(n-1);
        int sum1 = n+snm1;
        return sum1;
        
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(sum(n));
    }
}*/

/*import java.util.*;
public class Practice{
    public static int fibonacci(int n){
        //Base
        if(n==0 || n==1){
           return n;
        
        }
        //Recurison
        int fnm1 = fibonacci( n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}*/

/*public class Practice{
    public static int sorted(int arr[],int key , int i){
        //base
        if(arr[arr.length-1]==key){
            return arr.length-1;
        }
            else if(i==arr.length-1){
            return -1 ;
        }
        
        //Recurison
        if(arr[i] == key){
           return i;
           
        }
        return sorted(arr,key, i+1);
      
    

    }
    public static void main(String[] args) {
      
        int arr[] = {1,2,3,4,4};
        System.out.println(sorted(arr, 5,0));
    }
}*/


/*public class Practice{
    public static int lastoccurance(int arr[],int key , int i){
        //base
       if(i==arr.length-1){
        return -1;
       }
        //Recurison
        int isfound = lastoccurance(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
      
    return isfound;

    }
    public static void main(String[] args) {
      
        int arr[] = {1,2,3,5,4,4};
        System.out.println(lastoccurance(arr, 5,0));
    }
}*/

/*public class Practice{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
       int halfpowersq = power(x, n/2)*power(x, n/2);
       // n is odd
       if(n%2!=0){
         halfpowersq = halfpowersq*x;
       }
       return halfpowersq;

    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}*/
/*import java.util.*;
public class Practice{
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        int idx1 = 1;
        int idx2 = 2;

        int max = Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
            max = Math.max(list.get(i),max);
        }
        System.out.println(max);
        swap(list,idx1,idx2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}*/

/*import java.util.*;
public class Practice{
    public static int Storewater(ArrayList<Integer> height){
        int maxwater = 0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                 int ht = Math.min(height.get(i),height.get(j));

                 int wt = j-i;
                 int currwater = ht*wt;

                 maxwater = Math.max(currwater,maxwater);
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(Storewater(height));
        
    }
}*/


/*import java.util.*;
public class Practice{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this. right = null;
        }
    }
    public static Node insertNode(Node root,int val){
        if(root == null){
          root = new Node(val);
          return root;
        }
        if(root.data > val){
           root.left =  insertNode(root.left, val);
        }else{
           root.right =  insertNode(root.right, val);
        }
        return root;
    }

    public static boolean searchBST(Node root,int key){
        if(root == null){
            return false;
        }
         if(root.data == key){
            return true;
        }
        if(root.data>key){
           return searchBST(root.left, key);
        }
        else{
            return searchBST(root.right, key);
        }
       
    }
    public static void inOrder(Node root){
        if(root == null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
   
    public static void main(String[] args) {
        int values[] ={8,5,3,1,4,6,10,11,14};

        Node root = null;
        for(int i = 0;i<values.length;i++){
            root = insertNode(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        System.out.println(searchBST(root, 3));
        
      
    }
}*/

/*import java.util.*;
public class Practice{
    static class Node{
        int data;
        Node left ; 
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root == null){
         return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        if(max!=null && root.data>= max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        if(isValidBST(root,null, null)){
            System.out.println("BST is Valide");
        }else{
            System.out.println("BST is inValide");
        }
    }
}*/


/*import java.util.*;
public class Practice{
    static class Node{
        int data;
        Node left ; 
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node invertTree(Node root){
        if(root == null){
            return null;
        }
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        Node temp = left;
        root.left = right;
        root.right = temp;

        return root;
  }
  public static void Inorder(Node root){
    if(root == null){
        return;
    }
    Inorder(root.left);
    System.out.print(root.data+" ");
    Inorder(root.right);
  }
    public static void main(String[] args) {
        Node root = new Node(5);
         root.left = new Node(3);
         root.right = new Node(7);
         root.left.left = new Node(2);
         root.left.right = new Node(4);
         root.right.left = new Node (6);
         root .right.right = new Node(8);
         Inorder(root);
         System.out.println( );
         invertTree(root);
         Inorder(root);
    }
}*/

/*public class Practice{
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Build a BST ->
    public static Node insertNode(Node root,int val){
        if(root == null){
            root =  new Node(val);
            return root;
        }
    
        if(root.data>val){
            root.left = insertNode(root.left, val);
        }else if(root.data < val){
            root.right = insertNode(root.right, val);
        }
        return root;
    }
    
    
    public static Node deleteNode(Node root,int val){
        if(root.data<val){
            root.right = deleteNode(root.right, val);
        }
        else if(root.data>val){
            root.left = deleteNode(root.left, val);
        }else{
        if(root.left==null && root.right == null){
            return null;
        }if(root.left == null){
            return root.right;
        }else if(root.right == null){
            return root.left;
        }
        Node Is = findInorderSuccessor(root.right);
            root.data = Is.data;
            root.right = deleteNode(root.right, Is.data);
        }
        return root;
    }
     
        public static Node findInorderSuccessor(Node root){
            while(root.left != null){
                root = root.left;
            }
            return root;
        }
        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void main(String[] args) {
        int val [] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<val.length;i++){
            root = insertNode(root, val[i]);
        }
        inOrder(root);
        /*Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        deleteNode(root, 11);
        inOrder(root);
            
        }
    }*/

/*import java.util.ArrayList;

public class Practice{
        public static class Node{
            int data;
            Node left,right;
            Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
    
      // Search a Key in BST - 
      public static boolean searchBST(Node root,int key){
        if(root == null){
            return false;
        }
         if(root.data == key){
            return true;
        }
        if(root.data>key){
           return  searchBST(root.left, key);
        }else{
            return searchBST(root.right, key);
        }
      }

      // Delete a Node in BST - 
      public static Node deleteNode(Node root,int val){
        if(root.data>val){
             root.left = deleteNode(root.left, val);
        }else if(root.data < val){
            root.right = deleteNode(root.right, val);
        }else{
            //Case 1 - Leaf Node
            if(root.left == null && root.right == null){
                return null;
            }
            // Case 2 - single child
             if(root.left == null){
                return root.right;
             }else if(root.right == null){
                return root.left;
             }
             // Case 3 - Both children
             Node Is = findInorderSuccessor(root.right);
             root.data = Is.data;
             root.right= deleteNode(root.right, Is.data);
        }
        return root;
      }
      public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
         
            
            public static void inOrder(Node root){
                if(root == null){
                    return;
                }
                inOrder(root.left);
                System.out.print(root.data+" ");
                inOrder(root.right);
            }

            // Print in Range - 
            public static void printInrange(Node root,int k1,int k2){
                if(root == null){
                    return ;
                }
                if(root.data>=k1 && root.data<=k2){
                    printInrange(root.left, k1, k2);
                    System.out.print(root.data+" ");
                    printInrange(root.right, k1, k2);
                }

                else if(root.data<k1){
                    printInrange(root.left, k1, k2);
                }
                else{
                    printInrange(root.right, k1, k2);
                }
              
            }

            public static void printroot2leaf(Node root,ArrayList<Integer>path){
                  if(root == null){
                    return;
                  }
                  path.add(root.data);
                  if(root.left == null && root.right == null){
                    printPath(path);
                  }
                  printroot2leaf(root.left, path);
                  printroot2leaf(root.right, path);
                  path.remove(path.size()-1);
            }
            public static void printPath(ArrayList<Integer>path){
                for(int i=0;i<path.size();i++){
                    System.out.print(path.get(i)+"->");
                }
                System.out.println("Null");
            }
            public static void main(String[] args) {

           
            Node root = new Node(8);
            root.left = new Node(6);
            root.left.left = new Node(5);
            root.left.left.left = new Node(3);
    
            root.right = new Node(10);
            root.right.right = new Node(11);
            root.right.right.right = new Node(12);
            
            System.out.println(searchBST(root, 10));
            deleteNode(root, 3);
            inOrder(root);
            System.out.println();
            printInrange(root, 6, 12);
           
        System.out.println();
            printroot2leaf(root,new ArrayList<>() );
                
            }
        }*/
        
    

        /*import java.util.ArrayList;

        public class Practice{
                public static class Node{
                    int data;
                    Node left,right;
                    Node(int data){
                        this.data = data;
                        this.left = null;
                        this.right = null;
                    }
                }
                public static boolean isValidBST(Node root,Node min,Node max){
                    if(root == null){
                        return true;
                    }
                    if(min != null&&root.data<=min.data){
                        return false;
                    }
                    else if(max != null && root.data>=max.data){
                        return false;
                    }
                    return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
                }

                // Mirror of BST
                public static Node mirrorOfbst(Node root){
                    if(root == null){
                        return null;
                    }
                    Node left = mirrorOfbst(root.left);
                    Node right = mirrorOfbst(root.right);
                    root.left = right;
                    root.right = left;

                    return root;
                }
                public static void inOrder(Node root){
                    if(root == null){
                        return;
                    }
                    inOrder(root.left);
                    System.out.print(root.data+" ");
                    inOrder(root.right);
                }
                // Sorted array to Balanced BST - 
                public static Node createBST(int arr[],int st,int end){
                    if(st>end){
                        return null;
                    }
                    int  mid = (st+end)/2;
                    Node root = new Node(arr[mid]);
                   root.left = createBST(arr, st, mid-1);
                   root.right = createBST(arr, mid+1, end);
                   return root;
                }

                public static void main(String[] args) {
                    Node root = new Node(5);
                    root.left = new Node(3);
                    root.left.left = new Node(2);
                    root.left.right = new Node(4);

                    root.right = new Node(7);
                    root.right.left = new Node(6);
                    root.right.right = new Node(8);

                    if(isValidBST(root, null, null)){
                        System.out.println("Valid BST");
                    }else{
                        System.out.println("Invalid BST");
                    }
                    System.out.println();
                    mirrorOfbst(root);
                    inOrder(root);

                    System.out.println();
                    int arr[] = {1,2,3,4,5,6,7,8,9,10};
                    Node root2 = createBST(arr, 0, arr.length-1);
                    inOrder(root2);
                }
            }        */


            // import java.util.ArrayList;

/*import java.util.ArrayList;

public class Practice{
            public static class Node{
                int data;
                Node left,right;
                Node(int data){
                    this.data = data;
                    this.left = null;
                    this.right = null;
                }
            }
            // Convert BST to Balance BST - 
            public static void getInorder(Node root,ArrayList<Integer>arr){
                if(root == null){
                    return ;
                }
                getInorder(root.left, arr);
                arr.add(root.data);
                getInorder(root.right, arr);
            }
            public static Node createBST(ArrayList<Integer>inorder,int st,int end){
                if(st>end){
                    return null;
                }
                int mid = (st+end)/2;
                Node root = new Node(inorder.get(mid));
                root.left = createBST(inorder, st, mid-1);
                root.right = createBST(inorder, mid+1, end);
                return root;
            }
            public static Node balanceBST(Node root){
                ArrayList<Integer>inorder = new ArrayList<>();
                getInorder(root, inorder);
                root = createBST(inorder, 0, inorder.size()-1);
                return root;
            }
            public static void preOrder(Node root){
                if(root == null){
                    return;
                }
                System.out.print(root.data+" ");
                preOrder(root.left);
                preOrder(root.right);
            }
            public static void main(String[] args) {
                 Node root = new Node(5);
                 root.left = new Node(4);
                 root.left.left = new Node(3);
                 root.left.left.left = new Node(2);

                 root.right = new Node(6);
                 root.right.right = new Node(7);
                 root.right.right.right = new Node(8);
                 Node root2 = balanceBST(root);
                 preOrder(root2);
            }
        }*/

        // Largest size of BST in BT - 
        /*  import java.util.ArrayList;

public class Practice{
            public static class Node{
                int data;
                Node left,right;
                Node(int data){
                    this.data = data;
                    this.left = null;
                    this.right = null;
                }
            }
            public static class Info{
                boolean isBST;
                int size;
                int min;
                int max;
                Info(boolean isBST,int size,int min,int max){
                    this.isBST = isBST;
                    this.size = size;
                    this.min = min;
                    this.max = max;
                }
            }
            public static int maxBST = 0;
            public static Info largestBST(Node root){
                if(root == null){
                    return new Info(true,0, Integer.MAX_VALUE,Integer.MIN_VALUE);
                }
                Info leftInfo = largestBST(root.left);
                Info rightInfo = largestBST(root.right);
                int size = leftInfo.size+rightInfo.size+1;
                int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
                int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));    
                
                if(root.data<=leftInfo.max || root.data>=rightInfo.min){
                    return new Info(false,size , min,max);
                }
                if(leftInfo.isBST && rightInfo.isBST){
                    maxBST = Math.max(maxBST, size);
                    new Info(true, size, min, max);
                }
                return new Info(false,size,min,max);
            }
            public static void main(String[] args) {
                Node root = new Node(50);
                root.left = new Node(30);
                root.left.left = new Node(5);
                root.left.right = new Node(20);

                root.right = new Node(60);
                root.right.left = new Node(45);
                root.right.right = new Node(70);
            }
        }*/

        import java.util.ArrayList;

        /*public class Practice{
                    public static class Node{
                        int data;
                        Node left,right;
                        Node(int data){
                            this.data = data;
                            this.left = null;
                            this.right = null;
                        }
                    }
                    public static class Info{
                        boolean isBST;
                        int size;
                        int min;
                        int max;
                        Info(boolean isBST,int size,int min,int max){
                            this.isBST = isBST;
                            this.size = size;
                            this.min = min;
                            this.max = max;
                        }
                    }
                    public static int maxBST = 0;
                    public static Info largestBST(Node root){
                        if(root == null){
                            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
                        }
                        Info leftinfo = largestBST(root.left);
                        Info rightinfo = largestBST(root.right);
                        int size = leftinfo.size+rightinfo.size+1;
                        int min = Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
                        int max = Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));
                        
                         if(root.data<=leftinfo.max || root.data>=rightinfo.min){
                            return new Info(false,size,min,max);
                         }
                         if(leftinfo.isBST && rightinfo.isBST){
                            maxBST = Math.max(maxBST,size);
                            return new Info(true, size, min, max);
                         }
                         return new Info(false, size, min, max);
                        
                    }
                    public static void main(String[] args) {
                        Node root = new Node(50);
                        root.left = new Node(30);
                        root.left.left = new Node(5);
                        root.left.right = new Node(20);

                        root.right = new Node(60);
                        root.right.left = new Node(45);
                        root.right.right = new Node(70);
                        root.right.right.left = new Node(65);
                        root.right.right.right = new Node(80);

                        largestBST(root);
                        System.out.println("Max size is - "+maxBST);
                    }
                }*/
    
    
               /*  public class Practice{
                    public static class Node{
                        int data;
                        Node left,right;
                        Node(int data){
                            this.data = data;
                            this.left = null;
                            this.right = null;

                        }
                    }
                    public static void getInorder(Node root,ArrayList<Integer>inorder){
                        if(root == null){
                            return;
                        }
                        getInorder(root.left, inorder);
                        inorder.add(root.data);
                        getInorder(root.right, inorder);

                    }

                    public static Node createBST(ArrayList<Integer>arr,int st,int end){
                        if(st>end){
                            return null;
                        }
                        int mid = (st+end)/2;
                        Node root = new Node(arr.get(mid));
                        root.left = createBST(arr, st, mid-1);
                        root.right = createBST(arr,mid+1, end);

                        return root;
                    }

                    public static Node mergeBSTs(Node root1,Node root2){

                        // step 1 - 
                        ArrayList<Integer>arr1 = new ArrayList<>();
                        getInorder(root1, arr1);

                        // step 2 - 
                        ArrayList<Integer>arr2 = new ArrayList<>();
                        getInorder(root2, arr2);

                        // step 3 - 
                        int i=0,j=0;
                        ArrayList<Integer>finalarr = new ArrayList<>();
                        while(i<arr1.size()&&j<arr2.size()){
                            if(arr1.get(i)<=arr2.get(j)){
                                finalarr.add(arr1.get(i));
                                i++;
                            }else{
                                finalarr.add(arr2.get(j));
                                j++;
                            }
                            while(i<arr1.size()){
                                    finalarr.add(arr1.get(i));
                                    i++;
                            }
                            while (j<arr2.size()) {
                                finalarr.add(arr2.get(j));
                                j++;
                                
                            }
                        }
                        return createBST(finalarr, 0, finalarr.size()-1);
                    }
                    public static void preorder(Node root){
                        if(root == null){
                            return;
                        }
                        System.out.print(root.data+" ");
                        preorder(root.left);
                        preorder(root.right);
                    }
                    public static void main(String[] args) {
                        Node root1 = new Node(2);
                        root1.left = new Node(1);
                        root1.right = new Node(4);

                        Node root2 = new Node(9);
                        root2.left = new Node(3);
                        root2.right = new Node(12);

                        Node root = mergeBSTs(root1, root2);
                        preorder(root);
                    }
                }*/
import java.util.*;
                public class Practice{
                    public static class heap{
                       static ArrayList<Integer>arr =new ArrayList<>();
                        public void add(int data){
                            arr.add(data);

                            int x = arr.size()-1;
                            int par = (x-1)/2;

                            while(arr.get(x)<arr.get(par)){
                                int temp = arr.get(x);
                                arr.set(x,arr.get(par));
                                arr.set(par,temp);
                            }
                        }
                    
                    public static boolean isEmpty(){
                        return arr.size() == 0;
                    }
                    public int peek(){
                        return arr.get(0);
                    }

                    public static void heapify(int i){
                        int left = 2*i+1;
                        int right = 2*i+1;
                        int minIdx = i  ;
                    if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
                        minIdx = left;
                    }
                    if(right<arr.size()&&arr.get(minIdx)>arr.get(right)){
                        minIdx = right;
                    }
                    if (minIdx!=i) {
                        int temp = arr.get(i);
                        arr.set(i,arr.get(minIdx));
                        arr.set(minIdx,temp);
                        heapify(minIdx);
                    }
                
                    
                    }
                    public static int remove(){
                        int data = arr.get(0);
                        
                        // step 1 - swip first and last - 
                        int temp = arr.get(0);
                        arr.set(0, arr.get(arr.size()-1));
                        arr.set(arr.size()-1,temp);

                        // 
                        arr.remove(arr.size()-1);

                        heapify(0);
                        return data;
                    }
                }
                 
                    public static void main(String[] args) {
                        heap h = new heap();
                        h.add(1);
                        h.add(2);
                        h.add(3);
                        h.add(4);

                           while (!h.isEmpty()) {
                            System.out.print(h.peek()+" ");
                            h.remove();
                           }
                            
                           }
                    }
                
