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
        //check for empty or single node list
        if(head==null || head.next==null){  
             return true;
        }
        
        //Find the mid of the list and store it in a node
        ListNode slow = head, fast = head, newHead = null;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head1 = slow.next;
        slow.next = null;
        
        //Reverse the half list
        newHead = reverse(head1);
        
        //compare the first half and second half
        while(newHead != null){
            if(newHead.val != head.val){
                return false;
            }
            newHead = newHead.next;
            head = head.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
        if(head==null || head.next ==null){
            return head;
        }
        ListNode prev = null, forw = null, curr = head;
        while(curr != null){
            //prev = curr;
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
}