// Creating an array->
/*public class Arrays {
    public static void main(String[] args) {

        int marks[] = new int[50];

        int number[] = {1,2,3};

        String fruits[] = {"mango","orange","Banana"};
        
    }
}*/

// Take Input in Arrays->
/*import java.util.*;
public class Arrays {
    public static void main(String[] args) {

        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter Physics marks :");
        marks[0] = sc.nextInt();
        System.out.println( "Enter Maths marks :");
        marks[1] = sc.nextInt();
        System.out.println( "Enter Chemistry marks :");
        marks[2] = sc.nextInt();

        System.out.println("Phy : "+marks[0]);
         System.out.println("Maths : "+marks[1]);
          System.out.println("Che : "+marks[2]);

          //marks[2] = marks[2]+5;
          //System.out.println("Che : "+marks[2]);

          int percentage = (marks[0]+marks[1]+marks[2])/3;
          System.out.println("percentage ="+percentage+"%");
          System.out.println("Length of Array = "+marks.length);
        }
}*/

// Passing array as argument->
/*public class Arrays{
    public static void updatemarks(int marks[],int non_changeable){
        non_changeable = non_changeable+5;
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int non_changeable = 5;
        updatemarks(marks,non_changeable);
        for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println(non_changeable);
        }
}*/

// Linear Search
/*import java.util.*;
public class Arrays{
    public static int linearsearch(int number[],int key){
        for(int i =0;i<=number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
            return -1;
        }
    public static void main(String[] args) {

        int number[] = {2,4,6,8,10,12,14,16};
        int key = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of key");
        key = sc.nextInt();
        int index = linearsearch(number, key);
        if(index == -1 ){
            System.out.println("Not found");
        }else{
            System.out.println("key is at index :"+index);
        }
    }
}*/

// Find Largest number in Array->
/*import java.util.*;
public class Arrays{
    public static int Getlargest(int number[]){
        int largest = Integer.MIN_VALUE;//->min infinity
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<number.length;i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest>number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest value fo array is :"+smallest);
        return largest;
}
public static void main(String[] args) {
        int number[] = {1,2,3,4,6,7};
        System.out.println("Largest value of array is :"+Getlargest(number));
        
    }
}*/

// Binary Search->
/*import java.util.*;
public class Arrays{
    public static int Binary_search(int number[],int key){
        int start = 0;int end = number.length-1;
        
        while(start <= end){
            int mid = (start + end)/2;
            
            // Comparisons
            if(number[mid] == key){// Found
               return mid;
            }
            if(number[mid]<key){//Right
                start = mid+1;
            } else { // Left
            end = mid-1;
        }
    }
    return -1;
       
    }
    
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16,18,20};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of key");
        int key = sc.nextInt();
        System.out.println("Index for key is :"+Binary_search(number, key));
    }
}*/

// Reverse an Array
/*public class Arrays{
    public static void Reverse(int number[]){
        int first = 0; int last = number.length-1;
        
        while(first < last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};

        Reverse(number);
        for(int i=0;i<=number.length-1;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}*/

// Pairs in an Arrays

/*public class Arrays{
    public static void pairs(int number[]){
        int tp = 0;
        for(int i =0 ;i<number.length;i++){
            for(int j = i+1;j<number.length;j++){
                System.out.print("("+number[i]+","+number[j]+")");
                tp++;
            }
           
            System.out.println();
        }
         System.out.println("Total pairs = " + tp);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        pairs(number);

    }
}*/

// Print Subarrays in arrays

/*public class Arrays{
    public static void Printsubarray(int number[]){
        int ts = 0;
        
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j = i;j<number.length;j++){
                int end = j;
                for(int k = start;k<end;k++){
                    System.out.print(number[k]+" ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total nuber of subarrays is ="+ts);

    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        Printsubarray(number);
    }
}*/

// Max Subarray Sum -> Brute force Time complexity ->o(n3)

/*public class Arrays{
    public static void MaxsubarraySum(int number[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j = i;j<number.length;j++){
                int end = j;
                currsum = 0;
                for(int k = start;k<=end;k++){
                    // Print subarray sum
                    currsum += number[k];
                }
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Total Max sum ="+maxsum);

    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        MaxsubarraySum(number);
    }
}*/

// Max Subarray Sum -> Prifix Sum Time complexity ->o(n2)
/*public class Arrays{
    public static void MaxsubarraySum_UsingPrifix(int number[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
       int prifix[] = new int[number.length];
       prifix[0] = number[0];
       //Calculate Prifix Array
       for(int i=1;i<prifix.length;i++){
        prifix[i] = prifix[i-1]+number[i];
    }
        
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j = i;j<number.length;j++){
                int end = j;
                currsum = start==0 ? prifix[end] : prifix[end] - prifix[start-1];
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
            System.out.println("Max Sum = " + maxsum);
        }
        

    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        MaxsubarraySum_UsingPrifix(number);
    }
}*/

// Print Max Subarray Sum-> Using Kadane's Alg. complexity -> o(n)
/*public class Arrays{
    public static void MaxsubarraySum_UsingKadanesAlg(int number[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            currsum += number[i];
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
            
        }
        System.out.println("Max sum is = "+maxsum);
        }
    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,1,-2,5,-3};
        MaxsubarraySum_UsingKadanesAlg(number);
    }
}*/

// Trapping Rainwater ->
// Q-> Given n non-negative integers representing an elevation map where the width of each bar is 1,compute how much water it can trap after raining.

/*public class Arrays{
    public static int Trapping(int height[]){
        int n = height.length;
        int width = 1;

    // Calculte leftside Max array
    int leftmax[] = new int[n];
    leftmax[0] = height[0];
    for(int i =1;i<n;i++){
        leftmax[i] = Math.max(height[i],leftmax[i-1]);
    }
    // Calculte Righttside Max boundry
    int rightmax[] = new int[n];
    rightmax[n-1] = height[n-1];
    for(int i =n-2;i>=0;i--){
        rightmax[i] = Math.max(height[i],rightmax[i+1]);
    }
    int trapedwater = 0;
    //loop
    for(int i = 0;i<n;i++){
        int waterlevel = Math.min(leftmax[i],rightmax[i]);
        trapedwater += (waterlevel - height[i])/width;
    }
    return trapedwater ; 
}
    
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(Trapping(height));
    }
}*/

// Buy and Sell Stocks->

/*public class Arrays{
    public static int BuyandSell_stock(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<price.length;i++){
            if(buyprice < price[i]){
                int profit = price[i] - buyprice;//profit
                maxprofit = Math.max(maxprofit,profit);// Maxprofit
            }else{
                buyprice = price[i];
            }
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
       System.out.println( "Maximum profit is = "+BuyandSell_stock(price));
    }
}*/


