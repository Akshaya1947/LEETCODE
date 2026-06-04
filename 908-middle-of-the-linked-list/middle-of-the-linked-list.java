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
    //     ListNode temp=head;
    //     int c=0;
    //     while(temp!=null){
    //        c++;
    //        temp=temp.next;
    //     }
    //     int d=(c/2);
    //     ListNode temp1=head;
    //    for(int i=0;i<d;i++){
    //     temp1=temp1.next;
    //    }
    //    // using while loop 
    //    //while(d>0){ temp1=temp1.next ; d--;
    //    //}
    //    //return temp1 
    //    return temp1;
    //     //N+N/2 = O(N)
   ListNode slow=head;
   ListNode fast=head;
   while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
   }
   return slow;
    }
}