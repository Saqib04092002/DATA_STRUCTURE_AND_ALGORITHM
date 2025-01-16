/*public class DP_1 {
    // Using Recurison --> Time Comp. - O(2^n)
    public static int fib(int n){
        if(n==0 || n==1){
            return n ;
        }
        return fib(n-1)+fib(n-2);
    }
    // Using DP (Memoization) --> Time Comp - O(n)
    public static int fib_dp(int n,int f[]){
        if(n==0 || n==1){
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = fib_dp(n-1, f) + fib_dp(n-2,f);
        return f[n];
    }

     // Using DP (Tabulation) --> Time Comp - O(n)
     public static int fib_tabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
       
    }
    public static void main(String[] args) {
        int n=5;
        int f[] = new int[n+1];
        System.out.println(fib(n)); 
        System.out.println(fib_dp(n, f));
        System.out.println(fib_tabulation(n));
    }
}*/


//Climbing  Strairs ->
/*public class DP_1 {
    public static int countWays(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0 ;
        }
        return countWays(n-1)+countWays(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countWays(n));
    }
}*/


//Climbing  Strairs -> Using DP(Memoization)

/*import java.util.Arrays;

public class DP_1 {
    public static int countWays(int n,int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0 ;
        }
        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] =  countWays(n-1,ways)+countWays(n-2,ways);
        return ways[n];
    }
    public static int countWaysTab(int n){
        int dp[]= new int[n+1];
        dp[0] = 1;

        // Climbing  Strairs ->Tabulation loop
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i] = dp[i-1]+0;
            }else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
       return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(countWays(n,ways));
        System.out.println(countWaysTab(n));
    }
}*/


// Question 2 -  0-1 Knapsack ->
/*import java.util.Arrays;
public class DP_1 {
    public static int Knapsack(int val[],int wt[],int W,int n){
        if(W==0 || n==0){
            return 0 ;
        }
        if(wt[n-1]<=W){ // valid
            // include
           int asn1 = val[n-1]+ Knapsack(val, wt, W-wt[n-1], n-1);
           // exclude
           int ans2 = Knapsack(val, wt, W, n-1);

           return Math.max(asn1, ans2);

        }else{
           return Knapsack(val, wt, W, n-1);
        }
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;
         System.out.println(Knapsack(val, wt, w, val.length));
    }
}*/


// 0-1 Knapsack(Using DP --> Memoization) -> TC - O(n*w)
/*public class DP_1 {
    public static int Knapsack(int val[],int wt[],int W,int n,int dp[][]){
        if(W==0 || n==0){
            return 0 ;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){ // valid
            // include
           int asn1 = val[n-1]+ Knapsack(val, wt, W-wt[n-1], n-1,dp);
           // exclude
           int ans2 = Knapsack(val, wt, W, n-1,dp);

           dp[n][W] =  Math.max(asn1, ans2);
           return dp[n][W];

        }else{
            dp[n][W] = Knapsack(val, wt, W, n-1,dp);
            return dp[n][W];
        }
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;
        int dp[][] = new int[val.length+1][w+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(Knapsack(val, wt, w, val.length,dp));
    }
}*/


// 0-1 Knapsack(Using DP --> Tabulation) -> TC - O(n*w)
/*public class DP_1 {
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int KnapsackTab(int val[],int wt[],int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
       for(int i=0;i<dp.length;i++){
        dp[i][0] = 0;
       }
       for(int j=0;j<dp[0].length;j++){
        dp[0][j] = 0;
       }
       for(int i=1;i<n+1;i++){ // i - no. of items
        for(int j=1;j<W+1;j++){ // j - allowed capacity
            int v = val[i-1]; // ith item val
            int w = wt[i-1]; // ith item wt

            if(w <= j){ // valid
                //include
                int incprofit = v + dp[i-1][j-w];
                // exclude
                int excprofit = dp[i-1][j];
                dp[i][j] = Math.max(incprofit, excprofit);
               
            }else{ // invalid
                int excprofit = dp[i-1][j];
                dp[i][j]  = excprofit;
            }
        }
       }
       print(dp);
       return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;
        //int dp[][] = new int[val.length+1][w+1];
         System.out.println(KnapsackTab(val, wt, w));
    }
}*/


