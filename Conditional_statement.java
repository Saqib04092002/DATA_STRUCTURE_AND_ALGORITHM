import java.util.*;
/*public class Conditional_statement {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if(age>=18){
        System.out.println("Adult");
        }
        if(age>13 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("not Adult ");
        }
   }
}*/

//Q->Print the Largest of 2
/*public class Conditional_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int A = sc.nextInt();
        System.out.println("Enter the value of B");
        int B = sc.nextInt();
        if(A>B){
            System.out.println("A is Largest:"+A);
        }
        else{
            System.out.println("B is Largest:"+B);
        }
}
}*/

//Q->Print if a number is Odd or Even
/*public class Conditional_statement {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int num = sc.nextInt();
         if(num%2==0){
            System.out.println("Given number is Even");
         } else{
            System.out.println("Given number is not Even");
         }
    }
}*/

// else if Condition->
/*public class Conditional_statement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int Age = sc.nextInt();
        if(Age>=18){
            System.out.println("Adult");
        }    
        else if(Age>13 && Age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Child");
        }
    }
}*/

// Q-> Income Tax Calculator->
/*public class Conditional_statement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        int tax;
        if(income<=500000){
            tax = 0;
        }
        else if(income>500000 && income<1000000){
            tax = (int)(income*0.2);
        }
        else{
            tax = (int)(income*0.3);
        }
        System.out.println("Your tax is :"+tax);
    }
}*/

// Q-> Print thr largest of 3
/*public class Conditional_statement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int A = sc.nextInt();
        System.out.println("Enter the value of B");
        int B = sc.nextInt();
        System.out.println("Enter the value of C");
        int C = sc.nextInt();
        if(A>B && A>C){
             System.out.println("Largest number is A:"+A);
            }
        else if(B>C){
            System.out.println("Largest number is B"+B);
        }
        else {
            System.out.println("Largest number is C:"+C);
        }
    }
}*/

// Ternary Operator
// variable = condition ? statement 1 : statement 2;
/*public class Conditional_statement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        //Ternary operator
        String type = (num%2==0) ? "even" : "odd";
        System.out.println("Given number is :"+type);
    }
}*/

//Q -> Check if a student will Pass or Fail
/*public class Conditional_statement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student marks");
        int marks = sc.nextInt();
       
        String type = (marks>=33) ? "Pass" : "Fail";
        System.out.println("Student is :"+ type);
    }
}*/

// SWITCH CASE
/*public class Conditional_statement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        switch (number){
            case 1 : System.out.println("Samosa");
            break;
            case 2 : System.out.println("Burger");
            break;
            case 3 : System.out.println("mango shake");
            break;
            default : System.out.println("We realize we are dreaming");
        }
        }
}*/

// Calculator->
public class Conditional_statement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        float A = sc.nextFloat();
        System.out.println("Enter the value of B");
        float B = sc.nextFloat();
        System.out.println("Enter the useing Operator");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+' : System.out.println("Sum of A and B is:"+(A+B));
            break;
            case '-' : System.out.println("Sub of A and B is:"+(A-B));
             break;
            case '*' : System.out.println("Multiplication of A and B is:"+(A*B));
             break;
            case '/' : System.out.println("Dividing of A and B is:"+(A/B));
             break;
            case '%' : System.out.println("Modulo of A and B is:"+(A%B));
             break;
             default : System.out.println("Wrong Operator");
            }
    }
}



 
