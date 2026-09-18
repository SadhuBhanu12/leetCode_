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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode head1=head;
        while(head1!=null){
            head1=head1.next;
            count++;
        }
          if (n == count) {
            return head.next;
        }
        int sec_count=0;
        ListNode root=head;
        while(head.next!=null){
            if(sec_count==count-n-1){
                head.next=head.next.next;
                break;
            }
            else{
                sec_count++;
                head=head.next;
            }
        }
        return root;
    }
}