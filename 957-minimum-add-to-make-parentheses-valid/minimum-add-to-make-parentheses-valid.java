class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0,o=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                o++;
            }else {
                if(o>0){
                    o--;
                }else
                ans++;
            }
        }
//ipo o zero ah va iruka nu pakanum if not add the 'o' value to answer and return ans
if(o==0){
    return ans;
}return ans+o;
        
    }
}
//open bracket irundha increment 'o' n if you see the close bracket decrement the 'o' only if o>0, suppose 'o' zero va irundha add 1 to the answer
//final ah'o' zero va iruntha tha valid paranthesis
//tc: o(n),sc:o(1)