class Solution {
    boolean f(int i,int j, String s,String p, int [][]dp){
        //inga dp ah direct ah return panamudiyathu so ans nu bool la return panrom
        if(i==s.length()){
            while(j<p.length() && p.charAt(j)=='*')j++;//s=abd p=a*c ipo j++ pani next element iruka nu pakurom suppose irunthuchu na false ilana true (see down)
            if(j==p.length()) return true;
            return false;
        }
        boolean ans;
        if(j==p.length())return false;// s=aa,p=a 
        if(dp[i][j]!=-1)return dp[i][j]==1;
        if(s.charAt(i)==p.charAt(j)){
            ans=f(i+1,j+1,s,p,dp);//same ah iruntha next element ku move panlam
        }
        else{
            if(p.charAt(j)=='?') ans=f(i+1,j+1,s,p,dp);//? iruntha single element ah replace panikalam
            else if(p.charAt(j)=='*')  ans = f(i+1,j,s,p,dp)|| f(i,j+1,s,p,dp);
            // if suppose s=abd,p=a*c you have to return false because * replace b but d and c are not equal 
            //if it was s=abd , p=a* return true; because * replace bd; 
            else return ans=false;//not same and also no *, ? so return false
        }
         dp[i][j]= ans? 1:0;
        return ans;
    }

    public boolean isMatch(String s, String p) {
        int n=s.length(),m=p.length();
        int [][]dp = new int[n+1][m+1];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        boolean ans = f(0,0,s,p,dp);
        return ans;
    }
}