//  Target Sum  Subset - 
// 0-1 Knapsack(Using DP --> Tabulation) -> TC - O(n*w)
/*public class DP_1 {
    public static boolean targetSumSubset(int arr[],int sum){
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];
       for(int i=0;i<n+1;i++){ 
        dp[i][0] = true;
       }
       for(int i=1;i<n+1;i++){ //i - items
        for(int j=1;j<sum+1;j++){ // j - target sum
            int v = arr[i-1]; // ith item val
            //include
            if(v <= j && dp[i-1][j-v] == true){ // valid
                dp[i][j] = true;
            // exclud
        }else if(dp[i-1][j] == true){ 
                dp[i][j] = true;
            }
        }
       }
       print(dp);
       return dp[n][sum];
    }
    public static void print(boolean dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,2,7,1,3};
        int sum = 10;
        //int dp[][] = new int[val.length+1][w+1];
         System.out.println(targetSumSubset(arr, sum));
    }
}*/



// Question 3 -  Unbounded 0-1 Knapsack -> TC - O(n*w)
/*public class DP_1 {
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int UnboundKnapsackTab(int val[],int wt[],int W){

    int n = val.length;
    int dp[][] = new int[n+1][W+1];
    for(int i=0;i<n+1;i++){
        dp[i][0] = 0;
    }
    for(int j=0;j<W+1;j++){
        dp[0][j] = 0;
    }
    for(int i=1;i<n+1;i++){
        for(int j=1;j<W+1;j++){
            if(wt[i-1]<=j){ // valid
               // include
               dp[i][j] = Math.max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);
            }
            else{ // invalid
                dp[i][j] = dp[i-1][j];
            }
        }
    }
    print(dp);
    
    return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;
        //int dp[][] = new int[val.length+1][w+1];
         System.out.println(UnboundKnapsackTab(val, wt, w));
    }
}*/


// Question -> Coin Change - 
/*public class DP_1 {
    public static int CoinChange(int coins[],int sum){
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            dp[i][0] = 1;
        }
        for(int j=0;j<sum+1;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coins[i-1]<=j){
                    dp[i][j] = dp[i][j-coins[i-1]]+dp[i-1][j];
                }else{
                   dp[i][j] =  dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int coins[] = {2,5,3,6};
        int sum = 10;
        System.out.println(CoinChange(coins, sum));
    }
}*/


// Rod Cutting 
/*public class DP_1 {
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    // weight = length ; val = price ; W = totRod
    public static int rodCutting(int length[],int price[],int totRod){
        int n = length.length;
        int dp[][] = new int[n+1][totRod+1];
        for(int i=0;i<n+1;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<totRod+1;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<totRod+1;j++){
                if(length[i-1]<=j){ // Valid
                    dp[i][j] = Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);// include,exclude
                }else{
                   dp[i][j] =  dp[i-1][j];// Invalid
                }
            }
        }
        print(dp);
        return dp[n][totRod];
    }
    public static void main(String[] args) {
        int length[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5,8,9,10,17,17,20};
        int totRod = 8;
        System.out.println(rodCutting(length,price, totRod));
    }
}*/


// Longest Common subsequence -> using Recurison 
/*public class DP_1 {
    public static int lcs(String str1,String str2,int n,int m){
        if(n==0 || m==0){ // Base Case
            return 0;
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return lcs(str1, str2, n-1, m-1)+1;
        }else{
            int ans1 = lcs(str1, str2, n-1, m);
             int ans2 = lcs(str1, str2,n, m-1);
             return Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args) {
         String str1 = "abcde"; 
         String str2 = "ace"; 
         int n = str1.length();
         int m = str2.length();
         System.out.println(lcs(str1, str2, n, m));
    }
}*/

// Longest Common subsequence -> (using DP - Memoization)
/*public class DP_1 {
    public static int lcsMemoization(String str1,String str2,int n,int m,int dp[][]){
        if(n==0 || m==0){ // Base Case
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){ // same
            return dp[n][m] =  lcsMemoization(str1, str2, n-1, m-1,dp)+1;
        }else{ // different
            int ans1 = lcsMemoization(str1, str2, n-1, m   ,dp);
             int ans2 = lcsMemoization(str1, str2,n, m-1,dp);
             return dp[n][m] = Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args) {
         String str1 = "abcde"; 
         String str2 = "ace"; 
         int n = str1.length();
         int m = str2.length();
         int dp[][] = new int[n+1][m+1];
         for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j] = -1;
            }
         }
         System.out.println(lcsMemoization(str1, str2, n, m,dp));
    }
}*/


