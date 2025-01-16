/*
 Question 1 :
 Range Sum of BST
 We have a Binary Search Tree consisting of N nodes and two positive integers L and R , the task is to 
 find the sum of values of all the nodes that lie in the range [L, R]..
 Sample Input1::
               8
             /   \
           5      11
          /  \      \
         3    6      20
Sample Output1: 11
 */



/*public class Assigniment_21_BST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int rangeSumBST(Node root, int low, int high) {
        int sum = 0;
        if(root == null){
            return sum ; 
        }
        
        if(root.data<low){
       
        sum += rangeSumBST(root.right, low, high);
        }else if(root.data>high){
            sum += rangeSumBST(root.left, low, high);
        }else{
           sum += root.data;
           sum += rangeSumBST(root.right, low, high);
           sum += rangeSumBST(root.left, low, high);
        }

        return  sum;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right  = new Node(15);
        root.left.left = new Node(3);
        root.left.left.left = new Node(1);
        root.left.right = new Node(7);
        root.left.right.left = new Node(6);
        root.right.left = new Node(13);
        root.right.right = new Node(18);

        System.out.println(rangeSumBST(root, 5, 10));

    }
}*/


/*
 Question 2 :
 Find the closest element in Binary Search Tree
 We have a binary search tree and a target node K .The task is to find the node with minimum absolute
  difference with given target value K.
           8
         /   \
       5      11
     /  \      \
    3    6      20
    Sample Input 1: 5
    Sample Output 1: 5 (difference is 0)
    Sample Input 2: .19
    Sample Output 2: 20 (difference is 1)
 */
/*import java.util.*;
public class Assigniment_21_BST {
  public static class Node{
      int data;
      Node left;
      Node right;
      Node(int data){
          this.data = data;
          this.left = null;
          this.right = null;
      }
  }
  // Method 1 - 
  public static void getInorder(Node root,ArrayList<Integer>inorder){
    if(root == null){
      return;
    }
    getInorder(root.left, inorder);
    inorder.add(root.data);
    getInorder(root.right, inorder);
  }

  public int kthsmallest(Node root,int k){
    ArrayList<Integer>inorder = new ArrayList<>();
    getInorder(root, inorder);
    return inorder.get(k-1);
  }

  // Method 2 -
  static int ans;
  static int K; 
  public static void inorder(Node root){
    if(root == null){
      return;
    }
    inorder(root.left);
    K--;
    if(K==0){
      ans = root.data;
    }
    inorder(root.right);
  }
  public static int kthsmallest2(Node root ,int k){
    ans = 0 ;
    K = k;
    inorder(root);
    return ans;
  }
  public static void addAllleft(Node root,Stack<Node>st){
   while(root != null){
    st.push(root);
    root = root.left;
   }
  }
  public int kthsmallest3(Node root,int k){
   Stack<Node>st = new Stack<>();
   addAllleft(root, st);
   while(k > 1){
    Node topNode = st.pop();
    if(topNode != null){
      addAllleft(topNode.right, st);
    }
    k--;
   }
   return st.peek().data;
  }
  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(5);
    root.right  = new Node(15);
    root.left.left = new Node(3);
    root.left.left.left = new Node(1);
    root.left.right = new Node(7);
    root.left.right.left = new Node(6);
    root.right.left = new Node(13);
    root.right.right = new Node(18);

    System.out.println(kthsmallest2(root, 5));
}

}*/
 /*
  Question 3 :
  Find k-th smallest element in BSTWe have the root of a binary search tree and K as input, find Kth smallest element in BST.
                 8
               /   \
              5     11
            /  \     \
           3    6     20
        Sample Input 1: k=3
        Sample Output 1: 8
        Sample Input 2: k=5
        Sample Output 2: 5
  */

/*  import java.util.*;
public class Assigniment_21_BST {
  public static class Node{
      int data;
      Node left;
      Node right;
      Node(int data){
          this.data = data;
          this.left = null;
          this.right = null;
      }
  }
  public static boolean isValidBST(Node root,Node min,Node max){
    if(root == null){
      return true;
    }
    int sum = 0;
    if(min != null && root.data<=min.data){
      return false ;
    }
    if(max!= null && root.data>=max.data){
      return false ;
    }
    return isValidBST(root.left, min, root)&&isValidBST(root.right, root, max );
   }
   
  public static int maxSum(Node root){
    int sum = 0 ;
    if(root == null){
      return 0;
    }
    
    if(isValidBST(root, null, null) ){
      sum += root.data+maxSum(root.left)+maxSum(root.right);

      
    }
    return sum;
   
  }
    
  
    
  
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(4);
    root.right  = new Node(3);
    root.left.left = new Node(2);
    
    root.left.right = new Node(4);
    root.right.left = new Node(2);
    root.right.right = new Node(5);
    root.right.right.left = new Node(4);
    root.right.right.right = new Node(6);

    System.out.println(maxSum(root));
}
}*/     
  /*
   Question 4 :
   Two Sum BSTs
   Given a BST,transformitin to a greater sum tree where each node contains sum of all nodes greater than that node.
   Sample Input 1:
                 5
               /   \
              3     7
             / \   / \
            2   4 6   8
                 10
               /   \
              6     15
             / \   /  \
            3  8  11  18
            x = 16
            Sample Output 1: 3 The pairs are:(5, 11), (6, 10) and (8, 8)
   */

/*
Question 5 :
Maximum Sum BST in Binary Tree
We have a binary tree , the task is to print the maximum sum of nodes of a sub - tree which is also a Binary Search Tree.
Sample Input 1:
             5
           /  \
          9    2
         /      \
        6        3
       / \
      8   7
Sample Output 1: 8
*/

public class Assigniment_21_BST{
  public static class Node{
      int data;
      Node left,right;
      Node(int data){
          this.data = data;
          this.left = null;
          this.right = null;
      }
  }
  public static class Info{
      boolean isBST;
      int sum;
      int min;
      int max;
      Info(boolean isBST,int sum,int min,int max){
          this.isBST = isBST;
          this.sum = sum;
          this.min = min;
          this.max = max;
      }
  }
  public static int maxsum = 0;
  public static Info largestBST(Node root){
      if(root == null){
          return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
      }
      Info leftinfo = largestBST(root.left);
      Info rightinfo = largestBST(root.right);
      int sum = leftinfo.sum+rightinfo.sum+root.data;
      int min = Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
      int max = Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));
      
       if(root.data<=leftinfo.max || root.data>=rightinfo.min){
          return new Info(false,sum,min,max);
       }
       if(leftinfo.isBST && rightinfo.isBST){
          maxsum = Math.max(sum,maxsum);
          return new Info(true, sum, min, max);
       }
       return new Info(false,sum, min, max);
      
  }
  public static void main(String[] args) {
      Node root = new Node(50);
      root.left = new Node(30);
      root.left.left = new Node(5);
      root.left.right = new Node(20);

      root.right = new Node(60);
      root.right.left = new Node(45);
      root.right.right = new Node(70);
      root.right.right.left = new Node(65);
      root.right.right.right = new Node(80);

      largestBST(root);
      System.out.println("Max sum of BST is - "+maxsum);
  }
}

