class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int h=n/2;
        long score =0;
        for(int i=0;i<n;i++){
            if(i<h){
                score -=nums[i];
            }else score +=nums[i];
        }
        return score;
    }
}
//even position la add pananum, odd position la substract pananum
//large number la add pani small number ah substract panna max value varum so first array va sort pananum ,the split the array into two , left half la substract panitu, rigth half la add panlam
// square all the numbers,sort,half(split),ifi<n/2 sub else add