// Longest Common subsequence -> (using DP - Tabulation) // O(n*m)
/*public class DP_1 {
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int lcsTab(String str1,String str2){
        int n = str1.length();
         int m = str2.length();
       int dp[][] = new int [n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){ // Base Case
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                     dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        print(dp);
        return dp[n][m];
    }
    public static void main(String[] args) {
         String str1 = "abcde"; 
         String str2 = "ace"; 
         int n = str1.length();
         int m = str2.length();
        
         System.out.println(lcsTab(str1, str2));
    }
}*/


// Longest Common substring -> (using DP - Tabulation) // O(n*m)
/*public class DP_1 {
    public static int lcSubstring(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        int ans = 0;
        for(int i=0;i<n+1;i++){// Initilize
            dp[i][0] = 0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){  // When element same
                     dp[i][j] = dp[i-1][j-1]+1;
                     ans = Math.max(ans, dp[i][j]);
                }else{          // when element differ
                    dp[i][j] = 0;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ABGCE";
        System.out.println(lcSubstring(str1, str2));
    }
}*/


// Longest Increasing Subsequence -> (using DP - Tabulation) // O(n*m)

/*import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class DP_1 {
    public static int lcs(int arr1[],int arr2[]){
       int n = arr1.length;
       int  m = arr2.length;
       int dp[][] = new int [n+1][m+1];
       for(int i=0;i<n+1;i++){
        dp[i][0] = 0;
       }
       for(int j=0;j<m+1;j++){
        dp[0][j] = 0;
       }
       for(int i=1;i<n+1;i++){
        for(int j=1;j<m+1;j++){
            if(arr1[i-1] == arr2[j-1]){
                dp[i][j] = dp[i-1][j-1]+1;
            }else{
                int ans1 = dp[i-1][j];
                int ans2 = dp[i][j-1];
                dp[i][j] = Math.max(ans1, ans2);
            }
        }
    }
    return dp[n][m];
    }
    public static int LIS(int arr1[]){
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){ // Unique element
            set.add(arr1[i]);
        }
        int arr2[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            arr2[i]  = num;
            i++;
        }
        Arrays.sort(arr2); // Sorting array
        return lcs(arr1, arr2);
    }
    public static void main(String[] args) {
        int arr[] = {50,3,10,7,40,80};
        System.out.println(LIS(arr));
    }
}*/


// Edit Distance
/*
 OPeration
 1) add
 2) delete
 3) replace
 */
/*public class DP_1 {
    public static int editDistance(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){
                    dp[i][j] = j;
                }
                if(j==0){
                    dp[i][j] = i;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int add = dp[i][j-1]+1;
                    int delete = dp[i-1][j]+1;
                    int replace = dp[i-1][j-1]+1;
                    dp[i][j] = Math.min(add,Math.min(delete,replace));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String word1 = "intention";
        String Word2 = "ececution";
        System.out.println(editDistance(word1, Word2));
    }
 }*/


 //Question ->  String Conversion ->
 /*public class DP_1 {
    public static int lcs(String str1 , String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j] = 0;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) ==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void stringConversion(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        int ans = lcs(str1,str2);
        int deletionoperation = n-ans;
        System.out.println("Number of Deletion Operation = "+deletionoperation);
        int insertionoperation = m-ans;
        System.out.println("Number of Insertion Operation = "+insertionoperation);

    }
    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        stringConversion(str1, str2);
    }
 }*/


 // Wildcard Matching ->
 /*public class DP_1 {
    public static boolean isMatch(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        boolean dp[][] = new boolean[n+1][m+1];

        dp[0][0] = true;
        for(int i=1;i<n+1;i++){
             dp[i][0] = false;
        }
        for(int j=1;j<m+1;j++){
            if(str2.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1) || str2.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(str2.charAt(j-1) == '*'){
                     dp[i][j] = dp[i][j-1] || dp[i-1][j]; 
                        //       Ignore        Match   
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String text = "baaabab";
        String pattern = "*****ba*****ab";
        System.out.println(isMatch(text, pattern));
    }
 }*/

 


