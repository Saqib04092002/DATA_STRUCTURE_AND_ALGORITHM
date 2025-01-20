// fibonacci

/*import java.util.Arrays;
public class pratice_2 {
    public static int fibRec(int n){ // tc - O(2^n)
        if(n==0 || n==1){
            return n;
        }
        return  fibRec(n-1)+fibRec(n-2);
    }
    public static int fibMemo(int n,int dp[]){ // O(n)
          if(n==0||n==1){
            return n;
          }
          if(dp[n] != -1){
            return dp[n];
         }
         dp[n] = fibMemo(n-1, dp)+fibMemo(n-2, dp);
         return dp[n]; 
     }

     public static int fibTab(int n){ // O(n)
        int dp[] = new int[n+1];

       dp[0] = 0;
       dp[1] = 1;
        for(int i=2;i<dp.length;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
     }
    public static void main(String[] args) {
        int n = 5;
        //System.out.println(fibRec(n));
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
       // System.out.println(fibMemo(n, dp));
       System.out.println(fibTab(n));
    }
}*/


// Climbing Stairs

/*import java.util.Arrays;

public class pratice_2 {
    public static int countWays(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0 ;
        }
        return countWays(n-1)+countWays(n-2);
    }

    public static int countWaysMemo(int n , int dp[]){
          if(n==0){
            return 1;
          }
          if(n<0){
            return 0 ;
          }
          if(dp[n] != -1){
            return dp[n];
          }
          return dp[n] = countWaysMemo(n-1, dp)+countWaysMemo(n-2, dp);
    }
    public static int countWaysTab(int n){
        int dp[] = new int[n+1];
       
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i] = dp[i-1]+0;
            }
            else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        //System.out.println(countWays(n));
        int dp[] = new int[n+1];
        Arrays.fill( dp,-1);
        System.out.println(countWaysTab(n));
    }
}
*/

/*import java.util.Arrays;

public class pratice_2 {
    public static int fib(int n,int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fib(n-1, dp)+fib(n-2, dp);
        return dp[n];
        
    }
    public static int fibTab(int n){
        int dp[] = new int[n+1];
       dp[0] = 0;
       dp[1] = 1;
        for(int i=2;i<n+1;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        
        System.out.println( fibTab(n));

    }
}*/

// Climbing Strairs
/*import java.util.Arrays;

public class pratice_2 {
    public static int fib(int n,int dp[]){
        if(n==0 ){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fib(n-1, dp)+fib(n-2, dp);
        return dp[n];
        
    }
    public static int fibTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        
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
        int n = 1;
        int dp[] = new int[n+1];
        
        System.out.println( fibTab(n));
        System.out.println(fib(n, dp));

    }
}*/


/*import java.util.Arrays;

public class pratice_2 {
    public static int Knapsack(int val[],int wt[],int w,int n,int dp[][]){
        if(w==0 || n==0){
            return 0;
        }
        if(dp[n][w] != -1){
            return dp[n][w];
        }
        if(wt[n-1]<=w){ // valid
           int ans1 = val[n-1]+Knapsack(val, wt, w-wt[n-1], n-1, dp); // include
           int ans2 = Knapsack(val, wt, w, n-1, dp);
           dp[n][w] = Math.max(ans1, ans2);
                }
                else{
                    dp[n][w] = Knapsack(val, wt, w, n-1, dp);
                }
                return dp[n][w];
        
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
       
       return dp[n][W];
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
        System.out.println(Knapsack(val, wt, w, val.length, dp));
        System.out.println(KnapsackTab(wt, val, w));
        }
}*/

/*public class pratice_2 {
    public static boolean targetSum(int num[],int sum){
        int n = num.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            dp[i][0] = true;
        }
       
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                int v = num[i-1];
                if(v <= j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                }
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int num[] = {4,2,7,1,3};
        int sum = 10;
        System.out.println(targetSum(num, sum));
    }
}*/

