import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Question_6{
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];
        q.add(source);
        while(!q.isEmpty()){
            int node = q.poll();
            if(node==destination){
                return true;
            }
            for(int neighbours:adj.get(node)){
                if(vis[neighbours]==false){
                    q.add(neighbours);
                    vis[neighbours]=true;
                }
            }

        }
       return false;
    }

    public static void main(String[] args){
      int n = 3;
      int[][] edges = {{0,1},{1,2},{2,0}};
      int source = 0;
      int destination = 2;
      Question_6 q6 = new Question_6();
      System.out.println(q6.validPath(n,edges,source,destination));
    }
}

