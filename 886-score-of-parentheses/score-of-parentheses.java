class Solution {
    public int scoreOfParentheses(String s) {
        int depth=0,score=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
            }else {
            depth--;
            if(s.charAt(i-1)=='('){
                score +=1<<depth;
            }
            }
        }
            return score;

    }
}
//()() - 1+1 
//nested ah iruntha (())- (A) has score 2 * A, where A is a balanced parentheses string.
//((()))- 1*2=2*2=4 (ans is 4
//(((()))) ithoda nas 8; 1*2=2*2=4*2=8 
//--- intha 3 tha we have to find because 2^3=8
// depth ah vaichu find the answer
//if current is ')' previous paranthesis oru '(' ah iruntha tha we get a pair
//apdi iruntha 2^depth 