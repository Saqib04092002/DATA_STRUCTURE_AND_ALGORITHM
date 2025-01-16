// Bubble Sort
/*import java.util.*;
public class Sorting {
    public static boolean bubble_sort(int arr[]){
            int n = arr.length;
            boolean isswap = false;
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        isswap = true;
                    }
                }
            }
            return isswap;
        }
        public static void main(String[] args) {
            int arr[] = {8,9,5,4,3,2,1,7};
            System.out.println(bubble_sort(arr));
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }*/
    

    // Selection Sort
    /*import java.util.*;
    public class Sorting {
        public static void Selection_sort(int arr[]){
            int n = arr.length;
            for(int i=0;i<n;i++){
                int smallestIdx = i;
                for(int j=i+1;j<n;j++){
                    if(arr[smallestIdx]>arr[j]){
                        smallestIdx = j;
                    }
                }
                //SWAP
                int temp = arr[smallestIdx];
                arr[smallestIdx] = arr[i];
                arr[i] = temp;
            }
        }
        public static void main(String[] args) {
            int arr[] = {5,4,2,3,1};
            Selection_sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }*/


    //Insertion sort ->
    /*import java.util.*;
    public class Sorting {
        public static void Insertion_sort(int arr[]){
            for(int i=1;i<arr.length;i++){
                int curr = i;
                int prev = i-1;
                while(prev>=0 && arr[prev]>arr[curr]){
                    arr[prev+1] = arr[prev];
                    prev--;
                }
                arr[prev+1] = curr;
            }
        }
        public static void main(String[] args) {
            int arr[] = {5,3,4,2,1};
            Insertion_sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

        }
    }*/

    // INBUILT FUNCTION

    /*import java.util.Arrays;
    public class Sorting {
        public static void main(String[] args) {
            int arr[] = {5,4,3,2,1};
            Arrays.sort(arr);
            Arrays.sort(arr,0,3);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }*/

    /*import java.util.*;
    import java.util.Arrays;
    import java.util.Collections;
    public class Sorting {
        public static void main(String[] args) {
            Integer arr[]  = {1,2,3,4,5};
            Arrays.sort(arr,Collections.reverseOrder());
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }*/

    // Counting Sort 
    import java.util.*;
    
    public class Sorting {
        public static void Counting_sort(int arr[]){
            int largest = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                largest = Math.max(largest,arr[i]);
            }
            int count[] = new int[largest+1];
            for(int i=0;i<arr.length;i++){
                count[arr[i]]++;
            }
            int j=0;
            for(int i=0;i<count.length;i++){
                while(count[i]>0){
                    arr[j] = i;
                    j++;
                    count[i]--;
                }
            }
        }
        public static void main(String[] args) {
            int arr[] = {1,4,1,2,7,5,2};
            Counting_sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    
    




