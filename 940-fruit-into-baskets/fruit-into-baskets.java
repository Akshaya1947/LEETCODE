class Solution {
    public int totalFruit(int[] f) {
        int l=0,maxLen=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int r=0;r<f.length;r++){
            mp.put(f[r],mp.getOrDefault(f[r],0)+1);
            while(mp.size()>2){
                mp.put(f[l],mp.get(f[l])-1);
                if(mp.get(f[l])==0){
                    mp.remove(f[l]);
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}