/*import java.util.Arrays;

public class pratice_2 {
    public static int lcs(String str1,String str2,int n,int m,int dp[][]){
        if(n==0||m==0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
           dp[n][m] =   lcs(str1, str2, n-1, m-1,dp)+1;
        }else{
            int ans1 = lcs(str1, str2, n-1, m,dp);
           int  ans2 = lcs(str1, str2, n, m-1,dp);
           dp[n][m] = Math.max(ans1, ans2);
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "abcde" ; 
        int n = str1.length();
        String str2 = "ace";
        int m = str2.length();
        int dp[][] = new int [n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j] = -1; 
            }
        }
        System.out.println(lcs(str1, str2, n, m,dp));
    }
}*/

/*import java.util.Arrays;


    public static int lcsTab(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        int ans = 0;
        for(int i=0;i<n+1;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j] = 0;
        }
          
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    ans = Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str1 = "acde";
        String str2 = "ace";
        System.out.println(lcsTab(str1, str2));
    }
}*/

/*import java.util.*;

public class pratice_2 {
    public static int lcs(int arr1[],int arr2[]){
        int n = arr1.length;
        int m = arr2.length;

        int dp[][] = new int[n+1][m+1];
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
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
 }
    public static int lIncreasingss(int arr1[]){
        int n = arr1.length;
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
       
            int arr2[] = new int[set.size()];
            int i=0;
            for (int num : set) {
                arr2[i] = num;
                i++;
         }
         Arrays.sort(arr2);
         return lcs(arr1,arr2);
        }
        public static void main(String[] args) {
            int arr1[] = {50,3,10,7,40,80};
            System.out.println(lIncreasingss(arr1));
        }
    }*/


    /*import java.util.*;

public class pratice_2 {
    public static void Swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);
    }
    public static void main(String[] args) {
     ArrayList<Integer> list = new  ArrayList<>();  
     list.add(1);
     list.add(2);
     list.add(3);

     int idx1 = 1;
     int idx2 = 2;

     Swap(list,idx1,idx2);
    }
}*/


/*import java.util.*;

public class pratice_2 {

    static class Transition {
        String nextState;
        String input;
        String output;

        Transition(String nextState, String input, String output) {
            this.nextState = nextState;
            this.input = input;
            this.output = output;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Transition>> stateMap = new HashMap<>();
        String initialState = null;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) break;

            String[] parts = line.split(" ");
            String presentState = parts[0];
            String nextState = parts[1];
            String input = parts[2];
            String output = parts[3];

            if (initialState == null) {
                initialState = presentState;
            }

            stateMap.computeIfAbsent(presentState, k -> new ArrayList<>())
                    .add(new Transition(nextState, input, output));
        }

        String sequence = "";
        String currentState = initialState;
        boolean isNonOverlapping = false;

        Set<String> visitedStates = new HashSet<>();

        while (true) {
            List<Transition> transitions = stateMap.get(currentState);
            if (transitions == null || transitions.isEmpty()) break;

            for (Transition transition : transitions) {
                sequence += transition.input;
                visitedStates.add(currentState);
                currentState = transition.nextState;

                if ("1".equals(transition.output) && initialState.equals(currentState)) {
                    isNonOverlapping = true;
                    break;
                }
            }

            if (isNonOverlapping) break;
        }

        System.out.println(sequence);
        if (isNonOverlapping) {
            System.out.println("Non Overlapping Sequence Detector");
        } else {
            System.out.println("Overlapping Sequence Detector");
        }

        scanner.close();
    }
}*/
/*import java.util.*;
public class pratice_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int numofDigit = 0;
        while(n>0){
            n = n/10;
            numofDigit++;
        }
        System.out.println(numofDigit);
    }
}*/
/*import java.util.*;
public class pratice_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            sum = sum+n;
            n--;
        }
        System.out.println(sum);
    }
}*/

/*import java.util.*;
public class pratice_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int m=0;
        while(n>0){
            m = n%10;
            System.out.print(m);
            n=n/10;
     }
        
    }
}*/

