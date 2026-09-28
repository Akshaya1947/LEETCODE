class Solution {
    public int maxDepth(String s) {
        int d=0;
        int max=0;
        for(char c:s.toCharArray()){
            //if there is an opening bracket increase the depth by one and update the max if there is closing bracket decrease the depth,we have to only return max nested paranthesis
            if(c=='(')max=Math.max(max,++d);
            if(c==')')d--;
        }
        return max;
    }
}