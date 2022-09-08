package Easy;

import Classes.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode rev = new ListNode(head.val);
        head = head.next;

        while(head != null){
            ListNode temp = new ListNode(head.val);
            temp.next = rev;
            rev = temp;
            head = head.next;
        }
        return rev;
    }
}