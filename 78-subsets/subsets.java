class Solution {
    void f(int i,List<Integer> temp,int [] nums,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));//here temp ah staright add pan mudiyathu because so object create panni add panrom
            return ;//to return back.backtrack
        }
        //notpick
        f(i+1,temp,nums,ans);
        //pick
        temp.add(nums[i]);
        f(i+1,temp,nums,ans);
        temp.remove(temp.size()-1);//backtrack panum bothu last element element ah remove panrathuku
    }
    public List<List<Integer>> subsets(int[] nums) {
             List<List<Integer>>ans =new ArrayList<>();
         List<Integer>temp=new ArrayList<>();//we are using list data structure
        f(0,temp,nums,ans);
        return ans;
    
    }
}