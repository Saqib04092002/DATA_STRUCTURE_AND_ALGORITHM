/*
 Question 1 :
 Maximum Balanced String Partitions - 
 We have balanced string str of size N with an equal number of L and R , the task is to find a maximum number X , 
 such that a given string can be partitioned in to X balanced substring . A string is called to be balanced if the 
 number of ‘L’s in the string equals the number of ‘R’s.
 Input: “LRRRRLLRLLRL”
 Output: 3
 */
/*import java.util.*;
public class Assigniment_19_Greedy_Approach {
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int n = 12;
        int l = 0;
        int r = 0 ; 
        int ans = 0;

        for(int i=0;i<n;i++){
            if(str.charAt(i) == 'L'){
                l++;
            }else{
                r++;
            }
            if(l==r){
                ans++;
                l=0;
                r=0;
            }
        }
        System.out.println(ans);
    }
}*/


/*
 Question 2 :
 Kth largest odd number in a given range
 We have two variables L and R , indicating a range of integers from L to R inclusive , and a 
 number K , the task is to find Kth largest odd number.If K > number of odd numbers in the range L to R then return 0.
 Sample Input 1: L = -3, R = 3, K = 1
 Sample Output 1: 3
 */

 /*import java.util.*;
public class Assigniment_19_Greedy_Approach {
  public static void main(String[] args) {
    int l = -3;
    int r = 3;
    int x ;
    int ans;
    int k = 1;
    
    
    if(r%2 == 1){
         x = r;
    }else{
       x = r-1;
    }
    ans = x-(k-1)*2;
    if(ans<l){
        System.out.println(0);
    }else{
        System.out.println(ans);
    }
    
  }

}*/


/*
  Question 3 :
  Lexicographically smallest string of length N and sum K
  We have two integers N and K . The task is to print the lexicographically smallest string of length N consisting 
  of lower-case English alphabets such that the sum of the characters of the string equals to K where ‘a’ = 1, ‘b’ = 2, ‘c’ = 3, ..... and ‘z’ = 26.
  Sample Input 1: N = 5, K = 42
  Sample Output 1: aamz
  Sample Input 2: N = 3, K = 25
  Sample Output 2: aaw
 */
/*import java.util.*;
public class Assigniment_19_Greedy_Approach {
    public static void main(String[] args) {
       int n = 5;
       int k = 42;
       int kk = k-n;
       String s = "";
       for(int i=n-1;i>=0;i--){
        if(kk>=25){
            s += 'z';
            kk -= 25;
        }else{
            s += (char)('a'+kk);
            kk -= kk;
        }
       } 
       String ans = "";
       for(int i = n-1;i>=0;i--){
        ans += s.charAt(i);
       }
       System.out.println(ans);
    }
}*/

/*
 Question 4 :
 Best Time to Buy and Sell Stock
 Given an array prices[] of length N , representing the prices of the stocks on different days , the task is to find the maximum profit
 possible for buying and selling the stocks on different days using transactions where at most one transaction is allowed.
 Note: Stock must be bought before being sold.

 Sample Input 1:prices[] = {7, 6, 4, 3, 1}
 Sample Output 1: 0
 Sample Input 2:prices[] = {7, 1, 5, 3, 6, 4]
 Sample Output 2: 5
 */
import java.util.*;
public class Assigniment_19_Greedy_Approach {
    public static int maxprofit(int prices[],int n){
        int buy = prices[0],maxprofit = 0;
        for(int i=1;i<n;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            else if(prices[i]-buy>maxprofit){
                maxprofit = prices[i]-buy;
            }
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,6,4};
        int n = prices.length;
        int max_profit = maxprofit(prices, n);
        System.out.println(max_profit);

    }
}