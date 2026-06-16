class Solution {
    void dfs(int r,int c,int[][]vis,char[][]grid){
        vis[r][c]=1;
        //explore the four direction
        int[]drow={-1,0,1,0};
        int []dcol={0,+1,0,-1};
        for(int i=0;i<4;i++){
            int nrow=r+drow[i];
            int ncol=c+dcol[i];
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0){
                dfs(nrow,ncol,vis,grid);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length,m=grid[0].length;
        int [][]vis=new int[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){//i dont want to visit 0 in the grid..que itself given count no of island.island is denoted as 1 so call dfs when it is 1 and it should not be already visited
                dfs(i,j,vis,grid);
                cnt++;
            }
        }
    }
     return cnt;

    }
}