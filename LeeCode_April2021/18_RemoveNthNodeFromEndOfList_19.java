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
        if(n==0 || head==null) return head;
        if(n==1 && head.next==null) return null;
        ListNode fir = head, sec = head;
        int count = 0;
        while(count < n){
            fir = fir.next;
            count++;
        }
        if(fir == null){
            return head.next;
        }
        while(fir != null && fir.next != null){
            fir = fir.next;
            sec = sec.next;
        }
        sec.next = sec.next.next;
        return head;
    }
}