// BUBBLE SORT
/*public class Basic_Sorting {
    public static void BubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
public static void Printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        BubbleSort(arr);
        Printarr(arr);
    }
}*/


// SELECTION SORT
/*public class Basic_Sorting{
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        Printarr(arr);
    }
}*/

// INSERTION SORT
/*public class Basic_Sorting{
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
    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertion(arr);
        Printarr(arr);
    }
}*/

// INBUILT SORT -
/*import java.util.Arrays;
public class Basic_Sorting{
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Arrays.sort(arr,0,3);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
}*/

// Reverse of an array
/*import java.util.Collection;
public class Basic_Sorting{
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr,Collection.reverseOrder());
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
}*/

// COUNTING SORT - 
public class Basic_Sorting{
    public static void CountingSort(int arr[]){
        
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        CountingSort(arr);
    }
}
