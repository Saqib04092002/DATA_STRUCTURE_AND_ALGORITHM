// Question 1 :Print the number of 7’s that are inthe 2d array.
//Example :Input - int[][] array = { {4,7,8},{8,8,7} };

// SOLUTION -
/*public class ASSIGNMENT_9_2dArray{
    public static void count7(int matrix[][],int key){
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        System.out.println("Total number of key = "+count);
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7}};
        int key = 7;
        count7(matrix,key);
    }
}*/

// Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.
// Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

// SOLUTION -

/*public class ASSIGNMENT_9_2dArray{
    public static void Sum(int nums[][]){
        int sum = 0;
        int sumarr[] = nums[1];
        for(int j=0;j<nums[0].length;j++){
                sum += sumarr[j];
            }
            System.out.println(sum);
         }
    public static void main(String[] args) {
        int nums[][] = {{1,4,9},
                       {11,4,3},
                        {2,2,3}};
                        Sum(nums);
    }
}*/

//Question 3 :Write a program to FindTranspose of a Matrix.
//What is Transpose?
//Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix.

// SOLUTION
public class ASSIGNMENT_9_2dArray{
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7}};
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] Transpose = new int[m][n];
        for(int i=0;i<Transpose .length;i++){
            for(int j=0;j<Transpose [0].length;j++){
                Transpose [i][j] = matrix [j][i];
            }
        }
        System.out.println("Print matrix before Transpose");
        for(int i=0;i< n;i++){
            for(int j=0;j<m;j++){
                System.out.print(+ matrix [i][j] + " " );
            }
            System.out.println();
        }

        System.out.println("Print matrix after Transpose");
        for(int i=0;i<Transpose .length;i++){
            for(int j=0;j<Transpose [0].length;j++){
                System.out.print( + Transpose [i][j] + " " );
            }
            System.out.println();
        }
    }
}

