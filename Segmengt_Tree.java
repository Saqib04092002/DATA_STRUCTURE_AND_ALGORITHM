// Constructing segment Tree
/*public class Segmengt_Tree {
    static int tree[];
    public static void init(int n){
        tree = new int[4*n];
    }
    public static int buildST(int arr[],int i,int start,int end){
        if(start == end){
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start+end)/2;
      int left =  buildST(arr, 2*i+1, start, mid); // Leftsub tree - 2*i+1
      int right =   buildST(arr, 2*i+2, mid+1, end); // Rightsub tree - 2*i+2

        tree[i] = left+right;
        return tree[i];
    }
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);

        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
    }
}*/


// Query on segment Tree -> Sum of number in a range
/*public class Segmengt_Tree {
    static int tree[];
    public static void init(int n){
        tree = new int[4*n];
    }
    public static int buildST(int arr[],int i,int start,int end){
        if(start == end){
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start+end)/2;
      int left =  buildST(arr, 2*i+1, start, mid); // Leftsub tree - 2*i+1
      int right =   buildST(arr, 2*i+2, mid+1, end); // Rightsub tree - 2*i+2

        tree[i] = left+right;
        return tree[i];
    }
    public static int getSumutil(int i,int si,int sj,int qi,int qj){
        //Case 1
        if(qj<=si || qi>=sj){ // Non Overlap
            return 0;
        }
        // Case 2
        else if(si>=qi && sj<=qj){ // Complete overlap
            return tree[i];
        }
        // Case 3
        else{  // Partial overlap
           int mid = (si+sj)/2;
           int left = getSumutil(2*i+1, si,mid, qi, qj);
           int right = getSumutil(2*i+2, mid+1, sj, qi, qj);
           return left+right;
        }
    }
    public static int getSum(int arr[],int qi,int qj){
        int n = arr.length;
        return getSumutil(0, 0, n-1, qi, qj);

    }
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);

        //for(int i=0;i<tree.length;i++){
       //     System.out.print(tree[i]+" ");
       // }
   
        System.out.println(getSum(arr, 2,8));
    }
}*/


// Update on Segment tree
/*public class Segmengt_Tree {
    static int tree[];
    public static void init(int n){
        tree = new int[4*n];
    }
    public static int buildST(int arr[],int i,int start,int end){
        if(start == end){
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start+end)/2;
      int left =  buildST(arr, 2*i+1, start, mid); // Leftsub tree - 2*i+1
      int right =   buildST(arr, 2*i+2, mid+1, end); // Rightsub tree - 2*i+2

        tree[i] = left+right;
        return tree[i];
    }
    public static int getSumutil(int i,int si,int sj,int qi,int qj){
        //Case 1
        if(qj<=si || qi>=sj){ // Non Overlap
            return 0;
        }
        // Case 2
        else if(si>=qi && sj<=qj){ // Complete overlap
            return tree[i];
        }
        // Case 3
        else{  // Partial overlap
           int mid = (si+sj)/2;
           int left = getSumutil(2*i+1, si,mid, qi, qj);
           int right = getSumutil(2*i+2, mid+1, sj, qi, qj);
           return left+right;
        }
    }
    public static int getSum(int arr[],int qi,int qj){
        int n = arr.length;
        return getSumutil(0, 0, n-1, qi, qj);

    }
    public static void updateutil(int i,int si,int sj,int idx,int diff){
        if(idx>sj || idx<si){
            return;
        }
        tree[i] += diff;
        if(si != sj){
            int mid = (si+sj)/2;
            updateutil(2*i+1, si, mid, idx, diff); // Left
            updateutil(2*i+2, mid+1, sj, idx, diff); // Right

        }
    }
    public static void update(int arr[],int idx,int newval){
        int n = arr.length;
        int diff = newval-arr[idx];
        arr[idx] = newval;

        updateutil(0, 0, n-1, idx, diff);

    }
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);

        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
        System.out.println(getSum(arr, 2,5));
        update(arr, 2, 2);
        System.out.println(getSum(arr, 2,5));

    }
}*/



// Question -> Max/min ELement Queries - 
// Given an arr[] , we have to answer few queries:
// a) Output Max/Min for the subarray [i....j]
// b) Update the element at idx .

public class Segmengt_Tree {
    static int tree[];
    public static void init(int n){
        tree = new int[n*4];
    }
    public static int buildsegment(int arr[],int i ,int si,int sj){
        if(si == sj){
           tree[i] = arr[si];
           return arr[si];
        }
        int mid = (si+sj)/2;
        int left = buildsegment(arr,2*i+1, si, mid);
        int right = buildsegment(arr,2*i+2, mid+1,sj);
        return tree[i] = Math.max(left, right);

    }
    public static int getmaxutil(int i,int si,int sj,int qi,int qj){
        // Case 1-
        if(qi>sj || qj<si){// non overlap
            return Integer.MIN_VALUE;
        } 
        // Case 2
        else if(si>=qi && qj>=sj){ // Complete overlap
            return tree[i];
        }
        // Case 3
        else{ // partial overlap
           int mid = (si+sj)/2;
           int left =  getmaxutil(2*i+1, si, mid, qi, qj);
           int right = getmaxutil(2*i+2, mid+1, sj, qi, qj);
           return Math.max(left, right); 
        }

    }
    public static int getmax(int arr[] ,int qi,int qj){
        int n = arr.length;
      return  getmaxutil(0, 0, n-1, qi, qj);

    }
    public static void updateutil(int i,int si,int sj,int idx , int newvalue ){
        if(idx >sj || idx<si){
            return ; 
        }
        tree[i] = Math.max(tree[i],newvalue);
        if(si!=sj){
            int mid = (si+sj)/2;
            updateutil(2*i+1, si, mid, idx, newvalue);
            updateutil(2*i+2, mid+1, sj, idx, newvalue);
        }
    }

    public static void update(int arr[],int idx,int newvalue){
        int n = arr.length;
     int diff = newvalue-arr[idx];
      arr[idx] = newvalue;
      updateutil(0,0, n-1, idx, diff);
    }
    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;

        init(n);
        
        buildsegment(arr, 0, 0, n-1);

        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        
        System.out.println(getmax(arr, 0, 8));
        update(arr, 3, 9);
        System.out.println(getmax(arr, 0, 8));
    }
}