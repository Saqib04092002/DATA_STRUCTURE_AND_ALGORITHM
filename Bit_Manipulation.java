// 1) Binary AND operator

/*public class Bit_Manipulation {
    public static void main(String[] args) {
        System.out.println(5&6);
    }
}*/

// 2) Binary OR(|)operator

/*public class Bit_Manipulation {
    public static void main(String[] args) {
        System.out.println(6|5);
    }
}*/

// 3) Binary XOR(^)operator

/*public class Bit_Manipulation {
    public static void main(String[] args) {
        System.out.println(6^5);
    }
}*/

// 4) Binary One Complement(~)operator

/*public class Bit_Manipulation {
    public static void main(String[] args) {
        System.out.println(~5);
    }
}*/

// 5) Binary Left Shift(<<)operator

/*public class Bit_Manipulation {
    public static void main(String[] args) {
        System.out.println(5<<2);
    }
}*/

// 6) Binary Right Shift(<<)operator

/*public class Bit_Manipulation {
    public static void main(String[] args) {
        System.out.println(5>>2);
    }
}*/

// Question - Check if a binary number is even or odd .
/*public class Bit_Manipulation {
    public static void oddOReven(int n){
        int bitmask = 1;
        if((n&bitmask) == 0){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }  
    }
    public static void main(String[] args) {
        int n = 4;
        oddOReven(n);
    }
}*/

// OPERATIONS - 
// 1) Git ith bit of a number n - 
/*public class Bit_Manipulation {
    public static int gitithBit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask )== 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int n = 1000010;
        int i = 2;
        System.out.println(gitithBit(n,i));
    }
}*/

// 2) Set ith bit of a number n - 
/*public class Bit_Manipulation {
    // Function to set the i-th bit of a number
    public static int setithBit(int n, int i) {
        // Create a bitmask with the i-th bit set
        int bitmask = 1 << i;
        // Use the OR operator to set the i-th bit
        return n | bitmask;
    }

    public static void main(String[] args) {
        int n = 31; // Example number in decimal
        int i = 2;  // Set the 2nd bit (zero-based indexing)
        System.out.println(setithBit(n, i));
    }
}*/

// 3)and 4) Clear and update ith bit of a number n -
/*public class Bit_Manipulation {
    public static int setithBit(int n, int i) {
        // Create a bitmask with the i-th bit set
        int bitmask = 1 << i;
        // Use the OR operator to set the i-th bit
        return n | bitmask;
    }
    
    // Function to set the i-th bit of a number
    public static int ClearithBit(int n, int i) {
        // Create a bitmask with the i-th bit set
        int bitmask = ~(1 << i);
        // Use the OR operator to set the i-th bit
        return n & bitmask;
    }
    public static int updateithBit(int n ,int i,int newbit){
       if(newbit == 0){
              return ClearithBit(n,i);
       }else{
                return setithBit(n,i);
       }
    }

    public static void main(String[] args) {
        int n = 10; // Example number in decimal
        int i = 2;  // Set the 2nd bit (zero-based indexing)
        System.out.println(updateithBit(n, i,1));
    }
}*/


// 5) Clear last ibits 
/*public class Bit_Manipulation {
    public static int clearLastIbits(int n,int i){
        int bitmask = ((-1)<<i);
        return n&bitmask;
    }
    public static void main(String[] args) {
        int n = 15;
        int i = 2;
        System.out.println(clearLastIbits(n,i));
    }
}*/


// 6) Clear Range of  bits 
/*public class Bit_Manipulation {
    public static int clearIbitsRange(int n,int i,int j){
        int a = ((~0)<<j+1);
        int b = (1<<i)-1;
        int bitmask =  a|b;
        return n&bitmask;
    }
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int j = 4;
        System.out.println(clearIbitsRange(n,i,j));
    }
}*/



// Question2 - Check if a number is a power of 2 or not . 
/*public class Bit_Manipulation {
    public static boolean isPowerofTwo(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(11));
    }
}*/


//Question 3 - Count Set Bits in a Number. 
/*public class Bit_Manipulation {
    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
           n =  n>>1; 
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(15));
    }
}*/


// Question 4 - Fast Exponentiation .
public class Bit_Manipulation {
    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1) != 0){
                ans = ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
  
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(3, 100 ));
    }
}