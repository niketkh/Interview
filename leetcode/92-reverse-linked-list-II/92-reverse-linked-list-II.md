## 92. Reverse Linked List II

## Java Solutions

#### One Pass and Inplace solution
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null) return head;
        
        int count = 1;
        ListNode prevNode = null, curr = head;
        
        // Get the startNode for part of linked list to reverse
        while(curr != null && count < m) {
            prevNode = curr;
            curr = curr.next;
            count++;
        }
        
        if(curr == null) return head;
        
        ListNode prevToStart = prevNode, startNode = curr;
        prevNode = null;
        
        
        while(curr != null && count >= m && count <= n ) {
            ListNode nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
            count++;
        }
        
        startNode.next = curr;
        // Case where part of linked list to reverse starts from head 
        if(prevToStart == null) {
            return prevNode;
        }
        
        prevToStart.next = prevNode;
        return head;
    }
}
```


#### One Pass, Inplace and Very Clean Solution
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0); // create a dummy node to mark the head of this list
        dummy.next = head;
        ListNode pre = dummy; // make a pointer pre as a marker for the node before reversing
        for(int i = 0; i<m-1; i++) pre = pre.next;

        ListNode start = pre.next; // a pointer to the beginning of a sub-list that will be reversed
        ListNode then = start.next; // a pointer to a node that will be reversed

        // 1 - 2 -3 - 4 - 5 ; m=2; n =4 ---> pre = 1, start = 2, then = 3
        // dummy-> 1 -> 2 -> 3 -> 4 -> 5

        for(int i=0; i<n-m; i++)
        {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }

        // first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
        // second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then = 5 (finish)

        return dummy.next;

    }
}
```