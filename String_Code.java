/*import java.util.*;
public class String_Code{

    public static void main(String[] args){
        String str  = new String();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string");
        String nme = sc.nextLine();
        System.out.println(str);
        
    }
}*/

//String are IMMUTABLE

//STRING ARE CONCATENATION

/*import java.util.*;
public class String_Code{

    public static void main(String[] args){
        String str  = "mohd";
        String str2 = "saqib";
         str = str+str2;
         System.out.println(str);        
    }
}*/

// PRINT ALL LETTER OF STRING
/*import java.util.*;
public class String_Code{
    public static void printAllchar(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String[] args){
        String str = "mohd saqib khan";
        
         printAllchar(str);       
    }
}*/

// CHECK IF A STRING IS A PALINDROME OR NOT  --> TC-O(n)
/*import java.util.*;
public class String_Code{
    public static boolean palindrome(String str){
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str = "racecar";
        
         System.out.println(palindrome(str));       
    }
}*/

// CHECK A ROUTE CONTAINING 4 DIRECTIONS (E,W,N,S) FIND THE SHORTEST PATH TO REACH DESTINATION.

/*import java.util.*;
public class String_Code{
    public static float shortest_Des(String str){
        int n = str.length();
        float shortpath;
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
        }
        shortpath = (float)Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));
        return shortpath;
    }

    public static void main(String[] args){
        String str = "WNEENESENNN";
        
         System.out.println(shortest_Des(str));      
    }
}*/

// COMPARISION OF TWO STRING - 
// 1)Compare the value of string using equal function - 

/*public class String_Code{
    public static void main(String[] args) {
        String str1 = "saqib";
        String str2 = "saqib";
        if(str1.equals(str2)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
}*/

// 2) Compare the value of string using compareTo function -

/*public class String_Code{
    public static void main(String[] args) {
        String str[] = {"Mohd","saqib" , "khan"};
        String largest = str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
            largest = str[i];
            }
       }
       System.out.println(largest);
    }
}*/


// SUBSTRING - 
/*public class String_Code{
    public static String  substring(String str,int si,int ei){
        int n = str.length();
        String substring = " ";
        for(int i=si;i<=ei;i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String[] args) {

        String str = "mohd saqib khan";
        int si = 0;
        int ei = 4;
        System.out.println(substring(str,si,ei));
    }
}*/

// STRINGBUILDER -> MUTABLE STRING

/*public class String_Code{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("mohd");
       
        // setCharAt(int,char) - set the character at the given index
         sb.setCharAt(0, 's');

        // insert(int,char) - insert the character at the given index
        sb.insert(0,'m');

        // append(char) - append the character at the end of the string
        sb.append(" saqib");
        System.out.println(sb);
        }
}*/

// PRINT A TO Z USING STRINGBUILDER

/*public class String_Code{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(char i='a';i<='z';i++){
        sb.append(i+" ");
        }
        System.out.print(sb+" "+sb.length());
    }
}*/

// FOR A GIVEN STRING CONVERT EACH THE FIRST LETTER OF EACH WORD TO UPPERCASE
/*public class String_Code{
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            // Convert the first character or the character after a space to uppercase
            if (i == 0 || (str.charAt(i-1 ) == ' ')) {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i)); // Append other characters as-is
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am saqib";
        System.out.println(toUpperCase(str));
    }
}*/