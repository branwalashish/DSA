/**
 * problem link : https://leetcode.com/problems/linked-list-cycle/
 * Definition for singly-linked list.
 * 
 * 
 */

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}
public class LinkedList_Cycle_141 {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(slow!= null && fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true; //when cycle detected
            }
        }
        return false; //false when no cycle detected 
    }

  public static void main(String args[]){
   // Create a simple linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        boolean result = hasCycle(head);
        System.out.println("LinkedList has a cycle: " + result);
    
        // Introduce a cycle: connect node 5 to node 2
        head.next.next.next.next.next = head.next; // 5 -> 2

        boolean result = hasCycle(head);
        System.out.println("LinkedList has a cycle: " + result);
    
  }
}
