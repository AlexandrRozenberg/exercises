package exercises.leedcode.task83;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class Solution {
        public ListNode deleteDuplicates(ListNode head){
            if (head == null)
                return null;

            ListNode current = head;
            while(current.next != null){
                if (current.val == current.next.val){
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
        }
}
