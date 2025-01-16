//Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.*;
/*public class ASSIGNMENT_4_ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        float num  = sc.nextFloat();
        String type = (num>=0) ? "positive" : "Negitive";
        System.out.println("Given number is :"+type);
    }
}*/

//Question 2 : Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
/*public class ASSIGNMENT_4_ConditionalStatement {
    public static void main(String[] args) {
        double temp = 103.5;
        if(temp>100){
            System.out.println("I have a fever");
        } else{
            System.out.println("I don't have a fever");
        }
    }
}*/

//Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case
/*public class ASSIGNMENT_4_ConditionalStatement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emnter the number");
        int number = sc.nextInt();
        switch (number){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            break;
            default : System.out.println("Number is wrong");
        }
        
    }
}*/

//Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not.
public class ASSIGNMENT_4_ConditionalStatement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr Year");
        int year = sc.nextInt();
        boolean x = (year % 4 ) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100)==0 && (year % 400) == 0);
        if(x && (y||z)){
            System.out.println(year+("is a leap year"));
        }
        else{
            System.out.println(year+"is not a leap year");
        }
    }
}
