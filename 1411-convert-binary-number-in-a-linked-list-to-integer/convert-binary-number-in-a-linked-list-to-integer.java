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
    public int getDecimalValue(ListNode head) {
        int a=0;
        int i=-1;
        ListNode demo=head;
        while(head!=null){
            i++;
            head=head.next;
        }
        while(demo!=null){
            System.out.println(i);
            a+=(demo.val*Math.pow(2,i--));

            demo=demo.next;
        }
        return a;
    }
}