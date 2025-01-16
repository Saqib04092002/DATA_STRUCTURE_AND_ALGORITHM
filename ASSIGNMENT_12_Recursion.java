//ASSIGNMENT_12
/* Question 1: For a given integer array of size N.You have to find all the occurrences (indices)of a given element(key) and print them. Use a recursive function to solve this problem. */

/*public class ASSIGNMENT_12_Recursion {
    public static void findnum(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i]==key) {
            System.out.print(i + " ");
        }
        findnum(arr, key, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = {3,2,4,5 };
        int key = 2;
        findnum(arr, key, 0);
        System.out.println();
    }
}*/

/*Question 2 :You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0 */

/*public class ASSIGNMENT_12_Recursion{
    static String digits[] = {"zero","One","Two","three","four","five","Six","Seven","Eight","Nine","Ten"};
    public static void printDigits(int number){
        if(number==0){
            return;
        }
        int lastdigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastdigit]+" ");

    }
    public static void main(String[] args) {

        printDigits(2019);
        System.out.println();
       
    }
}*/

// Question 3 :Write a program to findLength of a String using Recursion.

/*public class ASSIGNMENT_12_Recursion{
    public static int lengthofString(String str){
        if(str.length() == 0){
            return 0;
        }
        return lengthofString(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(lengthofString(str));
    }
}*/

// Question4:WearegivenastringS,weneedtofindthecountofallcontiguoussubstringsstarting
// and ending with the same character.

// Sample Input 1: S = "abcab"Sample Output 1: 7There are 15 substrings of
// "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab,
// bOutoftheabovesubstrings,thereare7substrings:a,abca,b,bcab,c,aandb.So,only7contiguous
// substrings start and end with the same character.

/*public class ASSIGNMENT_12_Recursion {
    public static int countSubstrs(String str,int i,int j,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res = countSubstrs(str,i+1,j,n-1)+countSubstrs(str,i,j-1,n-1)+countSubstrs(str,i+1,j-1,n-1-2);
        if(str.charAt(i) == str.charAt(j)){
            res++;
         }
         return res;

    }
    public static void main(String[] args) {
        String str = "aba";
        int n = str.length();
        System.out.println(countSubstrs(str, 0, n-1, n));
    }
}*/


//Question 5 :TOWER OF HANOI(Important!)
// Youhave3towersandNdisksofdifferentsizeswhichcanslideontoanytower.Thepuzzlestartswithdiskssortedinascendingorderofsizefromtoptobottom(i.e.,eachdisksitsontop of an even larger one).
//You have the following constraints:
//(1) Only one disk can be moved at a time.
//(2) A disk is slid off the top of one tower onto another tower.
//(3)Adiskcannotbeplacedontopofasmallerdisk.Writeaprogramtomovethedisksfromthe first tower to thelast using Stacks.

public class ASSIGNMENT_12_Recursion {
    public static void towerOfHanoi(int n,char from_rod,char to_rod,char aux_rod){
        // Base case
        if(n== 0){
            return;
        }
        // Move n-1 disk from rod A(from_rod) to rod B(aux_rod)
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        
        // MOve nth disk from rod A (from_rod) to rod c(to_rod).
        System.out.println("Move disk"+n+"from rod"+from_rod+"to rod"+to_rod);

        //Move n-1 disk from rod b(aux_rod) to rod c(to_rod).
        towerOfHanoi(n-1,aux_rod, to_rod,from_rod);
    }
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}