class Solution {
    public void rotate(int[] nums, int k) {
      if(k==nums.length || nums.length==1 || nums==null)return ;
      if(k>nums.length)k=k%nums.length;
      int left=0,right = nums.length-1-k, nextLeft = right+1;
      while(left<right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
      }  
      right=nums.length-1;
      while(nextLeft <right){
        int temp=nums[nextLeft];
        nums[nextLeft]=nums[right];
        nums[right]=temp;
        nextLeft++;
        right--;
      }
      left=0;
      right=nums.length-1;
      while(left<right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
      }


    }
}