class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode s= new ListNode();
        ListNode b= new ListNode();
        ListNode small=s;
        ListNode big=b;
        while(head!=null){
            if(head.val<x){
                small.next=head;
                small=small.next;
            }
            else{
                big.next=head;
                big=big.next;
            }
            head=head.next;
        }
        small.next=b.next;
        big.next=null;

        return s.next;
    }
}