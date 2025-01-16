// Operations in ArrayList
/*import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Boolean>list2 = new ArrayList<>();
        ArrayList<String>list3 = new ArrayList<>();
        
        // Add Operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,5);
        System.out.println(list);

        // Get OPeration
        int element = list.get(1);
        System.out.println(element);

        // Delete Operation
        list.remove(3);
        System.out.println(list);

        // set Operation
        list.set(3,10);
        System.out.println(list);

        // Contains Operation
        System.out.println(list.contains(3));
    }
}*/

/*// Size of ArrayList
import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Boolean>list2 = new ArrayList<>();
        ArrayList<String>list3 = new ArrayList<>();
        
        // Add Operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());

        // Print The ArrayList
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        


        // Print reverse ArrayList - O(N)
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}*/

// Find Maximum in ArrayList
/*import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Boolean>list2 = new ArrayList<>();
        ArrayList<String>list3 = new ArrayList<>();
        
        // Add Operation
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
           // if(max<list.get(i)){
           //   max = list.get(i); 
           max = Math.max(max,list.get(i));
            }
        System.out.println("Maximum element = "+max);
     }
}*/

// Swap two number in ArrayList-
/*import java.util.ArrayList;
public class Array_list {
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Boolean>list2 = new ArrayList<>();
        ArrayList<String>list3 = new ArrayList<>();
        
        // Add Operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
      int idx1 = 1,idx2 = 3;
      swap(list, idx1, idx2);
      System.out.println(list);
        
    }
}*/

// Sorting in ArrayList
/*import java.util.ArrayList;
import java.util.Collections;
public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(2);
       System.out.println(list);
       // Sort ArrayList in Ascending order
       Collections.sort(list);
       System.out.println(list);

       // Sort ArrayList in descending  order
       Collections.sort(list,Collections.reverseOrder());
       System.out.println(list);

    }
}*/

// Multi-dimensional Arraylist
/*import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
        
        //ArrayList<Integer>list = new ArrayList<>();
        //list.add(1);list.add(2);
        //mainlist.add(list);

        //ArrayList<Integer>list2 = new ArrayList<>();
        //list2.add(3);list2.add(4);
        //mainlist.add(list2);
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        
        System.out.println(mainlist);

        for(int i = 0;i<mainlist.size();i++){
            ArrayList<Integer>currlist = mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");

            }
            System.out.println();
        }
    }
}*/

// Container with most water
// - FOr given n lines on x axis use 2 lines to form a container such that it holds maximum water.

//import java.util.ArrayLi
/*public class Array_list {
public static int storewater(ArrayList<Integer>height){
        
    int maxwater = 0;

    // Brute force 
    for(int i=0;i<height.size();i++){
        for(int j=i+1;j<height.size();j++){
            int ht = Math.min(height.get(i),height.get(j));
            int wt = j-i;
            int currwater = ht*wt;
             maxwater = Math.max(maxwater,currwater);
        }
 }
return maxwater;
}
public static void main(String[] args) {
ArrayList<Integer>list = new ArrayList<>();
list.add(1);
list.add(8);
list.add(6);
list.add(2);
list.add(5);
list.add(4);
list.add(8);
list.add(3);
list.add(7);
System.out.println(storewater(list));
System.out.println(list);
}
}*/

// Container with most water  Using Two Pointer Approach

/*import java.util.ArrayList;
public class Array_list {
    public static int storewater(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            // Calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int wd = rp - lp;
            int currwater = ht * wd;
            maxwater = Math.max(maxwater, currwater);

            // Update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(storewater(list));
        System.out.println(list);
    }
}*/

// Pair Sum - 1
// - Find if any pair in a sorted ArrayList has a target Sum
// list = [1,2,3,4,5,6] , Target = 5

// Brut force Apporach
/*import java.util.ArrayList;

public class Array_list {
    public static boolean Findpair(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;

        System.out.println(Findpair(list, target));
    }
}*/


// 2 Pointer Approach
/*import java.util.ArrayList;
public class Array_list {
    public static boolean Findpair(ArrayList<Integer>list,int target){

       int lp = 0;
       int rp = list.size()-1;
       while(lp<rp){
        // CASE 1
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }
        // CASE 2
         if(list.get(lp)+list.get(rp)<target){
            lp++;
        }
        // CASE 3
        else {
            rp--;
        }
       }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 50;
        
        System.out.println(Findpair(list, target));
    }
}*/


//  Pair Sum-2 using two pointer Approach -->Modular Arithmetic
import java.util.ArrayList;
public class Array_list {
    public static boolean pairsum2(ArrayList<Integer>list,int target){

       int bp = -1;
       int n = list.size();
       for(int i=0;i<n;i++){
        if(list.get(i)>list.get(i+1)){
            bp = i;
            break;
        }
       }
        int lp = bp+1;
        int rp = bp;

        while (lp != rp) {
            // Case 1 - 
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
           // Case 2-
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
            }else{
                // Case 3-
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list  = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 100 ;
        
        System.out.println(pairsum2(list, target));
    }
}