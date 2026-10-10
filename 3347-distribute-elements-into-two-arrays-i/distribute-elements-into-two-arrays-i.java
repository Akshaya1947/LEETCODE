class Solution {
    public int[] resultArray(int[] nums) {
       int n=nums.length;
       //two list venum
       List<Integer>list1=new ArrayList<>(); 
       List<Integer>list2=new ArrayList<>(); 
       list1.add(nums[0]);
       list2.add(nums[1]);
       for(int i=2;i<n;i++){
        if(list1.get(list1.size()-1)>list2.get(list2.size()-1)){
            list1.add(nums[i]);
        }else list2.add(nums[i]);
       }
       int k=0;
       for(int i=0;i<list1.size();i++){
        nums[k]=list1.get(i);
        k++;
       }
       for(int i=0;i<list2.size();i++){
        nums[k]=list2.get(i);
        k++;
       }
       return nums;
    }
}
//first ele ah first array la podanum,second element ah second array la podanum, next array1 la iruka last element array 2 oda last elem vida greater ah iruntha , (2>1)[here 2 is array1 ele, 1 is array2 elem] third element ah first array la podanum
//final ah concadenate pananum