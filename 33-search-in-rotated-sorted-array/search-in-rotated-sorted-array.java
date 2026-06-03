class Solution {
    public int search(int[] nums, int t) {
        int l=0,h=nums.length-1;
       while(l<=h){
        int mid=(l+h)/2;
        if(nums[mid]==t) return mid;
        //check if left is sorted
        if(nums[l]<=nums[mid]){
            //left is sorted
            if(t>=nums[l] && t<nums[mid]){
                //target is in left half->discard right
                h=mid-1;
            }else{
                //target is in right -> discard left
                l=mid+1;
        }
       }else{//right hal is sorted
        if(t>nums[mid] && t<=nums[h]){
            //target is in right ->discard left
            l=mid+1;
        }else{
            //target is in left->discard right
            h=mid-1;
        }
       }
    }
    return -1;
}
}