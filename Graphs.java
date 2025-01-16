// Creating graphs - 

/*import java.util.*;
public class Graphs {
    public static class Edge{
        int src;
        int dest;
        int wt ; 
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;

        }
    }
    public static void main(String[] args) {
   /*        (5)
          0-------1
                 / \ 
           (1)  /   \(3)
               /     \
              2------ 3
              |   (1)
          (2) |
              |
              4 
     */

     /*int v = 5;
     ArrayList<Edge>[] graph = new ArrayList[v];

     for(int i=0 ; i<v ; i++){
        graph[i] = new ArrayList<>();
     }
     // 0 - Vertex
     graph[0].add(new Edge(0, 1, 5));

     // 1 - Vertex
     graph[1].add(new Edge(1, 0, 5));
     graph[1].add(new Edge(1, 2, 1));
     graph[1].add(new Edge(1, 3, 3));

     // 2 - Vertex
     graph[2].add(new Edge(2, 1,1));
     graph[2].add(new Edge(2, 3,1));
     graph[2].add(new Edge(2, 4,2));

     // 3 - Vertex
     graph[3].add(new Edge(3, 2,1));
     graph[3].add(new Edge(3, 1,3));

     // 4 - Vertex
     graph[4].add(new Edge(4, 2,2));


     // 2's neighbors 
     for(int i=0;i<graph[2].size();i++){
        Edge e = graph[2].get(i);
        System.out.println(e.dest);
     }
    }
}*/
// BFS 
/*import java.util.*;
public class Graphs {
    
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
        this.src = s;
        this.dest = d;
        this.wt = w;
        }
    }
    public static void CreatGraph(ArrayList<Edge> graphs[]){
            for(int i=0;i<graphs.length;i++){
            graphs[i] = new ArrayList<>();
        }
        // 0 - Vertex
        graphs[0].add(new Edge(0, 1, 1));
        graphs[0].add(new Edge(0, 2, 1));
        // 1 - vertex
        graphs[1].add(new Edge(1, 0, 1));
        graphs[1].add(new Edge(1, 3, 1));
        // 2 - vertex
        graphs[2].add(new Edge(2, 0, 1));
        graphs[2].add(new Edge(2, 4, 1));
        // 3 - vertex
        graphs[3].add(new Edge(3, 1, 1));
        graphs[3].add(new Edge(3, 4, 1));
        graphs[3].add(new Edge(3, 5, 1));
        // 4 - vertex
        graphs[4].add(new Edge(4, 2, 1));
        graphs[4].add(new Edge(4, 3, 1));

        graphs[5].add(new Edge(5, 6, 1));
        graphs[6].add(new Edge(6, 5, 1));
    }
    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer>q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0); // Source = 0

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.println(curr+" ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
        public static void main(String[] args) {
            int v = 7;
            ArrayList<Edge> graph[] = new ArrayList[v];
            CreatGraph(graph);
            bfs(graph);
        }
   }*/

// DFS
/*
import java.util.*;
public class Graphs {
    
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
        this.src = s;
        this.dest = d;
        this.wt = w;
        }
    }
    public static void CreatGraph(ArrayList<Edge> graphs[]){
            for(int i=0;i<graphs.length;i++){
            graphs[i] = new ArrayList<>();
        }
        // 0 - Vertex
        graphs[0].add(new Edge(0, 1, 1));
        graphs[0].add(new Edge(0, 2, 1));
        // 1 - vertex
        graphs[1].add(new Edge(1, 0, 1));
        graphs[1].add(new Edge(1, 3, 1));
        // 2 - vertex
        graphs[2].add(new Edge(2, 0, 1));
        graphs[2].add(new Edge(2, 4, 1));
        // 3 - vertex
        graphs[3].add(new Edge(3, 1, 1));
        graphs[3].add(new Edge(3, 4, 1));
        graphs[3].add(new Edge(3, 5, 1));
        // 4 - vertex
        graphs[4].add(new Edge(4, 2, 1));
        graphs[4].add(new Edge(4, 3, 1));

        graphs[5].add(new Edge(5, 6, 1));
        graphs[6].add(new Edge(6, 5, 1));
    }
    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){
        // visit
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }

    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        CreatGraph(graph);
        dfs(graph,0,new boolean[v]);
    }
}*/

// Question - Has Path
/*import java.util.*;
public class Graphs {
    
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
        this.src = s;
        this.dest = d;
        this.wt = w;
        }
    }
    public static void CreatGraph(ArrayList<Edge> graphs[]){
            for(int i=0;i<graphs.length;i++){
            graphs[i] = new ArrayList<>();
        }
        // 0 - Vertex
        graphs[0].add(new Edge(0, 1, 1));
        graphs[0].add(new Edge(0, 2, 1));
        // 1 - vertex
        graphs[1].add(new Edge(1, 0, 1));
        graphs[1].add(new Edge(1, 3, 1));
        // 2 - vertex
        graphs[2].add(new Edge(2, 0, 1));
        graphs[2].add(new Edge(2, 4, 1));
        // 3 - vertex
        graphs[3].add(new Edge(3, 1, 1));
        graphs[3].add(new Edge(3, 4, 1));
        graphs[3].add(new Edge(3, 5, 1));
        // 4 - vertex
        graphs[4].add(new Edge(4, 2, 1));
        graphs[4].add(new Edge(4, 3, 1));

        graphs[5].add(new Edge(5, 6, 1));
        graphs[6].add(new Edge(6, 5, 1));
    }
    public static boolean haspath(ArrayList<Edge>[]graph,int src,int dest,boolean vis[]){
        if(src == dest){
            return  true;
        }
        vis[src] = true;
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && haspath(graph, e.dest, dest, vis)){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        CreatGraph(graph);
       System.out.println( haspath(graph, 0, 5, new boolean[v]));   
    }
}*/

