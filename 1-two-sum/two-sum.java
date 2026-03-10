class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res=new int[2];
        Map<Integer, Integer> hs= new HashMap<>();//creating a hashamp
        //nums=[10,20,30,40,50] 
        //target=80
        for(int i=0;i<nums.length;i++){
            int b = target - nums[i];//in map or not
            if(hs.containsKey(b)){//checking if it is in map 
                res[0]=hs.get(b);//hashmap index
                res[1]=i;//index of currently pointing number 
                return res;
            }
            else
            hs.put(nums[i],i);//adding it to the hashmap
        }
        return res;
    }

}