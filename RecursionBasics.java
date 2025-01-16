// Problem 1 - Print number from n to 1 using recursion(decreasing order)
/*public class RecursionBasics {
    public static  void printDec(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
         System.out.print(n +" ");
         printDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}*/

// Problem 2 - Print number from n to 1 using recursion(increasing order)
/*public class RecursionBasics {
    public static void printinc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printinc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printinc(n);
    }
}*/

// Problem 3 - 
// Print factorial of a number n .
/*import java.util.*;
public class RecursionBasics {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        //int n = 5;
        System.out.println(fact(n));
    }
}*/

// Problem 4 - 
// Print sum of first n natural number

/*public class RecursionBasics {
    public static int calcsum(int n){
        if(n==1){
            return 1 ;
        }
        int snm1 = calcsum(n-1) ; 
        int sn = n + snm1;
        return sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcsum(n));
    }
}*/

// Problem 5 - 
// Print Nth fibonacci number

/*public class RecursionBasics {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn   = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n = 50;
        System.out.println(fib(23));
        System.out.println(fib(24));
        System.out.println(fib(25));
        System.out.println(fib(26));
        System.out.println(fib(27));
        System.out.println(fib(28));
        System.out.println(fib(29));
    }
}*/

// Problem 6
// Check if a given array is sortrd or not.

/*public class RecursionBasics{

    public static boolean issorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false; 
        }
        return issorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5};
        System.out.println(issorted(arr,0 ));

    }
}*/

//Problem 7-
// Write a function to find the first occurence of an element in an array

/*public class RecursionBasics{

    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr, 5, 0));
    }
}*/

//Problem 8-
// Write a function to find the last occurence of an element in an array

/*public class RecursionBasics{

    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound = lastOccurence(arr, key, i+1);
        if(isfound == -1 && arr[i] == key ){
            return i;
        }
        return isfound;
        }
       public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurence(arr, 5, 0));
    }
}*/

// Problem 9 - 
// Print x^n using recursion . 
/*public class RecursionBasics{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
       int xnm1 = power(x,n-1);
       int xn  = x*xnm1;
       return xn;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}*/

// Problem 10
// Print x^n in O(logn) using .
/*public class RecursionBasics{
    public static int optimizedpower(int a,int n){
        if(n == 0){
            return 1;
        }
        int halfpower = optimizedpower(a,n/2);
        int halfpowersq = halfpower*halfpower;

        // n is odd
        if(n % 2 != 0 ){
            halfpowersq = a * halfpowersq;

        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(optimizedpower(a, n));
    }
}*/


// Problem 11 

/* Given a "2*n" board and tiles of size "2*1" , count the number of ways to tile the given board using the 2*1 tiles */

/*public class RecursionBasics{
    public static int tilingproblem(int n){  // 
 
        // Base case
          if(n==0||n==1){
            return 1;
          }
        // vertical choice
        int fnm1 = tilingproblem(n-1);
        
        // Horizontal choice
        int fnm2 = tilingproblem(n-2);
        
        int totalways = fnm1+fnm2;
        return totalways;

    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(4));
    }
}*/

// Problem 12 -

// Remove Duplicates in a string.
/*import java.util.*;
public class RecursionBasics{
    public static void removeduplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        if( idx == str.length()){
            System.out.println(newstr);
            return;
        }

        // Kam
        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true){
            removeduplicates(str, idx+1, newstr, map);
        }else{
            map[currchar - 'a'] = true;
            removeduplicates(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeduplicates(str, 0,new StringBuilder(""), new boolean[26]);
    }
}*/

// Problem 13-

/* Given n friends, each one can remain single or can be paired up with some other friends.Each friend can be paired only once .Find out the total number of ways in which friend can remain single or can be paired up.  */

/*public class RecursionBasics{
    public static int friendspairing(int n){
        if(n==0 || n==1){
            return n ;
        }
        // Choice
        // Single
        int fnm1 = friendspairing(n-1);

        // pairing
        int fnm2 = friendspairing(n-2);
        int pairways = (n-1)*fnm2;

        // Total Ways 
        int totalways = fnm1+pairways;
        return totalways;

    }
    public static void main(String[] args) {
       System.out.println(friendspairing(5));
    }
}*/

// problem 14 - Binary String Problems

/* Print all binary string of size N without consecutive ones . */

public class RecursionBasics{
    public static void printBinStrings(int n,int lastplace,String str){
        // base case
         if(n==0){
            System.out.println(str);
            return;
         }
         // kaam
         printBinStrings(n-1, 0, str+"0");
         
         if(lastplace == 0){
            printBinStrings(n-1, 1, str+"1");
         }
    }
    public static void main(String[] args) {
        printBinStrings(5, 0, " ");
    }
}


