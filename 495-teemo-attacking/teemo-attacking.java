class Solution {
    public int findPoisonedDuration(int[] t, int d) {
        int tot=0;
        for(int i=0;i<t.length-1;i++){// 1 //for 4 the loop terminates 
          tot+=Math.min(t[i+1]-t[i],d); //tot = 0+min(4-1,2) = 0+2 =2 
        }
          if(t.length>0)tot+=d;//2>0 tot = 2+2 =4
        return tot;
    }
}