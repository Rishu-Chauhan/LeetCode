class Solution {
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
        int color[]=new int[V];
        for(int i=0;i<V;i++){
            color[i]=-1;
        }
        Queue<Integer> q=new LinkedList<>();
        
       for(int i=0;i<V;i++){
           if(color[i]==-1){
        q.add(i);
        color[i]=0;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int neigh:graph[node]){
                            if (color[neigh] == -1) {
                             color[neigh] = (color[node] + 1) % 2; 
                                q.add(neigh);
                           } else if (color[node] == color[neigh]) { 
                                return false;
                            }
                }
                 }
            }
        }
       
       
        return true;
    }
}