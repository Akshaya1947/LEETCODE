class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boatused=0;
        int left=0;
        int right=people.length-1;
        while(left<=right){
            boatused+=1;
            if(people[left]+people[right]<=limit)//suppose intha condition fail aachu na high weight ah iruka person that means the right pointer la iruka person ahh matum move panrom
                left+=1;
                right-=1;
        }
            return boatused;
        
    }
}