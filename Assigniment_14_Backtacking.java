
//Question 1 :
//Rat in a Maze
/*You are given a starting position for a rat which is stuck in a maze at an initial point(0,0)(the
maze can be thought of as a 2-dimensionalplane).The maze would be given in the form of a square matrix 
of order N*N where the cell swith value 0r epresent the maze’sblocked locations while value1 is the 
open / available path that the rat can take to reach its destination. The rat's destination is at (N - 1, N - 1).
Your task is to find all the possible paths that the rat can take to reach from source to destination in the maze.
The possible directions that it can take to move in the maze are'U'(up)i.e.(x-1,y),'D'(down)i.e. (x+1, y) , 'L' (left) i.e. (x, y-1), 'R' (right) i.e. (x, y+1).
(This problem is similar to Grid ways.)
*/
// Note - You can not visit  a cell more than one.
/*public class Assigniment_14_Backtacking {
    public static boolean check(int maze[][], int sol[][], int x, int y) {
        int n = maze.length;
        if (x < 0 || x >= n || y < 0 || y >= n) {
            return false;
        }
        if (maze[x][y] == 0 || sol[x][y] == 1) {
            return false;
        }
        return true;
    }

    public static void solve(int maze[][], int sol[][], int x, int y) {
        int n = maze.length;
        if (x == n - 1 && y == n - 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(sol[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;

        }
        if (check(maze, sol, x, y + 1)) {
            sol[x][y + 1] = 1;
            solve(maze, sol, x, y + 1);
            sol[x][y + 1] = 0;
        }
        if (check(maze, sol, x, y - 1)) {
            sol[x][y - 1] = 1;
            solve(maze, sol, x, y - 1);
            sol[x][y - 1] = 0;
        }
        if (check(maze, sol, x + 1, y)) {
            sol[x + 1][y] = 1;
            solve(maze, sol, x + 1, y);
            sol[x + 1][y] = 0;
        }
        if (check(maze, sol, x - 1, y)) {
            sol[x - 1][y] = 1;
            solve(maze, sol, x - 1, y);
            sol[x - 1][y] = 0;
        }
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        int n = 4;
        int sol[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sol[i][j] = 0;
            }
        }
        sol[0][0] = 1;
        solve(maze, sol, 0, 0);
    }
}*/


//Question 2 :
//Keypad Combinations
/*
 Given a string containing digits from 2-9 inclusive , print all possible letter combinations that
 the number could represent. You can print the answer in any order.
 A mapping of digits to letters(just like on the telephone buttons) is given below. Note that 1 does 
 not map to any letters.
 */

 /*public class Assigniment_14_Backtacking{
    final static char[][]keypad = {{},{},{'a','b','c'},
    {'d','e','f'},{'g','h','i'},{'j','k','l'},
    {'m','n','o'},{'p','q','r','s'},{'t','u','v'},
    {'w','x','y','z'}};

    public static void rec(String a,int len,int pos,StringBuilder ans){
        if(pos==len){
            System.out.print(ans.toString()+" ");
            //System.out.println();
            return;
        }
        char keypos[] = keypad[Character.getNumericValue(a.charAt(pos))];
        for(int i=0;i<keypos.length;i++){
            rec(a, len, pos+1, new StringBuilder(ans).append(keypos[i]));

        }
    }
    public static void main(String[] args) {
        String a = "23";
        int len = 2;
        rec(a, len, 0, new StringBuilder());
    }
 }*/


 //Question 3 :
 //Knight’s Tour
 /*
 Given a N*N board with the Knight placed on the first block of an empty board. Moving according to 
 the rules of chess , knights must visit each square exactly once. Print the order of each cell in which 
 they are visited.*/

 /*
  Sample Input 1: N = 8
  Sample Output 1:
  0  59  38  33  30  17   8  63
 37  34  31  60   9  62  29  16
 58   1  36  39  32  27  18   7
 35  48  41  26  61  10  15  28
 42  57   2  49  40  23   6  19
 47  50  45  54  25  20  11  14
 56  43  52   3  22  13  24   5
 51  46  55  44  53   4  21  1
  */

  public class Assigniment_14_Backtacking{
    
  }