package linkedList;

import Classes.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        ListNode ptr = merged;

        while(list1 != null || list2 != null){
            if(list2 == null || (list1 != null && list1.val <= list2.val)){
                ptr.next = list1;
                list1 = list1.next;
                ptr = ptr.next;
            } else{
                ptr.next = list2;
                list2 = list2.next;
                ptr = ptr.next;
            }
        }
        
        return merged.next;
    }
}
