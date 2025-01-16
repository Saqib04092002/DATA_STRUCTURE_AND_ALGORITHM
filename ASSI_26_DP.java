/*
 Question 1 :
 Tribonacci Numbers
 The Tribonacci series is a generalization of the Fibonacci sequence where each term is the sum of the three preceding terms.
 a(n) = a(n-1) + a(n-2) + a(n-3) with a(0) = a(1) = 0, a(2) = 1
 */

/*import java.util.Arrays;

public class ASSI_26_DP {
public static void tribonacciNum(int n){
    int dp[] = new int[n];
   dp[0] = dp[1] = 0 ;
   dp[2] = 1;
    
   for(int i=3;i<n;i++){
    dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
   }
   for(int i=0;i<n;i++){
    System.out.print(dp[i]+" ");
   }
   }

  public static void main(String[] args) {
    int n = 5;
tribonacciNum(n);
    
    }
}*/

/*
 Question 3 :
 Maximum profit after buying and selling stocks with transaction fees
 We have an array of positive integers containing the price of stocks and transaction fee , the task
  is to find the maximum profit and the difference of days on which you are getting the maximum profit.
 */
/*public class ASSI_26_DP {
    public static int[] maxPro(int[] prices, int fee){
        if(prices == null || prices.length==0){
            return new int[]{0,0};
        }
        int n = prices.length;
        int dp[][] = new int[n][2];

        // Base case
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        int bestBuyDay = 0;
        int bestSellDay = 0;

        for(int i=1;i<n;i++){
            dp[i][0]  = Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1]  = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        int maxprofit = dp[n-1][0];
        int sellday = n-1;

        for(int i=n-1;i>=0;i--){
            if(dp[i][0] == maxprofit){
                sellday = i;
                break;
            }
        }
        int buyday = -1;
        for(int i=sellday;i>=0;i--){
            if(dp[i][1] >= dp[i-1][1]){
                buyday = i;
                break;
            }
        }
        int dayDifference = (buyday != -1)?(sellday-buyday):0;
        return new int[]{maxprofit,dayDifference};
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int transactionFee = 1;
        int[] result = maxPro(prices, transactionFee);
        System.out.println("Maximum Profit:"+result[0]+"Day Difference:"+result[1]);
    }

}*/

/*
 Question 8 :
 Equal Subset Sum Difference(MEDIUM)
 */
/*public class ASSI_26_DP {
    public static boolean targetSum(int[] nums,Boolean[][]dp,int idx,int target){
        if(target == 0) {
            return true;
        }
        if(idx ==nums.length || target<0){
            return false;
        }
         if(dp[idx][target] != null){
            return dp[idx][target];
         }
        boolean yes = targetSum(nums, dp, idx+1, target-nums[idx]);
        boolean no = targetSum(nums, dp, idx+1, target);

        return dp[idx][target]=(yes || no);
    }
    
    public static boolean canPartition(int arr[]){
        int total =0;
    for(int i=0;i<arr.length;i++){
        total+=arr[i];
    }  
        if(total%2==1){
           return false;
        }
        int target = total/2;
        Boolean[][] dp = new Boolean[arr.length+1][target+1];
        return targetSum(arr,dp,0,target);
        
    
       
    }
public static void main(String[] args) {
    int arr[] = {2,5,3};
    canPartition(arr);
    }
}*/


/*
 Question 5 :
 Number of Parenthesis Combinations
 Given N number of parenthesis (pair of opening and closing parenthesis) , you have to count all the valid combinations of the parenthesis

 Input :N = 4
 Output :14
 //Following 14 combinations { (((()))), ((()())), ((())()), ((()))(), (()(())), (()()())(()())(), (())(()), (())()(), ()((())),()(()()), ()(())()()()(()), ()()()() }
 */

import java.util.Arrays;

public class ASSI_26_DP {
    public static int noparcom(int n,int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = 0;

        for(int i=0;i<n;i++){
            ans += noparcom(i, dp) * noparcom(n-i-1, dp);
        }
        return dp[n] = ans;

    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(noparcom(n, dp));
    }
}