/*import java.util.*;
public class pratice_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
            System.out.println(fact);
          }
        }
 }*/

 /*import java.util.*;
public class pratice_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt();
        int ans = 1;
        for(int i=0;i<b;i++){
            ans = a*ans;
        }
        System.out.println(ans);
        }
 }*/


 /*import java.util.*;
public class pratice_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int r = sc.nextInt();
        System.out.println("Enter the number");
        int c = sc.nextInt();
        
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }*/


 /*import java.util.*;
public class pratice_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int r = sc.nextInt();
        System.out.println("Enter the number");
        int c = sc.nextInt();
        
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c){
                System.out.print("*");
            }
            else{
            System.out.print(" ");
            }
        }
        System.out.println();
      }
    }
 }*/


 /*import java.util.*;
 public class pratice_2{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n = sc.nextInt();
        
         
         for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
         
     }
    
     }
  }*/


 /*  import java.util.*;
  public class pratice_2{
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
         
          
          for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(j+" ");
            }
            System.out.println();
        }
        
     
      }
   }*/
 

   /*import java.util.*;
  public class pratice_2{
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
         
          
          for(int i=1;i<=n;i++){
             for(int j=1;j<=n-i+1;j++){
                 System.out.print(j+" ");
            }
            System.out.println();
        }
        
     
      }
   }*/
 
  /*  import java.util.*;
   public class pratice_2{
       public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n = sc.nextInt();
          int number = 1;
           
           for(int i=1;i<=n;i++){
              for(int j=1;j<=i;j++){
                  System.out.print(number+" ");
                  number++;
             }
             System.out.println();
         }
         
      
       }
    }*/
 

   /* import java.util.*;
   public class pratice_2{
       public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
             
     }
 }*/


 /*import java.util.*;
 public class pratice_2{
     public static void main(String[] args) {
       int num = 4;
       char ch = 'A';
      for(int i=1;i<=num;i++){
          for(int j=1;j<=i;j++){
             System.out.print(ch+" ");
             ch++;
          }
          System.out.println();
      }
           
   }
}*/
    
 
/*import java.util.*;
 public class pratice_2{
    public  static void Swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
    }
     public static void main(String[] args) {
        int a = 3,b=2;
      Swap(a, b);
     
}}*/


/*import java.util.*;
 public class pratice_2{
    public  static int Factorial(int n){
        int fact = 1;
       for(int i=1;i<=n;i++){
        fact = fact*i;
       }
       
     return fact;
    }
     public static void main(String[] args) {
        int n=5;
    System.out.println(Factorial(n));
     
}}*/
    
 
 /*import java.util.*;
 public class pratice_2{
    public  static int Factorial(int n){
        int fact = 1;
       for(int i=1;i<=n;i++){
        fact = fact*i;
       }
       
     return fact;
    }
    public static int binCoeff(int n,int r){
        int binCoef = Factorial(n)/Factorial(r)*Factorial(n-r);
        return binCoef;
    }
     public static void main(String[] args) {
        int n=5,r=2;
    System.out.println(binCoeff(n,r));
     
}}*/

/*import java.util.*;
 public class pratice_2{
   
    public static boolean isprime(int n){
        boolean isprime = true;
        if(n==2){
            System.out.println("Number is prime");
        }else{
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                isprime = false;
            }
        }
    }
    return isprime;
} 
public static void Printprimeno(int n){
    for(int i=0;i<=n;i++){
       if(isprime(i)== true){
        System.out.println(i+" ");
       }
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n = sc.nextInt();
    Printprimeno(n);
     
}}*/


/*import java.util.*;
public class pratice_2{
    public static void BintoDec(int Binnum){
        int mynum = Binnum;
        int pow = 0;
        int decnum = 0;
        while(Binnum>0){
        int listdig = Binnum%10;

        decnum = decnum+(listdig*(int)Math.pow(2, pow));
        pow++;
        Binnum = Binnum/10;
    }
        System.out.println(decnum);
        

    }
    public static void main(String[] args) {
        
      BintoDec(1000);
        
    }
}*/


