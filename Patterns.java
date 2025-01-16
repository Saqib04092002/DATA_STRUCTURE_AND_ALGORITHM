// Q-> Print the pattern
/*
 * 
 * *
 * * *
 * * * *
 */
/*public class Patterns {
    public static void main(String[] args) {
        
        for(int i =1 ;i<=4;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */

// Q-> Print the Pattern
/*
 * * * *
 * * *
 * *
 * 
 */
/*public class Patterns {
    public static void main(String[] args) {
        
        for(int i =1 ;i<=4;i++){
            for(int j = 1;j<=4-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

// print the Pattern
/*
 1
 12
 123
 1234
 */
/*public class Patterns {
    public static void main(String[] args) {
        
        for(int i =1 ;i<=4;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

// Q-> print pattern
/*
 A
 BC
 DEF
 GHIJ
 */
/*public class Patterns {
    public static void main(String[] args) {
        
        int n = 7;
        char ch = 'A';
        for(int i =1 ;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}*/

// Q->Print Hollow Rectangle pattern
/*import java.util.*;
public class Patterns{
    public static void hollowRectanble(int totrow,int totcol){
        for(int i = 1;i<=totrow;i++){
            for(int j = 1;j<=totcol;j++){
                if(i==1 || i==totrow || j==1 || j==totcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of colum");
        int colum = sc.nextInt();
        hollowRectanble(row,colum);
        
    }

}*/

// Q->Print Pattern
/*   *
    **
   ***
  ****  
 */
/*import java.util.*;
public class Patterns{
    public static void Patt(int n){
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n-i;j++){ // -> For Space
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){// -> For Stars
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        Patt(n);
    }
}*/

// Q -> Print Pattern
/*
  12345
  1234
  123
  12
  1
 */
/*import java.util.*;
public class Patterns{
    public static void pattnum(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        pattnum(n);
        
    }
}*/
//Q-> Print Floyds Pattern
/*
 1
 2 3
 4 5 6
 7 8 9 10
 */
/*import java.util.*;
public class Patterns {
    public static void floyds_triangle(int n){
        
        int counter = 1;
        for(int i =1 ;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        floyds_triangle(n);
        
    }
}*/

//Q -> Print 0-1 Tringle
/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */
/*import java.util.*;
public class Patterns{
    public static void Triangle0_1(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
         }
            System.out.println();
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        Triangle0_1(n);
    }
}*/

// Q-> Print Butterfly pattern->
/*import java.util.*;
public class Patterns{
    public static void butterfly(int n){
         // Upper half
         for(int i=1;i<=n;i++){
            //1st part 
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            // Spaces
                int spaces = 2*(n-i);
                for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
                }
            //2nd part
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            //Lower part
            for(int i=n;i>=1;i--){
                //1st part 
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                // Spaces
                    int spaces = 2*(n-i);
                    for(int j=1;j<=spaces;j++){
                        System.out.print(" ");
                    }
                //2nd part
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        butterfly(n);
        
    }
}*/

// Q-> Print Solid Rhombus->
/*import java.util.*;
public class Patterns{
    public static void solid_rhombus(int n){

        // Upper half
        for(int i=1;i<=n;i++){
        //1st part 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        solid_rhombus(n);
        
    }
}*/

// Q-> Print Hollow Rhombus->
/*import java.util.*;
public class Patterns{
    public static void hollow_rhombus(int n){

        // Upper half
        for(int i=1;i<=n;i++){
        //1st part 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        hollow_rhombus(n);
        
    }
}*/

// Print Diamond pattern->
/*
   *
  ***
 *****
*******
*******
 *****
  ***
   *
 */
/*import java.util.*;
public class Patterns{
    public static void Diamond(int n){
        //1st half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
               
            }
            System.out.println();
        }
        // Second half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
               
            }
            System.out.println();
        }
     }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        Diamond(n);
        
    }
}*/

// Q-> Print number Pyramid pattern
/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */

 /*import java.util.*;
public class Patterns{
    public static void number_Pyramid(int n){
        
        //1st half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
                }
            System.out.println();
        }
        
     }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        number_Pyramid(n);
        
    }
}*/

// Q-> Palindromic pattern with number pattern

/*
    1
   212
  32123
 4321321
543214321
 */

/*  import java.util.*;
public class Patterns{
    public static void Palindromic_number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
                
                }
            for(int j=1;j<=i;j++){
                System.out.print(j);
                
                }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        Palindromic_number(n);
        
    }
}*/




