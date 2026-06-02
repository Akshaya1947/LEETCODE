class Solution {
    public int calPoints(String[] o) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<o.length;i++){
            if(o[i].equals("D")){
                st.push(st.peek()*2);
            }else if(o[i].equals("C")){
                st.pop();
            }else if(o[i].equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }else{
                st.push(Integer.parseInt(o[i]));
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}