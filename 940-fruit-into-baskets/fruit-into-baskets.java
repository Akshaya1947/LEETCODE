class Solution {
    public int totalFruit(int[] f) {
        int l=0,maxLen=0;
        HashMap<Integer,Integer> mp=new HashMap<>();//creating a hashmap
        for(int r=0;r<f.length;r++){
            mp.put(f[r],mp.getOrDefault(f[r],0)+1);//add the element into hashmap 
            while(mp.size()>2){//check the size of hashmap it is greater than two which means it has more than two distinct elements shrink the window and reduce its freq by 1
                mp.put(f[l],mp.get(f[l])-1);
                if(mp.get(f[l])==0){// if the freq of the element is zero remove the element from hashmap
                    mp.remove(f[l]);
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}