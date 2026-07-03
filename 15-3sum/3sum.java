class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {//if the i has same value as before you dont need to check so move to the next value
            //eg:-2,-2,-1,0 ipo -2 repeat agi iruku la apo i=0 j=2 apo [-2,-1,0] and i=1 j=1 nalum[-2,-1,0]same value to avoid this we used that condition
                continue;
            }
            
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                //total enaku 0 list la add panitu(to avoid duplicates) ipo epdi i ku check panom athae maari j ku panaum
                //k ku panaum then move both pointer to find next pair
                if(total==0){
                     res.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j<k && nums[j] == nums[j+1] )    j++;
                    while(j<k && nums[k]==nums[k-1])k--;
                    j++;
                    k--;
                }
                   // total =1 apo na value ah kami pananum so [sorted array] array oda last element has highest value so last pointer ah front la move panna tha value kami aagum la
                else if (total > 0) {
                    k--;
                    //total = -1 na total ah increase pananum apo j pointer ah move pananum la
                } else  {
                    j++;
                
                    
                }
            }
        }
        return res;        
    }
}