/*import java.util.*;
public class pratice_2{
    public static void DectoBin(int num){
        int mynum = num;
        int pow = 0;
        int Binnum = 0;
        while(num>0){
        int rim = num%2;

        Binnum = Binnum+(rim*(int)Math.pow(10, pow));
        pow++;
        num = num/2;
    }
        System.out.println(Binnum);
        

    }
    public static void main(String[] args) {
        
      DectoBin(8);
        
    }
}*/


/*import java.util.*;
public class pratice_2{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int arr2[] = new int[50];
        System.out.println(arr[0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        arr2[0] = sc.nextInt();
        System.out.println("Enter second number");
        arr2[1] = sc.nextInt();
        System.out.println("Enter last number");
        arr2[2] = sc.nextInt();

        System.out.println("number 1  - " + arr2[0]);
        System.out.println("number 2  - " + arr2[1]);
        System.out.println("number 3  - " + arr2[2]);

    }
}*/


/*import java.util.*;
public class pratice_2{
    
    public static int linearSearch(int arr[], int key){
        
        for(int i=0;i<=arr.length;i++){
            if(arr[i] == key){
               
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        int index = linearSearch(arr, 10);

        if(index == -1){
            System.out.println("Key Not Found");
        }else{
            System.out.println("Key Found at - " + index);
        }

        System.out.println(linearSearch_For_Largest_no(arr));
    }
}*/


/*import java.util.*;
public class pratice_2{
    public static int get_Largest_no(int arr[]){
        int largest_no = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest_no < arr[i]){
                largest_no = arr[i];
            }
        }
        return largest_no;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        System.out.println("Largest number is - "+get_Largest_no(arr));
    }
}*/

/*import java.util.*;
public class pratice_2{
    public static int get_smaller_no(int arr[]){
        int smaller_no = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smaller_no >arr[i]){
                smaller_no = arr[i];
            }
        }
        return smaller_no;
    }
    public static void main(String[] args) {
         int arr[] = {2,4,5,6,7,8,9};
         System.out.println("Smaller number - " + get_smaller_no(arr) );

    }
}*/

// Binary Search
/*import java.util.*;
public class pratice_2{
    public static int Binary_search(int arr[],int key){
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
               return mid;
            }
            if(key>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
         int arr[] = {2,4,6,8,10,12,14};
         int key = 10;

         System.out.println(Binary_search(arr, key));
    }
}*/


/*import java.util.*;
public class pratice_2{
    public static void Reverse_Array(int arr[]){
       int temp ;
       int start = 0;
       int end = arr.length-1;
       while(start<end){
         temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
       }
       for(int i = 0; i<arr.length;i++){
        System.out.print(arr[i] + " ");
       }
    }
    public static void main(String[] args) {
        int arr[]  =  {2,4,6,8,10,12,14};
        Reverse_Array(arr);
    }
}*/


/*import java.util.*;
public class pratice_2{
    public static void pair_arr(int number[]){
        int tp = 0;
        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Number of Pairs - "+tp);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14}; 
        pair_arr(number);
    }
}*/

/*import java.util.*;
public class pratice_2{
    public static void Print_Subarray(int number[]){
        int ts = 0;
        for(int i= 0;i<number.length;i++){
           int start = i;
           for(int j=i;j<number.length;j++){
            int end = j;

            for(int k = start;k<=end;k++){
                System.out.print(number[k]+" ");
            }
            ts++;
            System.out.println();
           }
           System.out.println();
        }
        System.out.println("Total Subarray - "+ts);
        
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,7,8,9,10};
        Print_Subarray(number);
    }
}*/
// Brute force Apporach - 
/*import java.util.*;
public class pratice_2{
    public static void Max_subarray(int arr[]){
        int currsum  = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
               currsum = 0;
                for(int k=start;k<=end;k++){
                   currsum +=arr[k];
                }
                   System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max sum = "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        Max_subarray(arr);
    }
}*/

