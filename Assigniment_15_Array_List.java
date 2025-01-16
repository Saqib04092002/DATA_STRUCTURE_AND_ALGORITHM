/*
Question 1 :
 Monotonic ArrayList(EASY)
 An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
 An Arraylist nums is monotone increasing if for all i<=j,nums.get(i) <= nums.get(j).
 An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
 Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
 
 Sample Input 1 : nums = [1,2,2,3]
 Sample Output 1 : True
 */

/*import java.util.ArrayList;

public class Assigniment_15_Array_List {
    public static boolean monotone(ArrayList<Integer>nums){
        for(int i = 0;i<nums.size();i++){
            if(nums.get(i) > nums.get(i+1)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        System.out.println(nums);
        System.out.println(monotone(nums));
    }

    
}*/


/*
 Question 2 :
 Lonely Numbers in ArrayList(MEDIUM) 
 You are given an integer arraylist nums .A number x is lonely when it appears only once , and
  no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.Return all lonely numbers in nums. 
  You may return the answer in any order.
  
  Sample Input 1: nums = [10,6,5,8]
  Sample Output 1: [10,8]
  Explanation :- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
               - 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
 */


 /*import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 public class Assigniment_15_Array_List {
     public static ArrayList<Integer> lonelynum(ArrayList<Integer>nums){
        ArrayList<Integer>result = new ArrayList<>();
        int n = nums.size();
        Collections.sort(nums);
       
        for(int i = 0;i<n;i++){
             if(i != 0 && (nums.get(i-1) == nums.get(i)-1)||(nums.get(i-1) == nums.get(i))){
                   continue;
             }
             if(i != n-1 && (nums.get(i+1) == nums.get(i)+1)||(nums.get(i+1) == nums.get(i))){
             continue;
         }
         result.add(nums.get(i));
         
        }
        return result;
 
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt(); 
        ArrayList<Integer>arr = new ArrayList<>();

        for(int i=0;i<arr.size();i++){
            System.out.println("Enter elemente");
            int num = sc.nextInt();
            arr.add(num);
        }
         ArrayList<Integer>ans = lonelynum(arr);
         for(int i=0;i<arr.size();i++){
            System.out.println(ans.get(i)+" ");
         }
     }
}*/


 /*
  Question 3 :Most Frequent Number following Key(EASY)
  You are given an integer Arraylist nums. You are also given an integer key,which is present in nums. For every unique integer target in nums ,
   count the number of times target immediately follows an occurrence of key in nums. In other words, count the number of indices i such that:

   0 <= i <= nums.size() - 2,
   nums.get(i) == key and,
   nums.get(i+1) == target.
   Return the target with the maximum count.
   (Assumption- that the target with maximum count isunique.)
  
   Sample Input 1:nums = [1,100,200,1,100], key = 1
   Sample Output 1:  100
   Explanation :
   For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.No other integers follow an occurrence of key, so we return 100
   */

   /*import java.util.ArrayList;
   public class Assigniment_15_Array_List {
    public static int mostfrequent(ArrayList<Integer>nums,int key){
        int count[] = new int [1000];

        // Building our counting Array
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i) == key){
                count[nums.get(i+1)-1]++;
            }

        }
        // Finding the index with the greatest entry.
        int maxIndex = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0;i<count.length;i++){
            if(count[i]>maxIndex){
                maxIndex= count[i];
                ans = i+1;
            }
               
            }
            return ans;
        }
        
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList <>();
        nums.add(7); 
        nums.add(5); 
        nums.add(4); 
        nums.add(6); 
        nums.add(5); 
        nums.add(8); 
        nums.add(4); 
        nums.add(9); 
        nums.add(4); 
        nums.add(5); 
        nums.add(4); 
        nums.add(7);
        int key = 5;
        System.out.println(mostfrequent(nums, key)); 
    }
   }*/

   /*
    Question 4 :
    Beautiful ArrayList(MEDIUM)
    An Arraylist nums of size n is beautiful if:
    nums is a permutation of the integers in the range [1, n].
    For every 0 < = i < j < n,there is no index k with i <k < j where 2 * nums.get(k)==nums.get(i)+nums.get(j).
    Given the integern , return any beautiful arraylist nums of size n.There will be at least one valid 
    answer for the given n.
    Sample Input 1: n = 4Sample Output 1:  [2,1,4,3]Sample Input 2: n = 5Sample Output 2:  [3,1,2,5,4]
    */

    /*import java.util.ArrayList;
   public class Assigniment_15_Array_List {
    public static ArrayList<Integer>beautifulArray(int n){
        ArrayList<Integer>ans = new ArrayList<>();
        ans.add(1);
        while(ans.size()<n){
            ArrayList<Integer>temp = new ArrayList<>();
            int ans_size = ans.size();

            for(int i=0;i<ans_size;i++){
                if((ans.get(i)*2-1 <= n)){
                    temp.add(ans.get(i)*2-1);
                }
            }
            for(int i=0;i<ans_size;i++){
                if(ans.get(i)*2<=n){
                    temp.add(ans.get(i)*2);
                }
            }
            ans=temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer>ans = beautifulArray(n);
         for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
         }
    }
   }*/

    

 
   import java.util.ArrayList;
   public class Assigniment_15_Array_List {
    public static ArrayList<Integer>beautifilarr(int n){
        ArrayList<Integer>ans = new ArrayList<>();
        ans.add(1);
        while(ans.size()<n){
            ArrayList<Integer>temp = new ArrayList<>();
            for(int i=0;i<ans.size();i++){
                if(ans.get(i)*2-1 <=n){
                    temp.add(ans.get(i)*2-1);
                }
            }
            for(int i=0;i<ans.size();i++){
                if(ans.get(i)*2 <=n){
                    temp.add(ans.get(i)*2);
                }
            }
            ans = temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        int  n = 6;
        ArrayList<Integer>ans = beautifilarr(n);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println(ans);
    }
   }