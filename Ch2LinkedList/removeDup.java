package Ch2LinkedList;
import java.util.*;

public class removeDup{
     public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void removeDupes(ListNode head){
        HashSet<Integer> seen = new HashSet<Integer>();
        ListNode prev = null;
        ListNode fakeHead = head;
        while(fakeHead != null){
            if(seen.contains(fakeHead.val)){
                prev.next = fakeHead;
            }else{
                seen.add(fakeHead.val);
                prev = fakeHead;
            }
            fakeHead = fakeHead.next;
        }
    }
    public static void main(String args[]){

    }
}