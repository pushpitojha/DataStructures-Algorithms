class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode head1 = null, head2 = null;
        ListNode tail1 = null, tail2 = null;
        while(head!=null){
            if(head.val < x){
                if(head1==null){
                    head1 = head;
                    tail1 = head;
                }else{
                    tail1.next = head;
                    tail1 = head; 
                }
            }
            else{
                if(head2==null){
                    head2 = head;
                    tail2 = head;
                }else{
                    tail2.next = head;
                    tail2 = head; 
                }
            }
            head = head.next;
        }
        if(tail2!=null){
            tail2.next = null;
        }
        if(tail1!=null){
            tail1.next = head2;
            return head1;
        }
        return head2;
    }
}