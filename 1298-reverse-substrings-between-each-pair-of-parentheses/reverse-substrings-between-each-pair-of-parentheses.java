class Solution {
    public String reverseParentheses(String s) {
    //string are immutable so use the string builder so using the string builder function we can reverse replace   
    StringBuilder sb = new StringBuilder(s);
    for(int i=0;i<sb.length();i++)//nested paranthesis given so how to find inner most? -> entha closing bracket first varutho athu tha inner most, so have to find the closing paranthesis
    {
        if(sb.charAt(i)==')'){//closing paranthesis oda index ah first eadukanum
            int end = i;
            //inthoda respective opening paranthesis ah kandu pudikanum
            //lastindex() use panna backward poi namma solrathu ah find pannum
            int start=sb.lastIndexOf("(",end);//from end la iruntha thana backward ponum so end
            //ipo starting and ending index kidaiduchu then have to reverse the substring
            String mid = sb.substring(start+1,end );//paranthesis ku adutha index la tha word start aagum so +1,  end index ku munadi varaikum pogum so -1
            String rev = new StringBuilder(mid).reverse().toString();
            sb.replace(start,end+1,rev);//end+1 kudutha tha end index varaikum nadakum // ipo ena aagum antha paranthesis kula iruka string ah reverse  panni replace panitom
            //ipo naa rendu paranthesis ah remove pani irupan apo stringbuilder oda size decrese aaagi irukum by 2 
            i-=2;
        }
    }
    return sb.toString();
    }
}
//(u(love)i)
//1. (uevoli) 2.iloveu