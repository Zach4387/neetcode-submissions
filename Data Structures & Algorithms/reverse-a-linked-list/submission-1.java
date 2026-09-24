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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode last = null;
        
        
        //  0 -> 1  ,2,3    
        //c  3-> 2 -> 1->0->null
        //t  null
        //l 2
        while(curr != null){            
            ListNode temp = curr.next;
            curr.next = last;
            last = curr;
            curr=temp;                        
        }
        // node: 0
        // next: null
        // last: 1
        return last;
    }
}
