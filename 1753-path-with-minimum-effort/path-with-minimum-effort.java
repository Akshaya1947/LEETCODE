class Tuple{
    int row;
    int col;
    int wt;
    Tuple(int row,int col,int wt){
        this.row=row;
        this.col=col;
        this.wt=wt;
    }
}
class Solution {
    public int minimumEffortPath(int[][] h) {
        int n=h.length,m=h[0].length;
        int [][]dist = new int [n][m];
        for(int []row: dist){
            Arrays.fill(row,(int)1e9);//everything fill with infinity;
        }
          PriorityQueue<Tuple> q= new PriorityQueue<>((a,b)->a.wt-b.wt);//sorting in ascending order
          q.offer(new Tuple(0,0,0));
          dist[0][0]=0;
          int [] drow={-1,0,1,0};
          int [] dcol={0,-1,0,+1};//up,left,down,right
          while(!q.isEmpty()){
            Tuple t = q.poll();
            int r=t.row;
            int c= t.col;
            int wt= t.wt;
            if(r==n-1 && c==m-1)return wt;
            for(int i=0;i<4;i++){//4 direction
              int nrow= r+drow[i];
              int ncol= c+dcol[i];
              if(nrow>=0 && nrow<n && ncol>=0 && ncol<m){//if it is true you can go to that position
                int diff = Math.abs(h[r][c]-h[nrow][ncol]);//calculate the difference
                int effort= Math.max(diff,wt);//the effort is the max of diff and wt
                if(effort<dist[nrow][ncol]){
                    dist[nrow][ncol]= effort;
                    q.offer(new Tuple(nrow,ncol,effort));//add it to the queue
                }
              }
            }

          }
          return -1;//if your not able to reach return -1 obviously you reach but this is only for compilation purpose
    }
}