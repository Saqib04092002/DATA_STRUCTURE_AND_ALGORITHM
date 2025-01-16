/*
 Question 1 :
 Mother Vertex
 We have a Directed Graph , find a Mother Vertex in the Graph (if present).A Mother Vertex is a vertex 
 through which we can reach all the other vertices of the Graph.

 */
/*import java.util.*;
public class Assigniment_25_Graph2 {
    public boolean canFinish(int n,int [][] per){
        boolean visited[] = new boolean[n];
        boolean helper[] = new boolean[n];
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
    }
       
}*/
/*
 Question 2 :
 Union-Find
 Here implement Union-Find Algorithm to check whether an undirected graph contains cycle or not.
 */
/*import java.util.*;

import javax.lang.model.type.ArrayType;
public class Assigniment_25_Graph2 {
    public static class{
        int src;
        int dest
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
           
        }
    }
    public static void Creatgraph(ArrayList<Edge>edges){
     edges.add(new Edge(0, 1));
     edges.add(new Edge(0, 2));
     edges.add(new Edge(0, 3));
     edges.add(new Edge(1, 3));
     edges.add(new Edge(2, 3));
    }

    static int n = 4;
     static int par[] = new int [n];
     static int rank[] = new int [n];

     public static void init(){
        for(int i=0;i<n;i++){
            par[i] = i;
        }
     }
     
     public static int find(int x){
        if(par[x]==x){
            return x;
        }
        return par[x] =  find(par[x]);
     }

     public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] =parA;
            rank[parA]++;
        }else if(rank[parA]<rank[parB]){
            par[parA] = parB;
          
        }else {
            par[parB] = parA;
         
        }
}
publ
}
public static void main(String[] args) {
    init();
    int V = 4;
    ArrayList<Edge> edges = new ArrayList<>();
    Creatgraph(edges);
    kruskalsMST(edges, V);
  }
}*/
