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
    public boolean isPalindrome(ListNode head) {
        ListNode rev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode new1=new ListNode(curr.val);
            new1.next=rev;
            rev=new1;
            curr=curr.next;
        }
        while(rev!=null && head!=null){
            if(rev.val!=head.val)return false;
            rev=rev.next;
            head=head.next;
        }
        return true;
    }
}