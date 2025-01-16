/*public class Backtracking {
    public static void changeArr(int arr[],int i,int val){

        // Base Case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //Recurison 
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}*/

// Find Subset
// Find and Print all subsets of a given string.
 
/*public class Backtracking {
    public static void findsubset(String str,String ans,int i){

        // Base case-
        if(i == str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        
        // yes choise
        findsubset(str, ans+str.charAt(i), i+1);

        // No choise
        findsubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        findsubset(str," ",0);
    }
}*/


// Find Permutation
// Find and Print all perputation of a String.
/*public class Backtracking{
    public static void findPermutation(String str,String ans){

        // Base Case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //Recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            findPermutation(newstr, ans+curr);

        }

    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}*/


// N Queens

/*public class Backtracking{
    public static boolean isSafe(char board[][],int row,int col){
        // Vertical up 
        for(int i=row-1 ; i>=0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // Diag left up
        for(int i = row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // diag right up 
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int row){
        // Base case
        if(row == board.length){
            //printBoard(board);
            count++;
            return;
        }
        // Column loop
        
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] = 'x';//backtracking
        }
    }
}
    public static void printBoard(char board[][]){
        System.out.println("------------ Chess board -----------");
        for(int i=0;i<board.length;i++){
            for(int j = 0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count = 0 ;
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'x';

            }
        }
        nQueens(board, 0);
        System.out.println( "Total ways to solve n queens = "+count);
    }
}*/


// Grid Ways

// - Find number of ways to reach from (0,0) to (N-1,M-1) in a N x M Grid.
// Allowed moves - right or down

/*public class Backtracking{
    public static int gridways(int i,int j,int n,int m){
        //  Base case
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==n){
             return 0;
        }
        int w1 = gridways(i+1, j, n, m);    
        int w2 = gridways(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridways(0, 0, n, m));
    }
}*/


// Sudoku
public class Backtracking{
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //column 
        for(int i=0;i<=8;i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        // Row 
        for(int j=0;j<=8;j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }

        // Grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        //3x3 grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        // base case
        if(row==9 ){
            return true;
        } 
        
        // Recursion
        int nextRow = row,nextcol = col+1;
        if(col+1==9){
            nextRow = row+1;
            nextcol = 0;
        }
        if(sudoku [row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextcol);
        }
        for(int digit =1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku,nextRow,nextcol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static void PrintSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.println(sudoku[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku [][] = {{0,0,8,0,0,0,0,0,0},
    {4,9,0,1,5,7,0,0,2},
    {0,0,3,0,0,4,1,9,0},
    {1,8,5,0,6,0,0,2,0},
    {0,0,0,0,2,0,0,6,0},
    {9,6,0,4,0,5,3,0,0},
    {0,3,0,0,7,2,0,0,4},
    {0,4,9,0,3,0,0,5,7}};

    if(sudokuSolver(sudoku, 0, 0)){
        System.out.println("Solution exists");
    }else{
        System.out.println("Solution does not exist");
    }
    }
}