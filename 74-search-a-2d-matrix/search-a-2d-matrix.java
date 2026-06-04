class Solution {
    public boolean searchMatrix(int[][] grid, int t) {
        int n=grid.length,m=grid[0].length;// to find the length of the row 
        int l=0,h=n-1,row=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(t>=grid[mid][0] && t<=grid[mid][m-1]){
                row=mid;
                break;
            }else if(t<grid[mid][0]) h=mid-1;
            else l=mid+1;
        }
        int lo=0,hi=m-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(grid[row][mid]==t) return true;
            else if(t<grid[row][mid]) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
}