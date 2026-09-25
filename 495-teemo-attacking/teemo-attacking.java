class Solution {
    public int findPoisonedDuration(int[] t, int d) {
        int tot=0;
        for(int i=0;i<t.length-1;i++){
          tot+=Math.min(t[i+1]-t[i],d);
        }
          if(t.length>0)tot+=d;
        return tot;
    }
}