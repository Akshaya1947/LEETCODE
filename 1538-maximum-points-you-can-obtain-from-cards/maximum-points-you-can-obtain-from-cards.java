class Solution {
    public int maxScore(int[] c, int k) {
        int sum=0;
        for(int i=0;i<=k-1;i++){
            sum+=c[i];
        }
        int l=k-1,r=c.length-1;
        int max=sum;
        while(l>=0){
            sum-=c[l];
            sum+=c[r];
            l--;
            r--;
            max=Math.max(max,sum);
        }
        return max;
    }
}