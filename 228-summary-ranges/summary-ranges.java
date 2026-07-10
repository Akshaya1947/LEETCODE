class Solution {
    public List<String> summaryRanges(int[] nums) {
      List<String>ans=new ArrayList<>();
      int i=0;
      while(i<nums.length)  {
        int start=nums[i];
        while(i+1<nums.length && nums[i+1]==nums[i]+1){// if suppose 0,1,2,3 na ipo 0 la irukan enoda next num yum 1 athae maari 0+1=1 apo consecutive ahh iruku apo next element ku iterate aaguthu
            i++;
        }//intha loop epo break aagum na when the i went to last element or no consecutive numbers
        if(start==nums[i]){//suppose ipdi iruntha 0,3,4 enoda i 0 la iruntha consecutive ah ila apo enoda start yum nums[i] yum same la so atha apdiyae add panrom ans la
            ans.add(String.valueOf(start));
        }else{
            ans.add(start + "->" + nums[i]);
        }
      i++;
      }
      return ans;
    }
}