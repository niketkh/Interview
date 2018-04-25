class MyLinkedList {
    class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;
    
    public MyLinkedList() {
        head = null;
    }
    
    // Add element at the beginning of list
    public void add(int data) {
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;
    }
    
    // Traversing List Twice and Using Two Pointers
    // Time Complexity : O(n)
    public int getNthNodeFromEnd(int n) {
        int count = 0;
        Node ptr1 = head, ptr2 = head;
        
        if(head == null) return Integer.MIN_VALUE;
        
        while(ptr1 != null) {
            if(count == n)
                ptr2 = ptr2.next;
            else count++;
            ptr1 = ptr1.next;
        }
        
        if(count != n) return Integer.MIN_VALUE;
        else {
            return ptr2.data;
        }
    }
    
    public String toString() {
        Node curr = head;
        StringBuilder sb = new StringBuilder();
        while(curr != null) {
            sb.append(curr.data + " -> ");
            curr = curr.next;
        }
        sb.append("NULL");
        
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        
        for(int i=0; i<10; i++) list.add(i);
        System.out.println(list);
        System.out.println(list.getNthNodeFromEnd(5));
        System.out.println(list.getNthNodeFromEnd(15));
    }
}