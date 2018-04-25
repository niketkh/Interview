## [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/description/)

Reverse a singly linked list.

## Java Solutions

### Solution 1 - Using Pointers for prevNode and nextNode (Iterative)

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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        
        ListNode prevNode = null;
        ListNode nextNode = head.next;
        
        while(nextNode != null) {
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
            nextNode = head.next;
        }
        
        head.next = prevNode;
        
        return head;
    }
}
```

### Solution 2 - Using Recursion
<img src="recursive-solution.png">

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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }
}
```

### Solution 3 - Similar to Solution 1 (A bit cleaner)
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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        
        ListNode prevNode = null;
        
        while(head != null) {
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        
        head = prevNode;
        return head;
    }
}
```

### Solution 4 - Recursive Solution based on Solution 3
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
    public ListNode reverseList(ListNode head) {
        return _reverseList(head, null);
    }
    
    public ListNode _reverseList(ListNode head, ListNode prevNode) {
        if(head == null) return prevNode;
        
        ListNode next = head.next;
        head.next = prevNode;
        
        return _reverseList(next, head);
    }
}
```

### Solution 5 - Using Stack
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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        
        Stack<ListNode> stack = new Stack<>();
        
        stack.push(null);
        while(head!=null) {
            stack.push(head);
            head = head.next;
        }
        ListNode newHead = stack.pop();
        ListNode curr = newHead;
        
        while(!stack.empty()) {
            curr.next = stack.pop();
            curr = curr.next;
        }
        
        return newHead;
    }
    
}
```