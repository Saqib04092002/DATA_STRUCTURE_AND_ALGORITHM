
//Question 1 :Write a Java method to compute the averageof three numbers.import java.util.*;
/*import java.util.*;
public class ASSIGNMENT_6_Funct {
    public static int avg(int a,int b,int c){
        int avgr = (a+b+c)/3;
        return avgr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        System.out.println("Average of a,b and c = "+avg(a,b,c));
        }
    }*/
// Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.
/*import java.util.*;
public class ASSIGNMENT_6_Funct{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println("Given number is even :"+isEven((n)));
        
    }
}*/

//Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
//palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.

/*import java.util.Scanner;
public class ASSIGNMENT_6_Funct {
public static boolean isPalindrome(int number) {
int palindrome = number; // copied number into variable
int reverse = 0;
while (palindrome != 0) {
int remainder = palindrome % 10;
reverse = reverse * 10 + remainder;
palindrome = palindrome / 10;
}
if (number == reverse) {
    return true;
    }
    return false;
}
public static void main(String args[]) {
System.out.println("Please Enter a number : ");
Scanner sc = new Scanner(System.in);
int palindrome = sc.nextInt();
if(isPalindrome(palindrome)) {
System.out.println("Number : " + palindrome + " is a palindrome");
} else {
System.out.println("Number : " + palindrome + " is not a palindrome");
   }
  }
}*/

/*Question 4 : READ & CODE EXERCISE
Search about(Google) & use the following methods of the Math class in Java:
a. Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs( )*/

// Question 5->
/*import java.util.*;
public class ASSIGNMENT_6_Funct {
public static int sumDigits(int num){
        int reverse = 0;
        int sum = 0;
        while(num>0){
            int remainder = num%10;
            sum = sum+remainder;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number");
        int num = sc.nextInt();
        System.out.println("sum is :" + sumDigits(num));
    }
        
    }*/
