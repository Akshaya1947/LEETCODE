class Solution {
    void f(int open,int close, StringBuilder s,int n, List<String>ans){
        if(open==n && close ==n){//if the opening and closing brackets become equal to one
            ans.add(s.toString());
            return ;
        }
        if(open<n){
            s.append('(');
            f(open+1,close,s,n,ans);
            s.deleteCharAt(s.length()-1);//for backtracking
        }
        if(open>close && close<n){
            s.append(')');
            f(open,close+1,s,n,ans);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder s = new StringBuilder("");
        List<String> ans = new ArrayList<>();
        f(0,0,s,n,ans);
        return ans;
    }
}
