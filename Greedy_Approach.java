// Question 1 - Activity Selection - 

/*import java.util.ArrayList;

public class Greedy_Approach {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

      // 1st Activity
      maxActivity = 1;
      int lastEnd = end[0];
      ans.add(0);
      for(int i=1;i<end.length;i++){
        if(start[i]>lastEnd){
            lastEnd = end[i];
            maxActivity++;
            ans.add(i);
        }
      }
      System.out.println("Max Activity = "+maxActivity);
      for(int i=0;i<ans.size();i++){
        System.out.println("A"+ans.get(i));
      }
      System.out.println();
     }
}*/

// If end Array not sorted
/*import java.util.ArrayList;
import java.util.Arrays;

public class Greedy_Approach {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        int Activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            Activities[i][0] = i;
            Activities[i][1] = start[i];
            Activities[i][2] = end[i];
        }
      
        // Lambda function -> shortform
        Arrays.sort(Activities, Comparator.comparingDouble(o->o[2])); 
      maxActivity = 1;
      int lastEnd = Activities[0][2];
      ans.add(Activities[0][0]);
      for(int i=1;i<end.length;i++){
        if(Activities[i][1]>lastEnd){
            lastEnd = Activities[i][2];
            maxActivity++;
            ans.add(Activities[i][0]);
        }
      }
      System.out.println("Max Activity = "+maxActivity);
      for(int i=0;i<ans.size();i++){
        System.out.println("A"+ans.get(i));
      }
      System.out.println();
     }
}*/


// Question 2 -> Fractional Knapsack -
/* Given the weight and values of N items, put these items in a knapsack of Capacity W to get the Maximum total value in the Knapsack .
Value[] = [60,100,120]
weight[] = [10,20,30]
 */

 /*import java.util.ArrayList;
 import java.util.Arrays;
import java.util.Comparator;
 
 public class Greedy_Approach {
  public static void main(String[] args) {
    int val[] = {60,100,120};
    int weight[] = {10,20,30};
    int W = 50;

    Double ratio[][] = new Double[val.length][2];

    for(int i=0;i<val.length;i++){
      ratio[i][0] = (double)i;
      ratio[i][1] = val[i]/(double)weight[i];
    }

    // Ascending Order
    Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
    
    int Capacity = W;
    int finalval = 0;

    for(int i=ratio.length-1;i>=0;i--){
     int idx = (int) ratio[i][0];
      if(Capacity>=weight[idx]){ // Include full item
        finalval += val[idx];
        Capacity -= weight[idx];
      }else{
        // Include fractional item
        finalval += (ratio[i][1]*Capacity);
        Capacity=0;
        break;
      }
    }
    System.out.println("Final value = "+finalval);
  }
 }*/

 // Question 4 -
 /* Minmum Absolute Difference pairs
    Ginven two arrays A and B of equal length n . pair each element of Array A to an element in array B, such that sum S of absolute difference of all pairs is minimum
  */
  /*import java.util.ArrayList;
 import java.util.Arrays;
import java.util.Comparator;
 
 public class Greedy_Approach {
  public static void main(String[] args) {
    int A[] = {4,1,8,7};
    int B[] = {2,3,6,5};

    Arrays.sort(A);
    Arrays.sort(B);

    int mindiff = 0;

    for(int i=0;i<A.length;i++){
       mindiff += Math.abs(A[i]-B[i]);
    }
    System.out.println("Min absolute difference = "+mindiff);
  }
 }*/


 // Question 5 ->
 // Max Length chain of pairs . 
 /*import java.util.ArrayList;
 import java.util.Arrays;
import java.util.Comparator;
 
 public class Greedy_Approach {
  public static void main(String[] args) {
    int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
    Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

    int chainlen = 1;
    int chainEnd = pairs[0][1]; //Last selected pairs end

    for(int i=1;i<pairs.length;i++){
      if(pairs[i][0] > chainEnd ) {
        chainlen++;
        chainEnd = pairs[i][1];
      }
    }
    System.out.println("Max length of chain ="+chainlen );
  }
 }*/


 // Question 6 -Indian Coins ->
 /* We are give an infinite supply of donominations[1,2,5,10,20,50,100,200,500,2000].
    find minimum number of coins /notes to make change for a value v. 
  */

  /*import java.util.ArrayList;
 import java.util.Arrays;
import java.util.Comparator;

import javax.naming.ldap.ControlFactory;
 
 public class Greedy_Approach {
  public static void main(String[] args) {
    Integer coin[] = {1,2,5,10,20,50,100,200,500,2000};
    Arrays.sort(coin,Comparator.reverseOrder());
    int countOfCoin = 0;
    int amount = 590;

    ArrayList<Integer> ans = new ArrayList<>();

    for(int i=0;i<coin.length;i++){
      if(coin[i]<=amount){
        while(coin[i]<=amount){
          countOfCoin++;
          amount -= coin[i];
          ans.add(coin[i]); 
        }
      }
    }
    System.out.println("Total (min) coins used = "+countOfCoin);

    for(int i=0;i<ans.size();i++){
      System.out.print(ans.get(i)+" ");
    }
    System.out.println();
  }
 }*/


 // Question 7 -> Job Sequencing problem-
 /* Given an array of jobs where every job has a deadline and profit if the job is finished before the deadline.
    It is also given  that every job takes a single unit of time,so the minimum possible deadline for any job is 1.
    Maximum the total profit if only one job can be scheduled at a time . 
  */
  /*import java.util.*;
  import java.util.ArrayList;
 import java.util.Arrays;
import java.util.Comparator;

  public class Greedy_Approach {
    public class Job{
      int deadline;
      int profit;
      int id;
      public Job(int i,int d,int p){
        id =i;
        deadline = d;
        profit = p;
      }
    }
    public static void main(String[] args) {
      int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
      
      ArrayList<Job> jobs = new ArrayList<>();
      for(int i=0;i<jobInfo.length;i++){
        jobs.add(new Job(i , jobInfo[i][0],jobInfo[i][1]));
      }
      Collections.sort(jobs, (a,b) -> b.profit-a.profit);

      ArrayList<Integer> seq =  new ArrayList<>();
      int time = 0 ;
      for(int i=0;i<jobs.size();i++){
        Job curr = jobs.get(i);
        if(curr.deadline>time){
          seq.add(curr.id);
          time++;
        }
      }
      // Print seq
      System.out.println();
    }
  }*/


  // Question 8 -> Chocola Problem
  import java.util.*;
  import java.util.ArrayList;
 import java.util.Arrays;
import java.util.Comparator;

  public class Greedy_Approach {
    public static void main(String[] args) {
       Integer costhor[] = {4,1,2};
       Integer costver[] = {2,1,3,1,4};

       Arrays.sort(costver,Collections.reverseOrder());
       Arrays.sort(costhor,Collections.reverseOrder());

       int h = 0,v=0;
       int hp = 1,vp = 1;
       int cost = 0;

       while(h<costhor.length && v<costver.length){
        if(costver[v]<costhor[h]){
          cost += (costhor[h]*vp);
          h++;
          hp++;
          
        }else{
          cost += (costver[v]*hp);
          v++;
          vp++;
          
        }
       
       }
       while(h<costhor.length){
        cost += (costhor[h]*vp);
        h++;
        hp++;
        
      }
      while (v<costver.length) {
        cost += (costver[v]*hp);
        v++;
        vp++;
        
        
      }
      System.out.println(cost);
    }
  }