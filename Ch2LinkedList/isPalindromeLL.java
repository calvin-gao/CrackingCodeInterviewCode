package Ch2LinkedList;

import Ch2LinkedList.removeDup.ListNode;
import java.util.*;
public class isPalindromeLL {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        Stack<ListNode> stack = new Stack<>();

        while(fast.next != null && fast != null){
            stack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null){
            slow = slow.next;
        }

        while(slow != null){
            if(stack.pop().val != slow.val) return false;
            slow = slow.next;
        }
        return true;
    }
}
