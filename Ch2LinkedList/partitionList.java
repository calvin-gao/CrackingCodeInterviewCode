package Ch2LinkedList;

import Ch2LinkedList.removeDup.ListNode;

public class partitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode smallerHead = new ListNode(0);
        ListNode biggerHead = new ListNode(0);
        ListNode smaller = smallerHead;
        ListNode bigger = biggerHead;
        while(head != null){
            if(head.val < x){
                smaller.next = head;
                smaller = smaller.next;
            }else{
                bigger.next = head;
                bigger = bigger.next;
            }
            head = head.next;
        }
        bigger.next = null;
        smaller.next = biggerHead.next;
        return smallerHead.next;
    }
}
