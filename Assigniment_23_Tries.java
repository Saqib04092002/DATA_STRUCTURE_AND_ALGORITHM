/*
 Question 1 :MEDIUM
 Group Anagrams Together
 Given an array of strings strs , group the anagrams together . You can return the answer in any order . 
 An Anagram is a word or phrase formed by rearranging the letters of a different word or 
 phrase , typically using all the original letters exactly once.
 Sample Input 1:    strs = ["eat","tea","tan","ate","nat","bat"]
 Sample Output 1: [["bat"], ["nat", "tan"], ["ate","eat", "tea"]]
 Sample Input 2:   strs = [""]
 Sample Output 2: [[""]]
 Sample Input 3:   strs = ["a"]
 Sample Output 3: [["a"]]
 */
/*import java.util.*;
public class Assigniment_23_Tries {
    public static class Node{
        ArrayList<String> anagrams;
        Node children[] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    class HelloWorld{
         Node root ;
    }
    public static void build(String s){
        
    }
    public static void main(String[] args) {
        String strs[] = {"eat","ate","tea","tan","nat","bat"};
        root = new Node();
        for (String word : strs) {
            build(word);
        }
        dfs(root);
        for (ArrayList<String> anagram: ans) {
            for (String word : anagaram) {
                // print word
            }
        }
        
       
    }
}*/