// Prefixsum
/*import java.util.*;
public class pratice_2{
    public static void Max_sum_Prefix(int number[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+number[i];
        }
        for(int i=0;i<number.length;i++){
           int start = i;
           for(int j=0;j<number.length;j++){
            int end = j;
            currsum = start == 0 ? prefix[end]:prefix[end]-prefix[start-1];   
            if(maxsum<currsum){
                maxsum = currsum;
            }        
        }
        }
        System.out.println("Max sum of subarray is - "+maxsum);
    }
    public static void main(String[] args) {
        int number[] = {2,-1,4,-2,6,-1};
        Max_sum_Prefix(number);
    }
}*/

/*import java.util.*;
public class pratice_2{
    public static void kadanes(int number[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            cs = cs+number[i];
            if(cs<0){
                cs = 0;
            }
        }
        ms = Math.max(cs, ms);
        System.out.println("Max subarray is - "+ms);
    }
    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(number);
    }
}*/

/*import java.util.*;
public class pratice_2{
    public static void subarray(int number[]){
        int ts = 0;
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k] +" ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println(ts);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        subarray(number);
    }
}*/

// Trapping Rainwater problem - 
/*import java.util.*;
public class pratice_2{
    public static int trapped_Rainwater(int height[]){
        int n = height.length;

        // left max boundary
        int left[] = new int[n];
        left[0] = height[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(height[i],left[i-1]);
        }

        // right max boundary
        int right[] = new int[n];
        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(height[i],right[i+1]);
        }

        //Water level
        int trappedwater = 0;
        for(int i=0;i<n;i++){
           int  waterlevel = Math.min(left[i],right[i]);

           // trapped rainwater

           trappedwater += waterlevel-height[i];
        }
        return trappedwater;    

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trapped_Rainwater(height));
    }
}*/

/*import java.util.*;
public class pratice_2{
    public static int buysellstock(int price[]){
    int buyprice = Integer.MAX_VALUE;
    int maxprofit = 0;
    for(int i=0;i<price.length;i++){
        if(buyprice>price[i]){
            buyprice = price[i];
        }
        maxprofit = Math.max(maxprofit,price[i]-buyprice);
    }
    return maxprofit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(buysellstock(price));
    }
}*/


/*import java.util.*;
public class pratice_2{
    public static void Search_2darr(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == key){
                    System.out.println("Key found at - "+"("+i+","+j+")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int key = 5;
        
        
        Search_2darr(arr, key);
    }
}*/


/*import java.util.*;
public class pratice_2{
    public static void Spiral_Matrix(int arr[][]){
        int  startrow = 0;
        int endrow = arr.length-1;
        int startcol = 0;
        int endcol = arr[0].length-1;

        
        while(startrow<=endrow && startcol<=endcol){
            // top
            for(int i=startcol;i<=endcol;i++){
                System.out.print(arr[startrow][i]+" ");
             }
            //right
            for(int j = startrow+1;j<=endrow;j++){
                System.out.print(arr[j][endcol]+" ");
            }
            // bottom
            for(int i = endcol-1;i>=startcol;i--){
                System.out.print(arr[endrow][i]+" ");
            }
            // left
            for(int j= endrow-1;j>=startrow+1;j--){
                System.out.print(arr[j][startcol]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}}; 
        Spiral_Matrix(arr);
    }
}*/


/*import java.util.*;
public class pratice_2{
    public static int digonal_sum(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int sum = 0;
        /*for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j || i+j == n-1){
                    sum += arr[i][j];
                }
            }
        }*/
       /*  for(int i=0;i<n;i++){
           sum += arr[i][i];
           if(i!=n-i-1){
            sum += arr[i][n-i-1];
           }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println(digonal_sum(arr));
        }
}*/

import java.util.*;
public class pratice_2{
    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,7,4};
        reverseArray(arr);
        
        
        
     }
}


