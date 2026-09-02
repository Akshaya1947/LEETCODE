class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0 || head.next==null){
            return head;
        }
        ListNode tail=head;
        int n=1;
        while(tail.next!=null){
            tail=tail.next;
            n++;
        }
        tail.next=head;
         k= k%n;
        int cnt=n-k-1;
        ListNode newtail=head;
        for(int i=0;i<cnt;i++){
            newtail=newtail.next;
        }
       ListNode newhead=newtail.next;
       newtail.next=null;

       return newhead;
    }
}