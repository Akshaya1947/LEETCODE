class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        //this will reverse the second half

        while (second != null) {
            //for ex:4->5
            ListNode next = second.next;//next = 5
            second.next = prev;//5 ku iruka place ah prev pointer irukum 
            prev = second;//4->4
            second = next;//5->4
        }

           //merging the list
        ListNode first = head;
        second = prev;
      //1->2->3   5->4
                //second
        while (second != null) {
            ListNode firstNext = first.next;//fn=2
            ListNode secondNext = second.next;//sn=4
            first.next = second; //1->5
            second.next = firstNext;//1->5->2
            first = firstNext;//2->3   4
            second = secondNext;//     second
        }
    }
}