/**class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int l=0;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        int pos=l-n+1;
        //delete pos ele from front
        if(pos==1) return head.next; //n-l+1 =>10-10+1 = 1 st ele you need to remove so return head.next.from second ele it will printii
        temp=head;
        ListNode prev=null;
        while(pos - 1 >0){
            prev=temp;
            temp=temp.next;
            pos--;
        }
        prev.next=temp.next;
        return head;
    }
}
**/
//another solution
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1=head,p2=head;
        for(int i=0;i<n;i++){
            p2=p2.next;
        }
        if(p2==null)return head.next;
        while(p2.next !=null){
            p1=p1.next;
            p2=p2.next;
        }
        p1.next=p1.next.next;
        return  head;
    }
}