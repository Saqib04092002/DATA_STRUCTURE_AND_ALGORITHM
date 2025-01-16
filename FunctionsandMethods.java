/*public class FunctionsandMethods {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }
    public static void main(String[] args) {  
        printHelloWorld(); //Function Call
    }
}*/

/*import java.util.Scanner;

public class FunctionsandMethods {
    public static int CalculateSum(int a, int b) { //parameters or formal parameters
       int sum = a + b;
        return sum;
    }
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b); //arguments or actual parameters.
        System.out.println("Sum is: " +sum);
                                                                                                                                                                                                                                                                                                           }
}*/
/*import java.util.*;
public class FunctionsandMethods{
    public static void printHW(){
        System.out.println("Hello Word");
        System.out.println("Hello Word");
        System.out.println("Hello Word");
}
public static int CalculateSum(int a , int b){// parameters of formal parameters
    int sum = a+b;
     return sum;
}

    public static void main(String[] args) {
        //printHW();
        Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b  =  sc.nextInt();
        int sum  = CalculateSum(a,b);//arguments or actual parameters 
        System.out.println("sum is :"+sum);
        
    }
}*/

//  call by value
/*public class FunctionsandMethods{
    public static void swap(int a,int b){
    int empt = a;
    a = b;
    b = empt;
    System.out.println("a = "+a);
    System.out.println("b = "+b);
}

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a,b);
    }
}*/

// Product of a and b:
/*import java.util.*;
public class FunctionsandMethods{
    public static int multiply(int a,int b){
    int Product = a*b;
    return Product;
  }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of a");
        int b = sc.nextInt();
      int Product = multiply(a,b);
      System.out.println(a+"*"+b+"="+Product);
    }
}*/

// Factorial of a number,n:
/*import java.util.Scanner;
public class FunctionsandMethods{
    public static int factorial(int n ){
    int fact=1;
   
    for(int i = 1;i<=n;i++){
        fact = fact*i;
    }
    return fact;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
      System.out.println(factorial(n));
    }                                   
}*/ 

// Binomial coefficient:
/*import java.util.Scanner;
public class FunctionsandMethods{
   
    public static int factorial(int n ){
    int fact=1;
   
    for(int i = 1;i<=n;i++){
        fact = fact*i;
    }
    return fact;
  }
    public static int BinCoeff(int n,int r){
       int fact_n =  factorial(n);
        int fact_r =  factorial(r);
        int fact_nmr = factorial(n-r);
        int BinCoeff = fact_n/(fact_r*fact_nmr);  //nCr = n!/r!(n-r)!
    return BinCoeff;
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
         int n = sc.nextInt();
        System.out.println("Enter the value of r");
         int r = sc.nextInt();
       System.out.println(BinCoeff(n,r));
     }
    }*/

    // Function Overloading using parameters
/*public class Function{
    //Function to calc sum of two number
    public static int sum(int a,int b){
        
        return a+b ;
    }
    public static int sum(int a,int b,int c){
        //Function to calc sum of Three number
        
        return a+b+c;
}
    public static void main(String[] args) {
        System.out.println("Sum of two number:"+sum(5,2));
        System.out.println("Sum of Three number:"+sum(2,5,7));
    }
}*/

// Function Overloading using Data type
/*public class Function{
    //Function to calc sum of two number
    public static int sum(int a,int b){
        
        return a+b ;
    }
    public static float sum(float a,float b){
        //Function to calc sum of Three number
        
        return a+b;
}
    public static void main(String[] args) {
        System.out.println("Sum of two number:"+sum(5,2));
        System.out.println("Sum of Three number:"+sum(5.6f,7.9f));
    }
}*/
// CHECK GIVEN NUMBER IS PRIME OR NOT
/*import java.util.*;
public class FunctionsandMethods{
    public static boolean isprime(int n){
        boolean isprime = true;
        if(n==2){
            System.out.println("Number is prime");
        }else{
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                isprime = false;
            }
        }
    }
    return isprime;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Number is prime :"+isprime(n));
     }
}*/

//Print all prime number in range->
/*import java.util.*;
public class FunctionsandMethods{
    public static boolean isprime(int n){
        boolean isprime = true;
        if(n==2){
            System.out.println("Number is prime");
        }else{
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                isprime = false;
            }
        }
    }
    return isprime;
}
public static void primeInrange(int n){
    for(int i =2;i<=n;i++){
        if(isprime(i)==true){
            System.out.print(i+" ");
        }
    }
}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        primeInrange(n);
      
     }
}*/

// Convert Binary to Decimal

/*public class FunctionsandMethods{
    public static void BinToDec(int binnum){
        int mynum = binnum;
        int pow=0;
        int decnum=0;
        while(binnum>0){
            int lastDig = binnum % 10;
            decnum = decnum+(lastDig*(int)Math.pow(2,pow));
            pow++;
            binnum = binnum/10;

        }
        System.out.println("Decimal"+" "+mynum+"="+decnum);


    }
    public static void main(String[] args) {
        BinToDec(11);
        
    }
}*/

// Convert Decimal to binary->
public class FunctionsandMethods{
    public static void decTobin(int n){
        int mynum = n;
        int pow=0;
        int binnum = 0;
        while(n > 0){
             int rem = n%2;
             binnum = binnum+(rem*(int)Math.pow(10,pow));
             pow++;
            n = n/2;

        }
        System.out.println(mynum+"="+binnum);
    }
    public static void main(String[] args) {
        decTobin(7);
    }
}
