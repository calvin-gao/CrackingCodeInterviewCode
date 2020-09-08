package Ch2LinkedList;

import Ch2LinkedList.removeDup.ListNode;

public class returnKthLast {
    public static ListNode returnNth(ListNode head, int k){
        ListNode p1 = head;
        ListNode p2 = head;
        for(int i = 0; i < k ; i++){
            if(p1.next == null) return null;
            p1 = p1.next;
        }
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
