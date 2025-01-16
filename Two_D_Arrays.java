// Taking input in matrix
/*import java.util.*;
public class Two_D_Arrays {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length,m = matrix[0].length;
        System.out.println("Enter the value of matrix element");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                matrix[i][j] = sc.nextInt();
            }
        }
        // Output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

// Searching element in Matrix
/*import java.util.*;
public class Two_D_Arrays {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Element found at index = "+"("+i+","+j+")");
                    return true;
                }
            }}
            System.out.println("Element not found");
            return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length,m = matrix[0].length;
        System.out.println("Enter the value of matrix element");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                matrix[i][j] = sc.nextInt();
            }
        }
        // Output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,5);

    }
}*/

// Find largest number in Matrix
/*import java.util.*;
public class Two_D_Arrays {
    public static void Largest_Num(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
        }
        System.out.println("Largest number is :"+largest);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length,m = matrix[0].length;
        System.out.println("Enter the value of matrix element");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                matrix[i][j] = sc.nextInt();
            }
        }
        // Output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Largest_Num(matrix);
    }
}*/

// SPIRAL MATRIX

/*public class Two_D_Arrays{
    public static void Spiral_Matrix(int matrix[][]){
        int startrow = 0;
        int endrow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            //Top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+ " ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            // Bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();

     }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                           {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        Spiral_Matrix(matrix);

    }
}*/


// DIAGONAL SUM
/*public class Two_D_Arrays{
    public static int diagonal_sum(int matrix[]){
        int sum = 0;
        for(int i=0; i<matrix.length;i++){
         for(int j=0; j<matrix[0].length;j++){
            if(i == j){
                sum += matrix[i][j];
            }
            else if(i+j == matrix.length-1){
                sum += matrix[i][j];
            }
         }
    }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                           {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        diagonal_sum(matrix);
    }
}*/

// Search Element in Sorted Matrix
public class Two_D_Arrays{
    public static boolean StaircaseSearch(int matrix[][],int key){
        int row=0;
        int col = matrix[0].length-1;
        while(row<=matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("Element found at index :"+"("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else {
                row++;
        }
    }
    System.out.println("Key not found !");
    return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                           {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        int key = 33;
                        StaircaseSearch(matrix,key);
        
    }
}


