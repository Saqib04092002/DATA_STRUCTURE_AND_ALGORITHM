/*import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        //Create
        HashMap<String,Integer>hm = new HashMap<>();
        
        // Insert - 0(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        

        System.out.println(hm);

        // Get  - 0(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        // ContainsKey - 0(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // Remove - 0(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // Clear
        hm.clear();

        // isEmpty()
        System.out.println(hm.isEmpty());
    }
}*/

// Iterate
/*import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        //Create
        HashMap<String,Integer>hm = new HashMap<>();
        
        // Insert - 0(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",6);
        hm.put("Nepal",5);

        // Itreate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = "+k+","+"value="+hm.get(k));
            
        }
    }
}*/

// Implementation of HashMap-
/*import java.util.*;
public class Hashing{
    static class HashMap<K,V>{
        private class Node{
           K key;
           V value;
           public Node(K key,V value){
            this.key = key;
            this.value = value;
           }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];// N = buckets.length

        @SuppressWarnings("unchecked")
       public HashMap(){
        this.N = 4;
        this.buckets = new LinkedList[4];
        for(int i=0;i<4;i++){
            this.buckets[i] = new LinkedList<>();
        }
       }
       private int hashFunction(K key){
           int hc = key.hashCode();
           return Math.abs(hc)%N;  
       }
       private int SearchInLL(K key , int bi){
        LinkedList<Node> ll = buckets[bi];
        int di = 0; 

        for(int i=0;i<ll.size();i++){
            Node node = ll.get(i);
            if(node.key == key){
               return di;
            }
            di++;
        }
        return -1;
       }
       @SuppressWarnings("unchecked")
       private void rehash(){
        LinkedList<Node> oldBuck[] = buckets;
        buckets = new LinkedList[N*2];
        N = 2*N;
        for(int i=0;i<buckets.length;i++){
            buckets[i] = new LinkedList<>();
        }
        // node -> add in bucket
        for(int i=0;i<oldBuck.length;i++){
            LinkedList<Node> ll = oldBuck[i];
            for(int j=0; j<ll.size();j++){
                Node node = ll.remove();
                put(node.key,node.value);
            }
        }
       }
       public void put(K key , V value){
        int bi = hashFunction(key);
        int di = SearchInLL(key,bi);

        if(di != -1){
            Node node = buckets[bi].get(di);
            node.value = value;
        }else{
            buckets[bi].add(new Node(key,value));
            n++;
        }
        double lambda = (double)n/N;
        if(lambda > 2.0){
         rehash();
        }
       }
       public boolean containsKey(K key){
        int bi = hashFunction(key);
        int di = SearchInLL(key,bi);

        if(di != -1){
            return true;
        }else{
           return false;
        }
       }
       public V get(K key){
        int bi = hashFunction(key);
        int di = SearchInLL(key,bi);

        if(di != -1){
            Node node = buckets[bi].get(di);
            return node.value ;
        }else{
            return null;
        }
       }
       public V remove(K key){
        int bi = hashFunction(key);
        int di = SearchInLL(key,bi);

        if(di != -1){
            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
        }else{
            return null;
        }
       }
       public ArrayList<K> keyset(){
        ArrayList<K> keys = new ArrayList<>();
        for(int i=0;i<buckets.length;i++){
            LinkedList<Node> ll = buckets[i];
            for (Node node : ll) {
                keys.add(node.key);
            }
        }
        return keys;
       }
       public boolean isEmpty(){
        return n == 0;
       }
        
    }
    public static void main(String[] args) {
        HashMap<String,Integer>hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String>keys = hm.keyset();
        for (String string : keys) {
           System.out.println(keys); 
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India")); 
    }
}*/

// LINKED HASHMAP -> Keys are insertion ordered
/*import java.util.*;
public class Hashing{
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm = new LinkedHashMap<>(); 
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        HashMap<String,Integer>hm = new HashMap<>(); 
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);
        System.out.println(lhm);

    }
}*/

// TREE MAp -> Keys are Sorted
/*import java.util.*;
public class Hashing{
    public static void main(String[] args) {
        TreeMap<String,Integer>thm = new TreeMap<>(); 
        thm.put("India", 100);
        thm.put("China", 150);
        thm.put("US", 50);
        thm.put("Indonesia", 6);

        HashMap<String,Integer>hm = new HashMap<>(); 
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);

        System.out.println(hm);
        System.out.println(thm);

    }
}*/


// Question -> Majority Element - 
/*import java.util.*;

public class Hashing{
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num, 1);
            }
            map.put(num, map.getOrDefault(num, 0)+1);
        }
      //  for (Integer key : map.keySet()) {
        Set<Integer> keyset = map.keySet();
        for (Integer key : keyset) {
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}*/


// Question - Valid Anagram
/*import java.util.*;

public class Hashing{
    public static boolean isAnangram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
       return map.isEmpty();
    }
    public static void main(String[] args) {
        String s = "tulip";
        String t = "lipid";

        System.out.println(isAnangram(s, t));
    }
}*/


// HASH SET - Operations
/*import java.util.*;

public class Hashing{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        System.out.println(set);

        set.remove( 2); 
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }else{
            System.out.println(false);
        }
        System.out.println(set);
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}*/

// Hash set - Iteration
/*import java.util.*;

public class Hashing{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for (String city: cities) {
            System.out.println(city);
        }
    }
}*/

// Linked HashSet - 
/*import java.util.*;

public class Hashing{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs  = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        System.out.println(lhs);
    }
}*/


// Tree Set - 
/*import java.util.*;

public class Hashing{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs  = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
    
        System.out.println(lhs);
        
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");

        System.out.println(ts);
    }
 }*/


// Count Distinct Element
/*import java.util.*;

public class Hashing{
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println("Ans = "+set.size());
    }
}*/


// Question -> Union & Intersection of 2 arrays - 
/*import java.util.*;

public class Hashing{
    public static int Union(int arr1[],int arr2[]){
        HashSet<Integer>set = new HashSet<>();
        
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return set.size();
    }
    public static int Intersection(int arr1[],int arr2[]){
        HashSet<Integer>set = new HashSet<>();
        
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count = 0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        
        System.out.println("Union = "+Union(arr1, arr2));
        System.out.println("Intersection = "+Intersection(arr1,arr2));
    }
}*/


// Question -> Find Itinerary from Ticket - 
/*import java.util.*;

public class Hashing{
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key),key);
        }
        for (String key : tickets.keySet()) {
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print (start);
        for (String key : tickets.keySet()) {
            System.out.print("->"+tickets.get(start));
            start = tickets.get(start);
        }
      System.out.println();
    }
}*/


// Largest Subarray with 0 sum .   
/*import java.util.*;

public class Hashing{
    public static void main(String[] args) {
        int arr[] = {15 , -2,2,-8,1,7,10,23};

        HashMap<Integer,Integer> map = new HashMap<>();
        // (sum,idx)
        int sum = 0;
        int len = 0;

        for(int j=0;j<arr.length;j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
       System.out.println("Largest subarray with sum as 0 = "+len);
    }
}*/


// Subarray Sum equal to K.
import java.util.*;

public class Hashing{
     public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer,Integer> map = new HashMap();
        // (sum.count)
        map.put(0,1);

        int sum = 0;
        int ans = 0;

        for(int j=0;j<arr.length;j++){
            sum += arr[j];
            if(map.containsKey(sum-k)){
              ans += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
    }
}
