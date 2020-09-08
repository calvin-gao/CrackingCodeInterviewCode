package Ch2LinkedList;
import Ch2LinkedList.removeDup.ListNode;

public class deleteMiddleNode {
    public boolean delMiddleNode(ListNode n){
        if(n == null || n.next == null) return false;
        ListNode next = n.next;
        n.val = next.val;
        n.next = next.next;
        return true;
    }
}
