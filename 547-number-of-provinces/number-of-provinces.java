class Solution {
    void dfs(int node,int[]vis,ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        //ans.add(node)
        for(int a: adj.get(node)){
            if(vis[a]==0){
                dfs(a,vis,adj);
            }
        }
    }
    public int findCircleNum(int[][] grid) {
        //convert grid to adj list
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>()); //creates empty adj list
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && i!=j){//i!=j diagonal.Any node is connected to itslef so no need to count that
                    adj.get(i).add(j); //insert connection in that particular idx i
                }
            }
        }
        //cnt number of dfs calls by user
        int cnt=0;
        int[] vis=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i,vis,adj);//function call by user
                cnt++;
            }
        }
        return cnt;
    }
}