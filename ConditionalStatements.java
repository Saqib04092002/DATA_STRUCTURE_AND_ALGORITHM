/*import java.util.*;
public class ConditionalStatements {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18) {
            System.out.println("Adult, Drive,");
        }
if (age < 18 && age > 13) {
    System.out.println("Teenager");
}


else{
    System.out.println("Not an adult");
}



    }
} 


//PRINT LAGREST NO. B/W A & B:
public class ConditionalStatements {
    public static void main(String[] args) {
        float A = 19.87f;
        float B = 19.89f;

        if (A > B) 
            System.out.println("A");
        

else 
    System.out.println("B");


    }
} */
// To check the no. is even or odd:
/*import java.util.*;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner fa = new Scanner(System.in);

        System.out.println("Enter the value of n");
int n;
n = fa.nextInt();
if ( n%2 == 0) {
    System.out.println("Even no.");
} else {
    System.out.println("Odd no.");
}

    }
}  */


// To calculate incometex return:

/*public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  your income");
int income = in.nextInt();
if (income < 500000) {
   System.out.println("No tax"); 
}
else if(income >= 500000 && income <= 1000000)
System.out.println("Tax is 20%"+ income * 0.2);


else {
    System.out.println("Tax is 30%"+ income*0.3);
}
    }
} */

//TERNARY OPERATOR:
/*public class ConditionalStatements {
    public static void main(String[] args) {
        int number = 8;
       String type = ((number%2 == 0)) ? "Even" : "Odd";
       System.out.println(type);
    }
} */

//CHECK IF A STUDENT IS FAIL OR PASS?
/*import java.util.*;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks");
        int marks = sc.nextInt();
        String Status = (marks >= 33) ?  "PASS" : "FAIL"; 
   System.out.println(Status);
    }
} */
  
// SWITCH CASE-

/*import java.util.*;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number");
        int number = sc.nextInt();
        switch(number){
            case 1 : System.out.println("Samosa");
            break;
            case 2 : System.out.println("Burger");
            break;
            case 3 : System.out.println("Mango shake");
            default : System.out.println("Wrong number");

        }
    }
}*/
// Calculator using Switch case
/*import java.util.*;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int A = sc.nextInt();
        System.out.println("Enter the value of B");
        int B = sc.nextInt();
        System.out.println("Enter the Operator");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+': System.out.println(A+B);
            break;
            case '-': System.out.println(A-B);
            break;
            case '*': System.out.println(A*B);
            break;
            case '/': System.out.println(A/B);
            break;
            case '%': System.out.println(A%B);
            default : System.out.println("Wrong Operator");

        }
    }
}*/

      




