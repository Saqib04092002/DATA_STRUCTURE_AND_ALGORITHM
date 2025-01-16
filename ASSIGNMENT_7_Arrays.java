//Question 1:Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Example 1:Input:nums = [1, 2, 3, 1]Output:   true 
//Example 2:Input:nums = [1, 2, 3, 4]Output:   false 
//Example 3:Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]Output:   true

//Example 1->
/*public class ASSIGNMENT_7_Arrays {
    public static boolean check_num(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j = i+1;j<num.length;j++ )
            if(num[i] == num[j]){
                return true;
            }
        }
     return false;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3};
        System.out.println(check_num(num));
    }
}*/

// Example 2-
/*public class ASSIGNMENT_7_Arrays {
    public static boolean check_num(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j = i+1;j<num.length;j++ )
            if(num[i] == num[j]){
                return true;
            }
        }
     return false;
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4};
        System.out.println(check_num(num));
    }
}*/

// Example 3-
/*public class ASSIGNMENT_7_Arrays {
    public static boolean check_num(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int j = i+1;j<num.length;j++ )
            if(num[i] == num[j]){
                return true;
            }
        }
     return false;
    }
    public static void main(String[] args) {
        int num[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(check_num(num));
    }
}*/

// Question 3:You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//Example 1:Input:prices = [7, 1, 5, 3, 6,  4]   Output:   5 
//Explanation:Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

/*public class ASSIGNMENT_7_Arrays{
    public static int Buyandsell_stock(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<price.length;i++){
            if(buyprice < price[i]){
                int profit = price[i] - buyprice;
                maxprofit = Math.max(profit,maxprofit);
                
            }else{
                buyprice = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(Buyandsell_stock(price));
    }
}*/

//  Question 4:Given n non-negative integers representing an elevation map where the width of 
//             each bar is 1, compute how much water it can trap after raining.

// Example 1:
/*public class ASSIGNMENT_7_Arrays{
    public static int trapwater(int  height[]){
        int n = height.length;

        int leftmax[] = new int[n];
        leftmax[0] =  height[0];
        for(int i=1;i< n;i++){
            leftmax[i] = Math.max( height[i], leftmax[i-1]);
        }

        int rightmax[] = new int[ n];
        rightmax[ n-1] =  height[ n-1];

        for(int i=n-2;i>=0;i--){
             rightmax[ i] = Math.max(height[i],rightmax[i+1]);
    }
    int trappedwater = 0;
    for(int i=0;i<n;i++){
        int waterlevel = Math.min(leftmax[i],rightmax[i]);
        trappedwater += waterlevel - height[i];

    }
    
    return trappedwater;
}
    public static void main(String[] args) {
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trapwater(height));
    }
}*/

//Example 2:

public class ASSIGNMENT_7_Arrays{
    public static int trapwater(int  height[]){
        int n = height.length;

        int leftmax[] = new int[n];
        leftmax[0] =  height[0];
        for(int i=1;i< n;i++){
            leftmax[i] = Math.max( height[i], leftmax[i-1]);
        }

        int rightmax[] = new int[ n];
        rightmax[ n-1] =  height[ n-1];

        for(int i=n-2;i>=0;i--){
             rightmax[ i] = Math.max(height[i],rightmax[i+1]);
    }
    int trappedwater = 0;
    for(int i=0;i<n;i++){
        int waterlevel = Math.min(leftmax[i],rightmax[i]);
        trappedwater += waterlevel - height[i];

    }
    
    return trappedwater;
}
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println(trapwater(height));
    }
}

