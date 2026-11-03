class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int c=0;
        max=nums[0];
        for(int i=1;i<nums.length;i++){
             if(nums[i]>max){
                max=nums[i];
             }
        }
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=max){
                nums[i]=nums[i]+1;
                c++;
            }
        }
        return c;
    }
}