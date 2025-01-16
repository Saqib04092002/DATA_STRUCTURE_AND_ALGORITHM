//Q --> PRINT HELLO WORD 
/*public class Java_basics{
    public static void main(String[] args) {
        System.out.println("Hello word\n");//ln--> ak line ka space or \n--> aaak line ka space
        System.out.print("Hello word");
    }
}*/
// Q--> PRINT PATTERN
/*public class Java_basics{
    public static void main(String[] args) {
       System.out.println("****");
       System.out.println("***");
       System.out.println("**");
       System.out.println("*");
    }
}*/
// VARIABLES
/*public class Java_basics{
    public static void main(String[] args) {
       int a = 10;
       int b = 5;
       String name= "saqib";
       System.out.println(a);
       System.out.println(b);
       System.out.println(name);
       a = 50;
       System.out.println(a);

        }
}*/
// DATA TYPE IN JAVA
/*public class Java_basics{
    public static void main(String[] args) {
        byte b = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean var = false;
        System.out.println(var);
        int a = 145;
        System.out.println(a);
        short n = 240;
        System.out.println(n);
    }
}*/
//Q--> SUM OF TWO NUMBER
/*public class Java_basics{
    public static void main(String[] args) {
       int a = 10;
       int b = 5;
       int sum = a+b;
       System.out.println(sum);
    }
}*/
// INPUT IN JAVA
/*import java.util.*;
public class Java_basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your name");
        //String input = sc.next();
        //System.out.println(input);

        /*String input = sc.nextLine();
        System.out.println(input);*/

        /*boolean input = sc.nextBoolean();
        System.out.println(input);*/

        /*short input = sc.nextShort();
        System.out.println(input);*/


        /*long input = sc.nextLong();
        System.out.println(input);*/
        // }
//} 

//Q--> PRODUCT OF A AND B
/*import java.util.*;
public class Java_basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        float a = sc.nextFloat();
        System.out.println("Enter the value of B");
        float b = sc.nextFloat();
        float product = a*b;
        System.out.println("Product of A and B is :"+ product);
        
    }
}*/


// AREA OF CIRCLE
/*import java.util.*;
public class Java_basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float r = sc.nextFloat();
        float area = 3.14f*r*r;
        System.out.println("Area of circle is:" + area);
    }
}*/

// TYPE CONVERSION
//   byte->short->int->float->long->double
/*import java.util.*;
public class Java_basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextInt();
        System.out.println(A);
    }
}*/

// TYPE CASTING

/*public class Java_basics{
    public static void main(String[] args) {
        float a = 10.25f;
        int b = (int)a;
        System.out.println(b);
    }
}*/

/*public class Java_basics{
    public static void main(String[] args) {
        int  ch  = 'a';
        int ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
    }
}*/

// TYPE PROMOTION IN EXPRESSION
// 1) Java automatically promotes each byte,short and char operand to int when evaluting an expression
// 2) If one operand is long,floator double the whole expression is promoted to long ,floator double respectively
// Example 1->
/*public class Java_basics{
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        
        System.out.println(b-a);       
    }
} */ 
//Example 2->
public class Java_basics{
    public static void main(String[] args) {
        int a = 10;
        float b = 25.44f;
        double c = 30;
        long d = 25;
        double ans = (a+b+c+d);
        System.out.println(ans);

    }
} 