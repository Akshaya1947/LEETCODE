class Solution {
    public int minInsertions(String s) {
        int open=0,ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')open++;
            else{
                //make '))'
                if(i+1<s.length() && s.charAt(i+1) ==')')i++; //ipo rendu )) bracket iruntha next index poidum 
                else ans++;//ilana oru closing bracket venum nu ans la +1 panrom
                  
                //find its '('
                if(open>0)open--; //ipo closing bracket iruku athuku munadi opening bracket iruka nu pakurom iruntha open--
                else ans++;//suppose ilana opening bracket venum nu ans la +1 panrom
            }
        }
            return ans+open*2;
        }
    
}