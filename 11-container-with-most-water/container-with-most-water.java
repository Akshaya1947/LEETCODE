class Solution {
    public int maxArea(int[] h) {
        int i=0,j=h.length-1,maxi=0;
        while(i<j){
            int curr=Math.min(h[i],h[j])*(j-i);
            maxi=Math.max(maxi,curr);
            if(h[i]<h[j])i++;
            else j--;
    }
    return maxi;
    }
}