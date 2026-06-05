/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int getlength(ListNode head){
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //s1->lena and lenb : diff = lenA-lenB
        int lenA=getlength(headA);
        int lenB=getlength(headB);
        int diff= lenA-lenB;
        //if diff is positive you have to move the a pointer if negative you have to move the b pointer 
        ListNode tempA=headA, tempB=headB;
        if(diff>0){
            while(diff>0){
                tempA=tempA.next;
                diff--;
            }
        }else{
            while(diff<0){
                tempB=tempB.next;
                diff++;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}