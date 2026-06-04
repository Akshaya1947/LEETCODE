/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
           c++;
           temp=temp.next;
        }
        int d=(c/2);
        ListNode temp1=head;
       for(int i=0;i<d;i++){
        temp1=temp1.next;
       }
       return temp1;
        //N+N/2 = O(N)
    }
}