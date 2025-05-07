import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BFS{

  public ArrayList<Integer> BfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){

    ArrayList<Integer> bfs = new ArrayList<>();
    boolean[] v = new boolean[V];
    Queue<Integer> q = new LinkedList<>();

    q.add(0);
    v[0]=true;

    while(!q.isEmpty()){

      Integer node = q.poll();
      bfs.add(node);

      for(Integer i: adj.get(node)){
        if (v[i]==false){
          v[i]=true;
          q.add(i);
        }
      }

    }
    return bfs;
  }

  public static void main(String[] args){

    int V = 5;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    // Initialize the adjacency list
    for (int i = 0; i < V; i++) {
      adj.add(new ArrayList<>());
    }

    // Add edges (example: undirected graph)
    adj.get(0).add(1);
    adj.get(0).add(2);
    adj.get(1).add(0);
    adj.get(1).add(3);
    adj.get(2).add(0);
    adj.get(2).add(4);
    adj.get(3).add(1);
    adj.get(4).add(2);

    BFS bfs= new BFS();
    ArrayList<Integer> bfsResult = bfs.BfsOfGraph(V, adj);

    System.out.println("BFS Traversal: " + bfsResult);

  }

}

