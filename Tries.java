/*public class Tries {
    public static  class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        public  Node(){
            for(int i=0;i<children.length;i++){
                children[i] =  null;
            }
        }
    }
    public static Node root = new Node();
// Insert Function
    public static void insert(String word){ // 0(L)
      Node curr = root;
      for(int level=0;level<word.length();level++){
          int idx = word.charAt(level)-'a';
          if(curr.children[idx] == null){
            curr.children[idx] = new Node();
          }
          curr = curr.children[idx];
      }
      curr.eow = true;
    }

    // Search Function 
    public static boolean search(String key){
        Node curr = root;
      for(int level=0;level<key.length();level++){
          int idx = key.charAt(level)-'a';
          if(curr.children[idx] == null){
            return false;
          }
          curr = curr.children[idx];
      }
    return  curr.eow == true;
    
    }
public static void main(String[] args) {
    String words[] = {"the","a","there","any","thee"};
    for(int i=0;i<words.length;i++){
        insert(words[i]);
    }
    System.out.println(search("thor"));
  }
}*/

// Question - Word Break Problem  - 
/*public class Tries {
  public static  class Node{
      Node children[] = new Node[26];
      boolean eow = false;
      public  Node(){
          for(int i=0;i<26;i++){
              children[i] =  null;
          }
      }
    }
      public static Node root = new Node();

    public static void insert(String word){ // 0(L)
      Node curr = root;
      for(int level=0;level<word.length();level++){
          int idx = word.charAt(level)-'a';
          if(curr.children[idx] == null){
            curr.children[idx] = new Node();
          }
          curr = curr.children[idx];
      }
      curr.eow = true;
    }
    public static boolean search(String key){
      Node curr = root;
    for(int level=0;level<key.length();level++){
        int idx = key.charAt(level)-'a';
        if(curr.children[idx] == null){
          return false;
        }
        curr = curr.children[idx];
    }
  return  curr.eow == true;
  
  }
  public static boolean wordBreak(String key){
    if(key.length() == 0){
      return true;
    }
    for(int i=1;i<key.length();i++){
      if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
       return true;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    String arr[] = {"i","like","sam","samsung","mobile","ice"};
    for(int i=0;i<arr.length;i++){
      insert(arr[i]);
    }
    String key = "ilikesamsung";
    System.out.println(wordBreak(key));
  }
}*/


// Question - Prefix Problem
/*public class Tries {
  public static  class Node{
    Node children[]  = new Node[26];
    boolean eow = false;
    int freq;
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
      int idx = word.charAt(i) - 'a';
      if(curr.children[idx] == null){
        curr.children[idx] = new Node();
      }else{
       curr.children[idx].freq++;
      
      }
      curr = curr.children[idx];
    }
    curr.eow = true;
  }

  public static void findPrefix(Node root , String ans){
    if(root == null){
      return;
    }
    if(root.freq == 1){
      System.out.println(ans);
      return ;
    }
    for(int i=0;i<root.children.length;i++){
      if(root.children[i] != null){
        findPrefix(root.children[i], ans+(char)(i+'a'));
      }
    }
  }
  public static void main(String[] args) {
    String word[] = {"zebra","dog","duck","dove"};
    for(int i=0;i<word.length;i++){
      insert(word[i]);
    }
    root.freq = -1;
    findPrefix(root, "");
  }
}*/


// Question - StartsWith

/*public class Tries {
  public static  class Node{
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
      int idx = word.charAt(i) - 'a';
      if(curr.children[idx] == null){
        curr.children[idx] = new Node();
      }
      curr = curr.children[idx];
    }
    curr.eow = true;
  }
  public static boolean startWith(String prefix){
     Node curr = root;
     for(int i=0;i<prefix.length();i++){
      int idx = prefix.charAt(i) - 'a';
      if(curr.children[idx] == null){
        return false;
      }
      curr = curr.children[idx];
     }
     return true;
  }
  public static void main(String[] args) {

    String word[] = {"apple","app","mango","woman"};
    for(int i=0;i<word.length;i++){
      insert(word[i]);
    }
    String prefix = "app";
    String prefix1 = "moon";
    System.out.println(startWith(prefix));
    System.out.println(startWith(prefix1));
    }
  }*/


// Question - Count unique substring - 
/*public class Tries {
  public static  class Node{
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
      if(curr.children[idx] == null){
        curr.children[idx] = new Node();
      }
      curr = curr.children[idx];
    }
    curr.eow = true;
  }
  public static int CountNode(Node root){
    if(root==null){
      return 0;
    }
    int count = 0;
    for(int i=0;i<26;i++){
      if(root.children[i] != null){
        count += CountNode(root.children[i]);
      }
    }
    return count+1;
  }
  public static void main(String[] args) {
    String str = "ababa";

    for(int i=0;i<str.length();i++){
      String suffix = str.substring(i);
      insert(suffix);
    }
    System.out.println(CountNode(root));
  }
}*/


// Question - Longest Word with all Prefixes
public class Tries {
  public static  class Node{
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
      if(curr.children[idx] == null){
        curr.children[idx] = new Node();
      }
      curr = curr.children[idx];
    }
    curr.eow = true;
  }
  public static String ans = " ";
  public static void longestWord(Node root,StringBuilder temp){
    if(root == null){
      return;
    }
    for(int i=0;i<26;i++){
      if(root.children[i]!=null &&root.children[i].eow == true ){
        char ch = (char)(i+'a');
        temp.append(ch);
        if(temp.length()>ans.length()){
          ans = temp.toString();
        }
        longestWord(root.children[i], temp);
        temp.deleteCharAt(temp.length()-1);// Backtrack
      }
    }
  }
  public static void main(String[] args) {
    String word[] = {"a","banana","app","appl","ap","apply","apple"};
    for(int i=0;i<word.length;i++){
      insert(word[i]);
    }
    longestWord(root, new StringBuilder());
    System.out.println(ans);
  }
}
