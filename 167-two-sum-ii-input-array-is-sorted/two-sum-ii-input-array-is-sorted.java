// class Solution {
//     public int[] twoSum(int[] num, int target) {
//         Arrays.sort(num);
//         for(int i=0;i<num.length;i++){
//             if(i>0 && num[i]==num[i-1]) continue;
//             for(int j=i+1;j<num.length;j++){
//                 if(j>i+1 && num[j]==num[j-1]) continue;
//                 if(num[i]+num[j]==target){
//                     return new int[]{i+1,j+1};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }

class Solution {
    public int[] twoSum(int[] num, int target) {
        int l=0;
        int r=num.length-1;
        while(l<r){
            int sum=num[l]+num[r];
            if(sum==target) return new int[]{l+1,r+1};
            else if(sum<target) l++;
            else r--;
        }
        return new int[]{};
    }
}