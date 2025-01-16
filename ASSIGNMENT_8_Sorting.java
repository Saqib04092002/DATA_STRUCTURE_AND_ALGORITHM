/*Question :Use the following sorting algorithms tosort an array in DESCENDING order :
a).Bubble Sort
b) Selection Sort
c) Insertion Sortd
d) Counting Sort
You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]*/

// a) Bubble sort

import java.security.PublicKey;

public class ASSIGNMENT_8_Sorting {
     public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j]= arr[i];
                    arr[i] = temp;

                }
            }
        }
    }

// b) Selection Sort
public static void selectionSort(int arr[]){
    
    for(int i=0;i<arr.length-1;i++){
        int minpos = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minpos]>arr[j]){
                minpos=j;
            }
        }
        int temp = arr[minpos];
        arr[minpos] = arr[i];
        arr[i] = temp;
    }
}

   // c) Insertion Sortd
   public class Basic_Sorting{
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            // FINDING OUT THE CORRECT POSITION TO INSERT
            while(prev >= 0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
             // INSERTION
        arr[prev + 1] = curr;
        }
       
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        //BubbleSort(arr);
        insertion(arr);
        printarr(arr);
    }
}
}
