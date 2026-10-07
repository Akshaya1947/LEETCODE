class Solution {
    Set<String> valid = new HashSet<>();//unique aana valid string venum
    public List<String> removeInvalidParentheses(String s) {
        dfs(s,0,0,new StringBuilder());
        int maxlen=0;
        for(String str: valid){
            maxlen=Math.max(maxlen,str.length());
        }
        List<String> ans = new ArrayList<>();
        for(String str:valid){
            if(str.length()==maxlen){
                ans.add(str);
            }
        }
        return ans;
    }
    void dfs(String s,int i,int balance,StringBuilder curr){
        if(balance<0){
            return;
        }
        if(i==s.length()){
            if(balance==0){
                valid.add(curr.toString());
            }
            return;
        }
        char ch=s.charAt(i);
        if(ch != '(' && ch != ')'){
            curr.append(ch);//lowercase char vantha append
            dfs(s,i+1,balance,curr);
            curr.deleteCharAt(curr.length()-1);
        }else{
            curr.append(ch);
            if(ch=='('){
                dfs(s,i+1,balance+1,curr);
            }else{
                dfs(s,i+1,balance-1,curr);
            }
            curr.deleteCharAt(curr.length()-1);
            dfs(s,i+1,balance,curr);
        }
    }
}
//use take not take method
// -1 -> return
//take -> '(' -> d++; ')' -> d--;
//'a'-> append
//end -> we take values with depth =0, 
//return only the max length string from valid string
//O(2^n) -> n->levels 